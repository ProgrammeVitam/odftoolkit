/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 * 
 * Copyright 2009 IBM. All rights reserved.
 * 
 * Use is subject to license terms.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/
package org.odftoolkit.odfdom.doc.table;

import java.util.logging.Logger;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfXMLFactory;
import org.odftoolkit.odfdom.doc.style.OdfStyle;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.dom.element.table.TableTableColumnElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableColumnGroupElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableColumnsElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableHeaderColumnsElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.style.props.OdfTableColumnProperties;
import org.odftoolkit.odfdom.type.PositiveLength;
import org.odftoolkit.odfdom.type.Length.Unit;
import org.w3c.dom.Node;

/**
 * OdfTableColumn represents table column feature in ODF document.
 * <p>
 * OdfTableColumn provides methods to get table cells that belong to this table column.
 */
public class OdfTableColumn {

	//boolean mbVisible;
	TableTableColumnElement maColumnElement;
	int mnRepeatedIndex;
	private XPath xpath;
	private static final String DEFAULT_WIDTH = "0in";
	static private Logger mLog = Logger.getLogger(OdfTableColumn.class.getName());

	/**
	 * Construct the <code>OdfTableColumn</code> feature.
	 * 
	 * @param odfElement
	 * 					the element that can construct this table column
	 * @param repeatedIndex 
	 * 					the index in the repeated columns
	 */
	OdfTableColumn(TableTableColumnElement colElement, int repeatedIndex) {
		maColumnElement = colElement;
		mnRepeatedIndex = repeatedIndex;

		xpath = XPathFactory.newInstance().newXPath();
		xpath.setNamespaceContext(OdfNamespace.newNamespace(OdfNamespaceNames.OFFICE));
	}

	/**
	 * Get the <code>OdfTableColumn</code> instance from the <code>TableTableColumnElement</code> instance.
	 * <p>
	 * Each <code>TableTableColumnElement</code> instance has a one-to-one relationship to the a <code>OdfTableColumn</code> instance.
	 * 
	 * @param colElement	the column element that need to get the corresponding <code>OdfTableColumn</code> instance
	 * @return the <code>OdfTableColumn</code> instance represent the specified column element
	 */
	public static OdfTableColumn getInstance(TableTableColumnElement colElement) {
		TableTableElement tableElement = null;
		Node node = colElement.getParentNode();
		while (node != null) {
			if (node instanceof TableTableElement) {
				tableElement = (TableTableElement) node;
			}
			node = node.getParentNode();
		}
		OdfTable table = null;
		if (tableElement != null) {
			table = OdfTable.getInstance(tableElement);
		} else {
			throw new IllegalArgumentException("the colElement is not in the table dom tree");
		}

		OdfTableColumn column = table.getColumnInstance(colElement, 0);
		if (column.getColumnsRepeatedNumber() > 1) {
			mLog.warning("the column has the repeated column number, and puzzled about get which repeated index of the column,"
					+ "here just return the first column of the repeated columns.");
		}
		return column;
	}

	/**
	 * Get the <code>TableTableElement</code> who contains this cell.
	 * @return the table that contains the cell.
	 */
	private TableTableElement getTableElement() {
		Node node = maColumnElement.getParentNode();
		while (node != null) {
			if (node instanceof TableTableElement) {
				return (TableTableElement) node;
			}
			node = node.getParentNode();
		}
		return null;
	}

	/**
	 * Get owner table of the current column.
	 *
	 * @return
	 * 			the parent table of this column
	 */
	public OdfTable getTable() {
		TableTableElement tableElement = getTableElement();
		if (tableElement != null) {
			return OdfTable.getInstance(tableElement);
		}
		return null;
	}

	/**
	 * Get the width of the column (in 1/100th mm).
	 * 
	 * @return
	 * 			the width of the current column (in 1/100th mm).
	 */
	public long getWidth() {
		String sWidth = maColumnElement.getProperty(OdfTableColumnProperties.ColumnWidth);
		if (sWidth == null) {
			sWidth = DEFAULT_WIDTH;
		}
		return PositiveLength.parseLong(sWidth, Unit.MILLIMETER);
	}

	/**
	 * Set the width of the column (in 1/100th mm).
	 * @param width
	 * 				the width that will be set to the column (in 1/100th mm).
	 */
	public void setWidth(long width) {
		//long originalWidth = getWidth();
		String sWidthMM = String.valueOf(width) + Unit.MILLIMETER.abbr();
		String sWidthIN = PositiveLength.mapToUnit(sWidthMM, Unit.INCH);

		splitRepeatedColumns();
		maColumnElement.setProperty(OdfTableColumnProperties.ColumnWidth, sWidthIN);

		//check if need set relative width
		int index = getColumnIndex();
		if (index >= 1) {
			index = index - 1;
		} else {
			index = index + 1;
		}
		OdfTableColumn column = getTable().getColumnByIndex(index);
		if (column != null) {
			long prevColumnRelWidth = column.getRelativeWidth();
			if (prevColumnRelWidth != 0) {
				long prevColumnWidth = column.getWidth();
				setRelativeWidth(prevColumnRelWidth / prevColumnWidth * width);
			}
		}
	}

	//if one of the repeated column want to change something
	//then this repeated column have to split to repeated number columns
	//the maColumnElement should also be updated according to the original index in the repeated column
	void splitRepeatedColumns() {
		OdfTable table = getTable();
		TableTableElement tableEle = table.getOdfElement();
		int repeateNum = getColumnsRepeatedNumber();
		if (repeateNum > 1) {
			//change this repeated column to several single columns
			TableTableColumnElement ownerColumnElement = null;
			int repeatedColumnIndex = mnRepeatedIndex;
			Node refElement = maColumnElement;
			maColumnElement.removeAttributeNS(OdfNamespaceNames.TABLE.getUri(), "number-columns-repeated");
			String originalWidth = maColumnElement.getProperty(OdfTableColumnProperties.ColumnWidth);
			String originalRelWidth = maColumnElement.getProperty(OdfTableColumnProperties.RelColumnWidth);
			for (int i = repeateNum - 1; i >= 0; i--) {
				//OdfTableColumn newColumn = new OdfTableColumn((OdfFileDom)maColumnElement.getOwnerDocument());
				TableTableColumnElement newColumn = (TableTableColumnElement) OdfXMLFactory.newOdfElement((OdfFileDom) maColumnElement.getOwnerDocument(),
						OdfName.newName(OdfNamespaceNames.TABLE, "table-column"));
//				OdfTableColumn newColumn = (OdfTableColumn) maColumnElement.cloneNode(true);
//				newColumn.removeAttributeNS(OdfNamespace.get(OdfNamespaceNames.TABLE).toString(), "number-columns-repeated" );
				newColumn.setProperty(OdfTableColumnProperties.ColumnWidth, originalWidth);
				newColumn.setProperty(OdfTableColumnProperties.RelColumnWidth, originalRelWidth);
				tableEle.insertBefore(newColumn, refElement);
				refElement = newColumn;
				if (repeatedColumnIndex == i) {
					ownerColumnElement = newColumn;
				} else {
					table.updateColumnRepository(maColumnElement, i, newColumn, 0);
				}
			}
			//remove this column element
			tableEle.removeChild(maColumnElement);

			if (ownerColumnElement != null) {
				table.updateColumnRepository(maColumnElement, mnRepeatedIndex, ownerColumnElement, 0);
			}
		}
	}

	private long getRelativeWidth() {
		String sRelWidth = maColumnElement.getProperty(OdfTableColumnProperties.RelColumnWidth);
		if (sRelWidth != null) {
			if (sRelWidth.contains("*")) {
				Long value = Long.valueOf(sRelWidth.substring(0, sRelWidth.indexOf("*")));
				return value.longValue();
			}
		}
		return 0;
	}

	private void setRelativeWidth(long relWidth) {
		maColumnElement.setProperty(OdfTableColumnProperties.RelColumnWidth, String.valueOf(relWidth) + "*");
	}

	/**
	 * Returns if the column always keeps its optimal width.
	 * @return 
	 * 			true if the column always keeps its optimal width;
	 * 			vice versa
	 */
	public boolean isOptimalWidth() {
		return Boolean.parseBoolean(maColumnElement.getProperty(OdfTableColumnProperties.UseOptimalColumnWidth));
	}

	/**
	 * Set if the column always keeps its optimal width.
	 * 
	 * @param isUseOptimalWidth
	 * 					the flag that indicate column should keep its optimal width or not
	 */
	public void setUseOptimalWidth(boolean isUseOptimalWidth) {
		maColumnElement.setProperty(OdfTableColumnProperties.UseOptimalColumnWidth, String.valueOf(isUseOptimalWidth));
	}

//	/**
//	 * return if the column is visible
//	 * @return 
//	 * 			true if the column is visible
//	 * 			vice versa
//	 */
//	public boolean isVisible()
//	{
//		return mbVisible;
//	}
//	
//	/**
//	 * set if the column is visible
//	 * @param bVisible
//	 * 					the flag that indicate column is visible or not
//	 */
//	public void setVisible(boolean bVisible)
//	{
//		mbVisible = bVisible;
//	}
//	
	/* (non-Javadoc)
	 * @see org.odftoolkit.odfdom.doc.feature.Feature#delete()
	 */
//	public void delete() {
//		// TODO Auto-generated method stub
//		
//	}
	/**
	 * Return an instance of <code>TableTableColumnElement</code> which represents this feature.
	 * 
	 * @return an instance of <code>TableTableColumnElement</code>
	 */
	public TableTableColumnElement getOdfElement() {
		// TODO Auto-generated method stub
		return maColumnElement;
	}

	/**
	 * Get the count of cells in this column.
	 * 
	 * @return 	the cells count in the current column
	 */
	public int getCellCount() {
		return getTable().getRowCount();
	}

	/**
	 * Get a cell with a specific index. The table will be automatically
	 * expanded, when the given index is outside of the original table.
	 * 
	 * @param index
	 *            the cell index in this column
	 * @return the cell object in the given cell index
	 */
	public OdfTableCell getCellByIndex(int index) {
		return getTable().getCellByPosition(getColumnIndex(), index);
	}

	/**
	 * Get the previous column of the current column.
	 *
	 * @return the previous column before this column in the owner table
	 */
	public OdfTableColumn getPreviousColumn() {
		OdfTable table = getTable();
		//the column has repeated column number > 1
		if (maColumnElement.getTableNumberColumnsRepeatedAttribute().intValue() > 1) {
			if (mnRepeatedIndex > 0) {
				return table.getColumnInstance(maColumnElement, mnRepeatedIndex - 1);
			}
		}
		//the column has repeated column number > 1 && the index is 0
		//or the column has repeated column num = 1
		Node aPrevNode = maColumnElement.getPreviousSibling();
		Node aCurNode = maColumnElement;
		while (true) {
			if (aPrevNode == null) {
				//does not have previous sibling, then get the parent
				//because aCurNode might be the child element of table-header-columns, table-columns, table-column-group
				Node parentNode = aCurNode.getParentNode();
				//if the parent is table, then it means that this column is the first column in this table
				//it has no previous column
				if (parentNode instanceof TableTableElement) {
					return null;
				}
				aPrevNode = parentNode.getPreviousSibling();
			}
			//else the parent node might be table-header-columns, table-columns, table-column-group
			if (aPrevNode != null) {
				try {
					if (aPrevNode instanceof TableTableColumnElement) {
						return table.getColumnInstance((TableTableColumnElement) aPrevNode, ((TableTableColumnElement) aPrevNode).getTableNumberColumnsRepeatedAttribute().intValue() - 1);
					} else if (aPrevNode instanceof TableTableColumnsElement
							|| aPrevNode instanceof TableTableHeaderColumnsElement
							|| aPrevNode instanceof TableTableColumnGroupElement) {
						TableTableColumnElement lastCol = (TableTableColumnElement) xpath.evaluate("//table:table-column[last()]", aPrevNode, XPathConstants.NODE);
						if (lastCol != null) {
							return table.getColumnInstance(lastCol, lastCol.getTableNumberColumnsRepeatedAttribute().intValue() - 1);
						}
					} else {
						aCurNode = aPrevNode;
						aPrevNode = aPrevNode.getPreviousSibling();
					}
				} catch (XPathExpressionException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * Get the next column of the current column.
	 *
	 * @return the next column after this column in the owner table
	 */
	public OdfTableColumn getNextColumn() {
		OdfTable table = getTable();
		//the column has repeated column number > 1
		if (getColumnsRepeatedNumber() > 1) {
			if (mnRepeatedIndex < (getColumnsRepeatedNumber() - 1)) {
				return table.getColumnInstance(maColumnElement, mnRepeatedIndex + 1);
			}
		}
		Node aNextNode = maColumnElement.getNextSibling();
		Node aCurNode = maColumnElement;
		while (true) {
			if (aNextNode == null) {
				//does not have next sibling, then get the parent
				//because aCurNode might be the child element of table-header-columns, table-columns, table-column-group
				Node parentNode = aCurNode.getParentNode();
				//if the parent is table, then it means that this column is the last column in this table
				//it has no next column
				if (parentNode instanceof TableTableElement) {
					return null;
				}
				aNextNode = parentNode.getNextSibling();
			}
			//else the parent node might be table-header-columns, table-columns, table-column-group
			if (aNextNode != null) {
				try {
					if (aNextNode instanceof TableTableColumnElement) {
						return table.getColumnInstance((TableTableColumnElement) aNextNode, 0);
					} else if (aNextNode instanceof TableTableColumnsElement
							|| aNextNode instanceof TableTableHeaderColumnsElement
							|| aNextNode instanceof TableTableColumnGroupElement) {
						TableTableColumnElement firstCol = (TableTableColumnElement) xpath.evaluate("//table:table-column[first()]", aNextNode, XPathConstants.NODE);
						if (firstCol != null) {
							return table.getColumnInstance(firstCol, 0);
						}
					} else {
						aCurNode = aNextNode;
						aNextNode = aNextNode.getNextSibling();
					}
				} catch (XPathExpressionException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * Get the index of this column in the owner table.
	 * 
	 * @return the index of the column
	 */
	public int getColumnIndex() {
		int result = 0;
		OdfTable table = getTable();
		TableTableColumnElement columnEle;
		TableTableElement mTableElement = table.getOdfElement();
		for (Node n : new DomNodeList(mTableElement.getChildNodes())) {
			if (n instanceof TableTableHeaderColumnsElement) {
				TableTableHeaderColumnsElement headers = (TableTableHeaderColumnsElement) n;
				for (Node m : new DomNodeList(headers.getChildNodes())) {
					if (m instanceof TableTableColumnElement) {
						columnEle = (TableTableColumnElement) m;
						if (columnEle == getOdfElement()) {
							//break;
							return result + mnRepeatedIndex;
						}
						if (columnEle.getTableNumberColumnsRepeatedAttribute() == null) {
							result += 1;
						} else {
							result += columnEle.getTableNumberColumnsRepeatedAttribute();
						}
					}
				}
			}
			if (n instanceof TableTableColumnElement) {
				columnEle = (TableTableColumnElement) n;
				if (columnEle == getOdfElement()) {
					break;
				}
				if (columnEle.getTableNumberColumnsRepeatedAttribute() == null) {
					result += 1;
				} else {
					result += columnEle.getTableNumberColumnsRepeatedAttribute();
				}
			}
		}
		return result + mnRepeatedIndex;
	}

	/**
	 * Set the default cell style to this column.
	 * <p>
	 * The style should already exist in this document.
	 * @param style
	 * 			the cell style of the document
	 */
	public void setDefaultCellStyle(OdfStyle style) {
		OdfStyle defaultStyle = getDefaultCellStyle();
		if (defaultStyle != null) {
			defaultStyle.removeStyleUser(maColumnElement);
		}

		if (style != null) {
			style.addStyleUser(maColumnElement);
			maColumnElement.setTableDefaultCellStyleNameAttribute(
					style.getStyleNameAttribute());
		}
	}

	/**
	 * Get the default cell style of this column.
	 * @return the default cell style of this column
	 */
	public OdfStyle getDefaultCellStyle() {
		String styleName = maColumnElement.getTableDefaultCellStyleNameAttribute();
		OdfStyle style = maColumnElement.getAutomaticStyles().getStyle(
				styleName, OdfStyleFamily.TableCell);

		if (style == null) {
			style = ((OdfFileDom) maColumnElement.getOwnerDocument()).getOdfDocument().getDocumentStyles().getStyle(styleName, OdfStyleFamily.TableCell);
		}
		return style;
	}

	//note: we have to use this method to modify the column repeated number
	//in order to update mnRepeatedIndex of the each column
	void setColumnsRepeatedNumber(int num) {
		//update the mnRepeatedIndex for the ever repeated column
		maColumnElement.setTableNumberColumnsRepeatedAttribute(Integer.valueOf(num));
	}

	int getColumnsRepeatedNumber() {
		Integer count = maColumnElement.getTableNumberColumnsRepeatedAttribute();
		if (count == null) {
			return 1;
		} else {
			return count.intValue();
		}
	}
}
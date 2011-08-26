/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
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

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.attribute.table.TableApplicationDataAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableButtonsAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableDrillDownOnDoubleClickAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableGrandTotalAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableIdentifyCategoriesAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableIgnoreEmptyRowsAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableShowFilterButtonAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableTargetRangeAddressAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element table:data-pilot-table}.
 *
 */
public class TableDataPilotTableElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "data-pilot-table");

	/**
	 * Create the instance of <code>TableDataPilotTableElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableDataPilotTableElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:data-pilot-table}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableApplicationDataAttribute</code> , See {@odf.attribute table:application-data}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableApplicationDataAttribute() {
		TableApplicationDataAttribute attr = (TableApplicationDataAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "application-data");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableApplicationDataAttribute</code> , See {@odf.attribute table:application-data}
	 *
	 * @param tableApplicationDataValue   The type is <code>String</code>
	 */
	public void setTableApplicationDataAttribute(String tableApplicationDataValue) {
		TableApplicationDataAttribute attr = new TableApplicationDataAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableApplicationDataValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableButtonsAttribute</code> , See {@odf.attribute table:buttons}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableButtonsAttribute() {
		TableButtonsAttribute attr = (TableButtonsAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "buttons");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableButtonsAttribute</code> , See {@odf.attribute table:buttons}
	 *
	 * @param tableButtonsValue   The type is <code>String</code>
	 */
	public void setTableButtonsAttribute(String tableButtonsValue) {
		TableButtonsAttribute attr = new TableButtonsAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableButtonsValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableDrillDownOnDoubleClickAttribute</code> , See {@odf.attribute table:drill-down-on-double-click}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableDrillDownOnDoubleClickAttribute() {
		TableDrillDownOnDoubleClickAttribute attr = (TableDrillDownOnDoubleClickAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "drill-down-on-double-click");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(TableDrillDownOnDoubleClickAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableDrillDownOnDoubleClickAttribute</code> , See {@odf.attribute table:drill-down-on-double-click}
	 *
	 * @param tableDrillDownOnDoubleClickValue   The type is <code>Boolean</code>
	 */
	public void setTableDrillDownOnDoubleClickAttribute(Boolean tableDrillDownOnDoubleClickValue) {
		TableDrillDownOnDoubleClickAttribute attr = new TableDrillDownOnDoubleClickAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(tableDrillDownOnDoubleClickValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableGrandTotalAttribute</code> , See {@odf.attribute table:grand-total}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableGrandTotalAttribute() {
		TableGrandTotalAttribute attr = (TableGrandTotalAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "grand-total");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return TableGrandTotalAttribute.DEFAULT_VALUE;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableGrandTotalAttribute</code> , See {@odf.attribute table:grand-total}
	 *
	 * @param tableGrandTotalValue   The type is <code>String</code>
	 */
	public void setTableGrandTotalAttribute(String tableGrandTotalValue) {
		TableGrandTotalAttribute attr = new TableGrandTotalAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableGrandTotalValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableIdentifyCategoriesAttribute</code> , See {@odf.attribute table:identify-categories}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableIdentifyCategoriesAttribute() {
		TableIdentifyCategoriesAttribute attr = (TableIdentifyCategoriesAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "identify-categories");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(TableIdentifyCategoriesAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableIdentifyCategoriesAttribute</code> , See {@odf.attribute table:identify-categories}
	 *
	 * @param tableIdentifyCategoriesValue   The type is <code>Boolean</code>
	 */
	public void setTableIdentifyCategoriesAttribute(Boolean tableIdentifyCategoriesValue) {
		TableIdentifyCategoriesAttribute attr = new TableIdentifyCategoriesAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(tableIdentifyCategoriesValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableIgnoreEmptyRowsAttribute</code> , See {@odf.attribute table:ignore-empty-rows}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableIgnoreEmptyRowsAttribute() {
		TableIgnoreEmptyRowsAttribute attr = (TableIgnoreEmptyRowsAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "ignore-empty-rows");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(TableIgnoreEmptyRowsAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableIgnoreEmptyRowsAttribute</code> , See {@odf.attribute table:ignore-empty-rows}
	 *
	 * @param tableIgnoreEmptyRowsValue   The type is <code>Boolean</code>
	 */
	public void setTableIgnoreEmptyRowsAttribute(Boolean tableIgnoreEmptyRowsValue) {
		TableIgnoreEmptyRowsAttribute attr = new TableIgnoreEmptyRowsAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(tableIgnoreEmptyRowsValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableNameAttribute</code> , See {@odf.attribute table:name}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableNameAttribute() {
		TableNameAttribute attr = (TableNameAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableNameAttribute</code> , See {@odf.attribute table:name}
	 *
	 * @param tableNameValue   The type is <code>String</code>
	 */
	public void setTableNameAttribute(String tableNameValue) {
		TableNameAttribute attr = new TableNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableShowFilterButtonAttribute</code> , See {@odf.attribute table:show-filter-button}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableShowFilterButtonAttribute() {
		TableShowFilterButtonAttribute attr = (TableShowFilterButtonAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "show-filter-button");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(TableShowFilterButtonAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableShowFilterButtonAttribute</code> , See {@odf.attribute table:show-filter-button}
	 *
	 * @param tableShowFilterButtonValue   The type is <code>Boolean</code>
	 */
	public void setTableShowFilterButtonAttribute(Boolean tableShowFilterButtonValue) {
		TableShowFilterButtonAttribute attr = new TableShowFilterButtonAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(tableShowFilterButtonValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableTargetRangeAddressAttribute</code> , See {@odf.attribute table:target-range-address}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableTargetRangeAddressAttribute() {
		TableTargetRangeAddressAttribute attr = (TableTargetRangeAddressAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "target-range-address");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableTargetRangeAddressAttribute</code> , See {@odf.attribute table:target-range-address}
	 *
	 * @param tableTargetRangeAddressValue   The type is <code>String</code>
	 */
	public void setTableTargetRangeAddressAttribute(String tableTargetRangeAddressValue) {
		TableTargetRangeAddressAttribute attr = new TableTargetRangeAddressAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableTargetRangeAddressValue);
	}

	/**
	 * Create child element {@odf.element table:data-pilot-field}.
	 *
	 * @param tableOrientationValue  the <code>String</code> value of <code>TableOrientationAttribute</code>, see {@odf.attribute  table:orientation} at specification
	 * @param tableSourceFieldNameValue  the <code>String</code> value of <code>TableSourceFieldNameAttribute</code>, see {@odf.attribute  table:source-field-name} at specification
	 * Child element is mandatory.
	 *
	 * @return the element {@odf.element table:data-pilot-field}
	 */
	 public TableDataPilotFieldElement newTableDataPilotFieldElement(String tableOrientationValue, String tableSourceFieldNameValue) {
		TableDataPilotFieldElement tableDataPilotField = ((OdfFileDom) this.ownerDocument).newOdfElement(TableDataPilotFieldElement.class);
		tableDataPilotField.setTableOrientationAttribute(tableOrientationValue);
		tableDataPilotField.setTableSourceFieldNameAttribute(tableSourceFieldNameValue);
		this.appendChild(tableDataPilotField);
		return tableDataPilotField;
	}

	/**
	 * Create child element {@odf.element table:database-source-query}.
	 *
	 * @param tableDatabaseNameValue  the <code>String</code> value of <code>TableDatabaseNameAttribute</code>, see {@odf.attribute  table:database-name} at specification
	 * @param tableQueryNameValue  the <code>String</code> value of <code>TableQueryNameAttribute</code>, see {@odf.attribute  table:query-name} at specification
	 * @return the element {@odf.element table:database-source-query}
	 */
	 public TableDatabaseSourceQueryElement newTableDatabaseSourceQueryElement(String tableDatabaseNameValue, String tableQueryNameValue) {
		TableDatabaseSourceQueryElement tableDatabaseSourceQuery = ((OdfFileDom) this.ownerDocument).newOdfElement(TableDatabaseSourceQueryElement.class);
		tableDatabaseSourceQuery.setTableDatabaseNameAttribute(tableDatabaseNameValue);
		tableDatabaseSourceQuery.setTableQueryNameAttribute(tableQueryNameValue);
		this.appendChild(tableDatabaseSourceQuery);
		return tableDatabaseSourceQuery;
	}

	/**
	 * Create child element {@odf.element table:database-source-sql}.
	 *
	 * @param tableDatabaseNameValue  the <code>String</code> value of <code>TableDatabaseNameAttribute</code>, see {@odf.attribute  table:database-name} at specification
	 * @param tableSqlStatementValue  the <code>String</code> value of <code>TableSqlStatementAttribute</code>, see {@odf.attribute  table:sql-statement} at specification
	 * @return the element {@odf.element table:database-source-sql}
	 */
	 public TableDatabaseSourceSqlElement newTableDatabaseSourceSqlElement(String tableDatabaseNameValue, String tableSqlStatementValue) {
		TableDatabaseSourceSqlElement tableDatabaseSourceSql = ((OdfFileDom) this.ownerDocument).newOdfElement(TableDatabaseSourceSqlElement.class);
		tableDatabaseSourceSql.setTableDatabaseNameAttribute(tableDatabaseNameValue);
		tableDatabaseSourceSql.setTableSqlStatementAttribute(tableSqlStatementValue);
		this.appendChild(tableDatabaseSourceSql);
		return tableDatabaseSourceSql;
	}

	/**
	 * Create child element {@odf.element table:database-source-table}.
	 *
	 * @param tableDatabaseNameValue  the <code>String</code> value of <code>TableDatabaseNameAttribute</code>, see {@odf.attribute  table:database-name} at specification
	 * @param tableDatabaseTableNameValue  the <code>String</code> value of <code>TableDatabaseTableNameAttribute</code>, see {@odf.attribute  table:database-table-name} at specification
	 * @return the element {@odf.element table:database-source-table}
	 */
	 public TableDatabaseSourceTableElement newTableDatabaseSourceTableElement(String tableDatabaseNameValue, String tableDatabaseTableNameValue) {
		TableDatabaseSourceTableElement tableDatabaseSourceTable = ((OdfFileDom) this.ownerDocument).newOdfElement(TableDatabaseSourceTableElement.class);
		tableDatabaseSourceTable.setTableDatabaseNameAttribute(tableDatabaseNameValue);
		tableDatabaseSourceTable.setTableDatabaseTableNameAttribute(tableDatabaseTableNameValue);
		this.appendChild(tableDatabaseSourceTable);
		return tableDatabaseSourceTable;
	}

	/**
	 * Create child element {@odf.element table:source-cell-range}.
	 *
	 * @param tableCellRangeAddressValue  the <code>String</code> value of <code>TableCellRangeAddressAttribute</code>, see {@odf.attribute  table:cell-range-address} at specification
	 * @return the element {@odf.element table:source-cell-range}
	 */
	 public TableSourceCellRangeElement newTableSourceCellRangeElement(String tableCellRangeAddressValue) {
		TableSourceCellRangeElement tableSourceCellRange = ((OdfFileDom) this.ownerDocument).newOdfElement(TableSourceCellRangeElement.class);
		tableSourceCellRange.setTableCellRangeAddressAttribute(tableCellRangeAddressValue);
		this.appendChild(tableSourceCellRange);
		return tableSourceCellRange;
	}

	/**
	 * Create child element {@odf.element table:source-service}.
	 *
	 * @param tableNameValue  the <code>String</code> value of <code>TableNameAttribute</code>, see {@odf.attribute  table:name} at specification
	 * @param tableObjectNameValue  the <code>String</code> value of <code>TableObjectNameAttribute</code>, see {@odf.attribute  table:object-name} at specification
	 * @param tableSourceNameValue  the <code>String</code> value of <code>TableSourceNameAttribute</code>, see {@odf.attribute  table:source-name} at specification
	 * @return the element {@odf.element table:source-service}
	 */
	 public TableSourceServiceElement newTableSourceServiceElement(String tableNameValue, String tableObjectNameValue, String tableSourceNameValue) {
		TableSourceServiceElement tableSourceService = ((OdfFileDom) this.ownerDocument).newOdfElement(TableSourceServiceElement.class);
		tableSourceService.setTableNameAttribute(tableNameValue);
		tableSourceService.setTableObjectNameAttribute(tableObjectNameValue);
		tableSourceService.setTableSourceNameAttribute(tableSourceNameValue);
		this.appendChild(tableSourceService);
		return tableSourceService;
	}

	@Override
	public void accept(ElementVisitor visitor) {
		if (visitor instanceof DefaultElementVisitor) {
			DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
			defaultVisitor.visit(this);
		} else {
			visitor.visit(this);
		}
	}
}

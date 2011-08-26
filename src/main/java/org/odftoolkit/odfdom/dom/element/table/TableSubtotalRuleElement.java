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
import org.odftoolkit.odfdom.dom.attribute.table.TableGroupByFieldNumberAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element table:subtotal-rule}.
 *
 */
public class TableSubtotalRuleElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "subtotal-rule");

	/**
	 * Create the instance of <code>TableSubtotalRuleElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableSubtotalRuleElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:subtotal-rule}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableGroupByFieldNumberAttribute</code> , See {@odf.attribute table:group-by-field-number}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTableGroupByFieldNumberAttribute() {
		TableGroupByFieldNumberAttribute attr = (TableGroupByFieldNumberAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "group-by-field-number");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableGroupByFieldNumberAttribute</code> , See {@odf.attribute table:group-by-field-number}
	 *
	 * @param tableGroupByFieldNumberValue   The type is <code>Integer</code>
	 */
	public void setTableGroupByFieldNumberAttribute(Integer tableGroupByFieldNumberValue) {
		TableGroupByFieldNumberAttribute attr = new TableGroupByFieldNumberAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(tableGroupByFieldNumberValue.intValue());
	}

	/**
	 * Create child element {@odf.element table:subtotal-field}.
	 *
	 * @param tableFieldNumberValue  the <code>Integer</code> value of <code>TableFieldNumberAttribute</code>, see {@odf.attribute  table:field-number} at specification
	 * @param tableFunctionValue  the <code>String</code> value of <code>TableFunctionAttribute</code>, see {@odf.attribute  table:function} at specification
	 * @return the element {@odf.element table:subtotal-field}
	 */
	 public TableSubtotalFieldElement newTableSubtotalFieldElement(int tableFieldNumberValue, String tableFunctionValue) {
		TableSubtotalFieldElement tableSubtotalField = ((OdfFileDom) this.ownerDocument).newOdfElement(TableSubtotalFieldElement.class);
		tableSubtotalField.setTableFieldNumberAttribute(tableFieldNumberValue);
		tableSubtotalField.setTableFunctionAttribute(tableFunctionValue);
		this.appendChild(tableSubtotalField);
		return tableSubtotalField;
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

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

package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.text.TextIndexScopeAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextRelativeTabStopPositionAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextUseIndexMarksAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextUseIndexSourceStylesAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextUseGraphicsAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextUseTablesAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextUseFloatingFramesAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextUseObjectsAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextCopyOutlineLevelsAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextIndexNameAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element text:user-index-source}.
 *
 */
public class TextUserIndexSourceElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.TEXT, "user-index-source" );


	/**
	 * Create the instance of <code>TextUserIndexSourceElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextUserIndexSourceElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:user-index-source}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TextUserIndexSourceElement}
	 *
     * @param textIndexNameAttributeValue  The mandatory attribute {@odf.attribute  text:index-name}"
     *
	 */
	public void init(String textIndexNameAttributeValue)
	{
		setTextIndexNameAttribute( textIndexNameAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextIndexScopeAttribute</code> , See {@odf.attribute text:index-scope}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextIndexScopeAttribute()
	{
		TextIndexScopeAttribute attr = (TextIndexScopeAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "index-scope" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return TextIndexScopeAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextIndexScopeAttribute</code> , See {@odf.attribute text:index-scope}
	 *
	 * @param textIndexScopeValue   The type is <code>String</code>
	 */
	public void setTextIndexScopeAttribute( String textIndexScopeValue )
	{
		TextIndexScopeAttribute attr =  new TextIndexScopeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textIndexScopeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextRelativeTabStopPositionAttribute</code> , See {@odf.attribute text:relative-tab-stop-position}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextRelativeTabStopPositionAttribute()
	{
		TextRelativeTabStopPositionAttribute attr = (TextRelativeTabStopPositionAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "relative-tab-stop-position" ) ;
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TextRelativeTabStopPositionAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextRelativeTabStopPositionAttribute</code> , See {@odf.attribute text:relative-tab-stop-position}
	 *
	 * @param textRelativeTabStopPositionValue   The type is <code>Boolean</code>
	 */
	public void setTextRelativeTabStopPositionAttribute( Boolean textRelativeTabStopPositionValue )
	{
		TextRelativeTabStopPositionAttribute attr =  new TextRelativeTabStopPositionAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( textRelativeTabStopPositionValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextUseIndexMarksAttribute</code> , See {@odf.attribute text:use-index-marks}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextUseIndexMarksAttribute()
	{
		TextUseIndexMarksAttribute attr = (TextUseIndexMarksAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "use-index-marks" ) ;
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TextUseIndexMarksAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextUseIndexMarksAttribute</code> , See {@odf.attribute text:use-index-marks}
	 *
	 * @param textUseIndexMarksValue   The type is <code>Boolean</code>
	 */
	public void setTextUseIndexMarksAttribute( Boolean textUseIndexMarksValue )
	{
		TextUseIndexMarksAttribute attr =  new TextUseIndexMarksAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( textUseIndexMarksValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextUseIndexSourceStylesAttribute</code> , See {@odf.attribute text:use-index-source-styles}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextUseIndexSourceStylesAttribute()
	{
		TextUseIndexSourceStylesAttribute attr = (TextUseIndexSourceStylesAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "use-index-source-styles" ) ;
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TextUseIndexSourceStylesAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextUseIndexSourceStylesAttribute</code> , See {@odf.attribute text:use-index-source-styles}
	 *
	 * @param textUseIndexSourceStylesValue   The type is <code>Boolean</code>
	 */
	public void setTextUseIndexSourceStylesAttribute( Boolean textUseIndexSourceStylesValue )
	{
		TextUseIndexSourceStylesAttribute attr =  new TextUseIndexSourceStylesAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( textUseIndexSourceStylesValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextUseGraphicsAttribute</code> , See {@odf.attribute text:use-graphics}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextUseGraphicsAttribute()
	{
		TextUseGraphicsAttribute attr = (TextUseGraphicsAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "use-graphics" ) ;
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TextUseGraphicsAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextUseGraphicsAttribute</code> , See {@odf.attribute text:use-graphics}
	 *
	 * @param textUseGraphicsValue   The type is <code>Boolean</code>
	 */
	public void setTextUseGraphicsAttribute( Boolean textUseGraphicsValue )
	{
		TextUseGraphicsAttribute attr =  new TextUseGraphicsAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( textUseGraphicsValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextUseTablesAttribute</code> , See {@odf.attribute text:use-tables}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextUseTablesAttribute()
	{
		TextUseTablesAttribute attr = (TextUseTablesAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "use-tables" ) ;
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TextUseTablesAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextUseTablesAttribute</code> , See {@odf.attribute text:use-tables}
	 *
	 * @param textUseTablesValue   The type is <code>Boolean</code>
	 */
	public void setTextUseTablesAttribute( Boolean textUseTablesValue )
	{
		TextUseTablesAttribute attr =  new TextUseTablesAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( textUseTablesValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextUseFloatingFramesAttribute</code> , See {@odf.attribute text:use-floating-frames}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextUseFloatingFramesAttribute()
	{
		TextUseFloatingFramesAttribute attr = (TextUseFloatingFramesAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "use-floating-frames" ) ;
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TextUseFloatingFramesAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextUseFloatingFramesAttribute</code> , See {@odf.attribute text:use-floating-frames}
	 *
	 * @param textUseFloatingFramesValue   The type is <code>Boolean</code>
	 */
	public void setTextUseFloatingFramesAttribute( Boolean textUseFloatingFramesValue )
	{
		TextUseFloatingFramesAttribute attr =  new TextUseFloatingFramesAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( textUseFloatingFramesValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextUseObjectsAttribute</code> , See {@odf.attribute text:use-objects}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextUseObjectsAttribute()
	{
		TextUseObjectsAttribute attr = (TextUseObjectsAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "use-objects" ) ;
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TextUseObjectsAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextUseObjectsAttribute</code> , See {@odf.attribute text:use-objects}
	 *
	 * @param textUseObjectsValue   The type is <code>Boolean</code>
	 */
	public void setTextUseObjectsAttribute( Boolean textUseObjectsValue )
	{
		TextUseObjectsAttribute attr =  new TextUseObjectsAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( textUseObjectsValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextCopyOutlineLevelsAttribute</code> , See {@odf.attribute text:copy-outline-levels}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextCopyOutlineLevelsAttribute()
	{
		TextCopyOutlineLevelsAttribute attr = (TextCopyOutlineLevelsAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "copy-outline-levels" ) ;
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( TextCopyOutlineLevelsAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextCopyOutlineLevelsAttribute</code> , See {@odf.attribute text:copy-outline-levels}
	 *
	 * @param textCopyOutlineLevelsValue   The type is <code>Boolean</code>
	 */
	public void setTextCopyOutlineLevelsAttribute( Boolean textCopyOutlineLevelsValue )
	{
		TextCopyOutlineLevelsAttribute attr =  new TextCopyOutlineLevelsAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( textCopyOutlineLevelsValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextIndexNameAttribute</code> , See {@odf.attribute text:index-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextIndexNameAttribute()
	{
		TextIndexNameAttribute attr = (TextIndexNameAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "index-name" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextIndexNameAttribute</code> , See {@odf.attribute text:index-name}
	 *
	 * @param textIndexNameValue   The type is <code>String</code>
	 */
	public void setTextIndexNameAttribute( String textIndexNameValue )
	{
		TextIndexNameAttribute attr =  new TextIndexNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textIndexNameValue );
	}

	/**
	 * Create child element {@odf.element text:index-title-template}.
	 *
	 * @return   return  the element {@odf.element text:index-title-template}
	 * DifferentQName 
	 */
	public TextIndexTitleTemplateElement newTextIndexTitleTemplateElement()
	{
		TextIndexTitleTemplateElement  textIndexTitleTemplate = ((OdfFileDom)this.ownerDocument).newOdfElement(TextIndexTitleTemplateElement.class);
		this.appendChild( textIndexTitleTemplate);
		return  textIndexTitleTemplate;
	}                   
               
	/**
	 * Create child element {@odf.element text:user-index-entry-template}.
	 *
     * @param textOutlineLevelAttributeValue  the <code>String</code> value of <code>TextOutlineLevelAttribute</code>, see {@odf.attribute  text:outline-level} at specification
	 * @param textStyleNameAttributeValue  the <code>String</code> value of <code>TextStyleNameAttribute</code>, see {@odf.attribute  text:style-name} at specification
	 * @return   return  the element {@odf.element text:user-index-entry-template}
	 * DifferentQName 
	 */
    
	public TextUserIndexEntryTemplateElement newTextUserIndexEntryTemplateElement(String textOutlineLevelAttributeValue, String textStyleNameAttributeValue)
	{
		TextUserIndexEntryTemplateElement  textUserIndexEntryTemplate = ((OdfFileDom)this.ownerDocument).newOdfElement(TextUserIndexEntryTemplateElement.class);
		textUserIndexEntryTemplate.setTextOutlineLevelAttribute( textOutlineLevelAttributeValue );
		textUserIndexEntryTemplate.setTextStyleNameAttribute( textStyleNameAttributeValue );
		this.appendChild( textUserIndexEntryTemplate);
		return  textUserIndexEntryTemplate;      
	}
    
	/**
	 * Create child element {@odf.element text:index-source-styles}.
	 *
     * @param textOutlineLevelAttributeValue  the <code>String</code> value of <code>TextOutlineLevelAttribute</code>, see {@odf.attribute  text:outline-level} at specification
	 * @return   return  the element {@odf.element text:index-source-styles}
	 * DifferentQName 
	 */
    
	public TextIndexSourceStylesElement newTextIndexSourceStylesElement(String textOutlineLevelAttributeValue)
	{
		TextIndexSourceStylesElement  textIndexSourceStyles = ((OdfFileDom)this.ownerDocument).newOdfElement(TextIndexSourceStylesElement.class);
		textIndexSourceStyles.setTextOutlineLevelAttribute( textOutlineLevelAttributeValue );
		this.appendChild( textIndexSourceStyles);
		return  textIndexSourceStyles;      
	}
    
}
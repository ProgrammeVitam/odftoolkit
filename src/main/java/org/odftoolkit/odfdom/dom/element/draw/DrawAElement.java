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

package org.odftoolkit.odfdom.dom.element.draw;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkHrefAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkActuateAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeTargetFrameNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkShowAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeTitleAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeServerMapAttribute;
import org.odftoolkit.odfdom.dom.attribute.xml.XmlIdAttribute;

import org.odftoolkit.odfdom.dom.element.dr3d.Dr3dSceneElement;

/**
 * DOM implementation of OpenDocument element  {@odf.element draw:a}.
 *
 */
public class DrawAElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.DRAW, "a" );

	/**
	 * The value set of {@odf.attribute xlink:actuate}.
	 */
	 public enum XlinkActuateAttributeValue {
	 
	 ONREQUEST( XlinkActuateAttribute.Value.ONREQUEST.toString() );
              
		private String mValue;
	 	
		XlinkActuateAttributeValue( String value )
		{
			mValue = value;
		}
		
		@Override
		public String toString()
		{
			return mValue;
		}
		
		public static XlinkActuateAttributeValue enumValueOf( String value )
	    {
	        for( XlinkActuateAttributeValue aIter : values() )
	        {
	            if( value.equals( aIter.toString() ) )
	            {
	                return aIter;
	            }
	        }
	        return null;
	    }
	}
	/**
	 * The value set of {@odf.attribute xlink:show}.
	 */
	 public enum XlinkShowAttributeValue {
	 
	 NEW( XlinkShowAttribute.Value.NEW.toString() ), REPLACE( XlinkShowAttribute.Value.REPLACE.toString() );
              
		private String mValue;
	 	
		XlinkShowAttributeValue( String value )
		{
			mValue = value;
		}
		
		@Override
		public String toString()
		{
			return mValue;
		}
		
		public static XlinkShowAttributeValue enumValueOf( String value )
	    {
	        for( XlinkShowAttributeValue aIter : values() )
	        {
	            if( value.equals( aIter.toString() ) )
	            {
	                return aIter;
	            }
	        }
	        return null;
	    }
	}
	public static final String  DEFAULT_VALUE_XLINK_ACTUATE_ATTRIBUTE = XlinkActuateAttribute.Value.ONREQUEST.toString();

	/**
	 * Create the instance of <code>DrawAElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DrawAElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element draw:a}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  DrawAElement}
	 *
     * @param xlinkTypeAttributeValue  The mandatory attribute {@odf.attribute  xlink:type}"
     * @param xlinkHrefAttributeValue  The mandatory attribute {@odf.attribute  xlink:href}"
     *
	 */
	public void init(String xlinkTypeAttributeValue, String xlinkHrefAttributeValue)
	{
		setXlinkTypeAttribute( xlinkTypeAttributeValue );
		setXlinkHrefAttribute( xlinkHrefAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkTypeAttribute</code> , See {@odf.attribute xlink:type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkTypeAttribute()
	{
		XlinkTypeAttribute attr = (XlinkTypeAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.XLINK), "type" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return XlinkTypeAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkTypeAttribute</code> , See {@odf.attribute xlink:type}
	 *
	 * @param xlinkTypeValue   The type is <code>String</code>
	 */
	public void setXlinkTypeAttribute( String xlinkTypeValue )
	{
		XlinkTypeAttribute attr =  new XlinkTypeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xlinkTypeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkHrefAttribute</code> , See {@odf.attribute xlink:href}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkHrefAttribute()
	{
		XlinkHrefAttribute attr = (XlinkHrefAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.XLINK), "href" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkHrefAttribute</code> , See {@odf.attribute xlink:href}
	 *
	 * @param xlinkHrefValue   The type is <code>String</code>
	 */
	public void setXlinkHrefAttribute( String xlinkHrefValue )
	{
		XlinkHrefAttribute attr =  new XlinkHrefAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xlinkHrefValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkActuateAttribute</code> , See {@odf.attribute xlink:actuate}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkActuateAttribute()
	{
		XlinkActuateAttribute attr = (XlinkActuateAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.XLINK), "actuate" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return DEFAULT_VALUE_XLINK_ACTUATE_ATTRIBUTE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkActuateAttribute</code> , See {@odf.attribute xlink:actuate}
	 *
	 * @param xlinkActuateValue   The type is <code>String</code>
	 */
	public void setXlinkActuateAttribute( String xlinkActuateValue )
	{
		XlinkActuateAttribute attr =  new XlinkActuateAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xlinkActuateValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeTargetFrameNameAttribute</code> , See {@odf.attribute office:target-frame-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getOfficeTargetFrameNameAttribute()
	{
		OfficeTargetFrameNameAttribute attr = (OfficeTargetFrameNameAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.OFFICE), "target-frame-name" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeTargetFrameNameAttribute</code> , See {@odf.attribute office:target-frame-name}
	 *
	 * @param officeTargetFrameNameValue   The type is <code>String</code>
	 */
	public void setOfficeTargetFrameNameAttribute( String officeTargetFrameNameValue )
	{
		OfficeTargetFrameNameAttribute attr =  new OfficeTargetFrameNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( officeTargetFrameNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkShowAttribute</code> , See {@odf.attribute xlink:show}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkShowAttribute()
	{
		XlinkShowAttribute attr = (XlinkShowAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.XLINK), "show" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkShowAttribute</code> , See {@odf.attribute xlink:show}
	 *
	 * @param xlinkShowValue   The type is <code>String</code>
	 */
	public void setXlinkShowAttribute( String xlinkShowValue )
	{
		XlinkShowAttribute attr =  new XlinkShowAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xlinkShowValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeNameAttribute</code> , See {@odf.attribute office:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getOfficeNameAttribute()
	{
		OfficeNameAttribute attr = (OfficeNameAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.OFFICE), "name" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeNameAttribute</code> , See {@odf.attribute office:name}
	 *
	 * @param officeNameValue   The type is <code>String</code>
	 */
	public void setOfficeNameAttribute( String officeNameValue )
	{
		OfficeNameAttribute attr =  new OfficeNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( officeNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeTitleAttribute</code> , See {@odf.attribute office:title}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getOfficeTitleAttribute()
	{
		OfficeTitleAttribute attr = (OfficeTitleAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.OFFICE), "title" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeTitleAttribute</code> , See {@odf.attribute office:title}
	 *
	 * @param officeTitleValue   The type is <code>String</code>
	 */
	public void setOfficeTitleAttribute( String officeTitleValue )
	{
		OfficeTitleAttribute attr =  new OfficeTitleAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( officeTitleValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeServerMapAttribute</code> , See {@odf.attribute office:server-map}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getOfficeServerMapAttribute()
	{
		OfficeServerMapAttribute attr = (OfficeServerMapAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.OFFICE), "server-map" ) ;
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( OfficeServerMapAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeServerMapAttribute</code> , See {@odf.attribute office:server-map}
	 *
	 * @param officeServerMapValue   The type is <code>Boolean</code>
	 */
	public void setOfficeServerMapAttribute( Boolean officeServerMapValue )
	{
		OfficeServerMapAttribute attr =  new OfficeServerMapAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( officeServerMapValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>XmlIdAttribute</code> , See {@odf.attribute xml:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXmlIdAttribute()
	{
		XmlIdAttribute attr = (XmlIdAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfNamespaceNames.XML), "id" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XmlIdAttribute</code> , See {@odf.attribute xml:id}
	 *
	 * @param xmlIdValue   The type is <code>String</code>
	 */
	public void setXmlIdAttribute( String xmlIdValue )
	{
		XmlIdAttribute attr =  new XmlIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xmlIdValue );
	}

	/**
	 * Create child element {@odf.element draw:rect}.
	 *
	 * @return   return  the element {@odf.element draw:rect}
	 * DifferentQName 
	 */
	public DrawRectElement newDrawRectElement()
	{
		DrawRectElement  drawRect = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawRectElement.class);
		this.appendChild( drawRect);
		return  drawRect;
	}                   
               
	/**
	 * Create child element {@odf.element draw:line}.
	 *
     * @param svgX1AttributeValue  the <code>String</code> value of <code>SvgX1Attribute</code>, see {@odf.attribute  svg:x1} at specification
	 * @param svgX2AttributeValue  the <code>String</code> value of <code>SvgX2Attribute</code>, see {@odf.attribute  svg:x2} at specification
	 * @param svgY1AttributeValue  the <code>String</code> value of <code>SvgY1Attribute</code>, see {@odf.attribute  svg:y1} at specification
	 * @param svgY2AttributeValue  the <code>String</code> value of <code>SvgY2Attribute</code>, see {@odf.attribute  svg:y2} at specification
	 * @return   return  the element {@odf.element draw:line}
	 * DifferentQName 
	 */
    
	public DrawLineElement newDrawLineElement(String svgX1AttributeValue, String svgX2AttributeValue, String svgY1AttributeValue, String svgY2AttributeValue)
	{
		DrawLineElement  drawLine = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawLineElement.class);
		drawLine.setSvgX1Attribute( svgX1AttributeValue );
		drawLine.setSvgX2Attribute( svgX2AttributeValue );
		drawLine.setSvgY1Attribute( svgY1AttributeValue );
		drawLine.setSvgY2Attribute( svgY2AttributeValue );
		this.appendChild( drawLine);
		return  drawLine;      
	}
    
	/**
	 * Create child element {@odf.element draw:polyline}.
	 *
     * @param drawPointsAttributeValue  the <code>String</code> value of <code>DrawPointsAttribute</code>, see {@odf.attribute  draw:points} at specification
	 * @param svgViewBoxAttributeValue  the <code>String</code> value of <code>SvgViewBoxAttribute</code>, see {@odf.attribute  svg:viewBox} at specification
	 * @return   return  the element {@odf.element draw:polyline}
	 * DifferentQName 
	 */
    
	public DrawPolylineElement newDrawPolylineElement(String drawPointsAttributeValue, String svgViewBoxAttributeValue)
	{
		DrawPolylineElement  drawPolyline = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawPolylineElement.class);
		drawPolyline.setDrawPointsAttribute( drawPointsAttributeValue );
		drawPolyline.setSvgViewBoxAttribute( svgViewBoxAttributeValue );
		this.appendChild( drawPolyline);
		return  drawPolyline;      
	}
    
	/**
	 * Create child element {@odf.element draw:polygon}.
	 *
     * @param drawPointsAttributeValue  the <code>String</code> value of <code>DrawPointsAttribute</code>, see {@odf.attribute  draw:points} at specification
	 * @param svgViewBoxAttributeValue  the <code>String</code> value of <code>SvgViewBoxAttribute</code>, see {@odf.attribute  svg:viewBox} at specification
	 * @return   return  the element {@odf.element draw:polygon}
	 * DifferentQName 
	 */
    
	public DrawPolygonElement newDrawPolygonElement(String drawPointsAttributeValue, String svgViewBoxAttributeValue)
	{
		DrawPolygonElement  drawPolygon = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawPolygonElement.class);
		drawPolygon.setDrawPointsAttribute( drawPointsAttributeValue );
		drawPolygon.setSvgViewBoxAttribute( svgViewBoxAttributeValue );
		this.appendChild( drawPolygon);
		return  drawPolygon;      
	}
    
	/**
	 * Create child element {@odf.element draw:regular-polygon}.
	 *
     * @param drawConcaveAttributeValue  the <code>boolean</code> value of <code>DrawConcaveAttribute</code>, see {@odf.attribute  draw:concave} at specification
	 * @param drawCornersAttributeValue  the <code>int</code> value of <code>DrawCornersAttribute</code>, see {@odf.attribute  draw:corners} at specification
	 * @return   return  the element {@odf.element draw:regular-polygon}
	 * DifferentQName 
	 */
    
	public DrawRegularPolygonElement newDrawRegularPolygonElement(boolean drawConcaveAttributeValue, int drawCornersAttributeValue)
	{
		DrawRegularPolygonElement  drawRegularPolygon = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawRegularPolygonElement.class);
		drawRegularPolygon.setDrawConcaveAttribute( Boolean.valueOf(drawConcaveAttributeValue) );
		drawRegularPolygon.setDrawCornersAttribute( Integer.valueOf(drawCornersAttributeValue) );
		this.appendChild( drawRegularPolygon);
		return  drawRegularPolygon;      
	}
    
	/**
	 * Create child element {@odf.element draw:path}.
	 *
     * @param svgDAttributeValue  the <code>String</code> value of <code>SvgDAttribute</code>, see {@odf.attribute  svg:d} at specification
	 * @param svgViewBoxAttributeValue  the <code>String</code> value of <code>SvgViewBoxAttribute</code>, see {@odf.attribute  svg:viewBox} at specification
	 * @return   return  the element {@odf.element draw:path}
	 * DifferentQName 
	 */
    
	public DrawPathElement newDrawPathElement(String svgDAttributeValue, String svgViewBoxAttributeValue)
	{
		DrawPathElement  drawPath = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawPathElement.class);
		drawPath.setSvgDAttribute( svgDAttributeValue );
		drawPath.setSvgViewBoxAttribute( svgViewBoxAttributeValue );
		this.appendChild( drawPath);
		return  drawPath;      
	}
    
	/**
	 * Create child element {@odf.element draw:circle}.
	 *
	 * @return   return  the element {@odf.element draw:circle}
	 * DifferentQName 
	 */
	public DrawCircleElement newDrawCircleElement()
	{
		DrawCircleElement  drawCircle = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawCircleElement.class);
		this.appendChild( drawCircle);
		return  drawCircle;
	}                   
               
	/**
	 * Create child element {@odf.element draw:ellipse}.
	 *
	 * @return   return  the element {@odf.element draw:ellipse}
	 * DifferentQName 
	 */
	public DrawEllipseElement newDrawEllipseElement()
	{
		DrawEllipseElement  drawEllipse = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawEllipseElement.class);
		this.appendChild( drawEllipse);
		return  drawEllipse;
	}                   
               
	/**
	 * Create child element {@odf.element draw:g}.
	 *
	 * @return   return  the element {@odf.element draw:g}
	 * DifferentQName 
	 */
	public DrawGElement newDrawGElement()
	{
		DrawGElement  drawG = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawGElement.class);
		this.appendChild( drawG);
		return  drawG;
	}                   
               
	/**
	 * Create child element {@odf.element draw:page-thumbnail}.
	 *
	 * @return   return  the element {@odf.element draw:page-thumbnail}
	 * DifferentQName 
	 */
	public DrawPageThumbnailElement newDrawPageThumbnailElement()
	{
		DrawPageThumbnailElement  drawPageThumbnail = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawPageThumbnailElement.class);
		this.appendChild( drawPageThumbnail);
		return  drawPageThumbnail;
	}                   
               
	/**
	 * Create child element {@odf.element draw:frame}.
	 *
	 * @return   return  the element {@odf.element draw:frame}
	 * DifferentQName 
	 */
	public DrawFrameElement newDrawFrameElement()
	{
		DrawFrameElement  drawFrame = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawFrameElement.class);
		this.appendChild( drawFrame);
		return  drawFrame;
	}                   
               
	/**
	 * Create child element {@odf.element draw:measure}.
	 *
     * @param svgX1AttributeValue  the <code>String</code> value of <code>SvgX1Attribute</code>, see {@odf.attribute  svg:x1} at specification
	 * @param svgX2AttributeValue  the <code>String</code> value of <code>SvgX2Attribute</code>, see {@odf.attribute  svg:x2} at specification
	 * @param svgY1AttributeValue  the <code>String</code> value of <code>SvgY1Attribute</code>, see {@odf.attribute  svg:y1} at specification
	 * @param svgY2AttributeValue  the <code>String</code> value of <code>SvgY2Attribute</code>, see {@odf.attribute  svg:y2} at specification
	 * @return   return  the element {@odf.element draw:measure}
	 * DifferentQName 
	 */
    
	public DrawMeasureElement newDrawMeasureElement(String svgX1AttributeValue, String svgX2AttributeValue, String svgY1AttributeValue, String svgY2AttributeValue)
	{
		DrawMeasureElement  drawMeasure = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawMeasureElement.class);
		drawMeasure.setSvgX1Attribute( svgX1AttributeValue );
		drawMeasure.setSvgX2Attribute( svgX2AttributeValue );
		drawMeasure.setSvgY1Attribute( svgY1AttributeValue );
		drawMeasure.setSvgY2Attribute( svgY2AttributeValue );
		this.appendChild( drawMeasure);
		return  drawMeasure;      
	}
    
	/**
	 * Create child element {@odf.element draw:caption}.
	 *
	 * @return   return  the element {@odf.element draw:caption}
	 * DifferentQName 
	 */
	public DrawCaptionElement newDrawCaptionElement()
	{
		DrawCaptionElement  drawCaption = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawCaptionElement.class);
		this.appendChild( drawCaption);
		return  drawCaption;
	}                   
               
	/**
	 * Create child element {@odf.element draw:connector}.
	 *
     * @param svgViewBoxAttributeValue  the <code>String</code> value of <code>SvgViewBoxAttribute</code>, see {@odf.attribute  svg:viewBox} at specification
	 * @return   return  the element {@odf.element draw:connector}
	 * DifferentQName 
	 */
    
	public DrawConnectorElement newDrawConnectorElement(String svgViewBoxAttributeValue)
	{
		DrawConnectorElement  drawConnector = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawConnectorElement.class);
		drawConnector.setSvgViewBoxAttribute( svgViewBoxAttributeValue );
		this.appendChild( drawConnector);
		return  drawConnector;      
	}
    
	/**
	 * Create child element {@odf.element draw:control}.
	 *
     * @param drawControlAttributeValue  the <code>String</code> value of <code>DrawControlAttribute</code>, see {@odf.attribute  draw:control} at specification
	 * @return   return  the element {@odf.element draw:control}
	 * DifferentQName 
	 */
    
	public DrawControlElement newDrawControlElement(String drawControlAttributeValue)
	{
		DrawControlElement  drawControl = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawControlElement.class);
		drawControl.setDrawControlAttribute( drawControlAttributeValue );
		this.appendChild( drawControl);
		return  drawControl;      
	}
    
	/**
	 * Create child element {@odf.element dr3d:scene}.
	 *
	 * @return   return  the element {@odf.element dr3d:scene}
	 * DifferentQName 
	 */
	public Dr3dSceneElement newDr3dSceneElement()
	{
		Dr3dSceneElement  dr3dScene = ((OdfFileDom)this.ownerDocument).newOdfElement(Dr3dSceneElement.class);
		this.appendChild( dr3dScene);
		return  dr3dScene;
	}                   
               
	/**
	 * Create child element {@odf.element draw:custom-shape}.
	 *
	 * @return   return  the element {@odf.element draw:custom-shape}
	 * DifferentQName 
	 */
	public DrawCustomShapeElement newDrawCustomShapeElement()
	{
		DrawCustomShapeElement  drawCustomShape = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawCustomShapeElement.class);
		this.appendChild( drawCustomShape);
		return  drawCustomShape;
	}                   
               
}
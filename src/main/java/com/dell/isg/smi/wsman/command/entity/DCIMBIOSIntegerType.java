/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.30 at 09:33:26 AM CDT 
//

package com.dell.isg.smi.wsman.command.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * <p>
 * Java class for DCIM_BIOSInteger_Type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DCIM_BIOSInteger_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_BIOSInteger}AttributeDisplayName"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_BIOSInteger}AttributeName"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_BIOSInteger}Caption" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_BIOSInteger}CurrentValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_BIOSInteger}DefaultValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_BIOSInteger}Dependency" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_BIOSInteger}DisplayOrder" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_BIOSInteger}Description" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_BIOSInteger}ElementName" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_BIOSInteger}FQDD" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_BIOSInteger}GroupDisplayName" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_BIOSInteger}GroupID" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_BIOSInteger}Generation" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_BIOSInteger}InstanceID"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_BIOSInteger}IsOrderedList" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_BIOSInteger}IsReadOnly" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_BIOSInteger}LowerBound" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_BIOSInteger}PendingValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_BIOSInteger}ProgrammaticUnit" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_BIOSInteger}ScalarIncrement" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_BIOSInteger}UpperBound" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DCIM_BIOSInteger_Type", namespace = "http://schemas.dell.com/wbem/wscim/1/cim-schema/2/DCIM_BIOSInteger", propOrder = { "attributeDisplayName", "attributeName", "caption", "currentValue", "defaultValue", "dependency", "displayOrder", "description", "elementName", "fqdd", "groupDisplayName", "groupID", "generation", "instanceID", "isOrderedList", "isReadOnly", "lowerBound", "pendingValue", "programmaticUnit", "scalarIncrement", "upperBound", "any" })
public class DCIMBIOSIntegerType {

    @XmlElement(name = "AttributeDisplayName", required = true)
    protected CimString attributeDisplayName;
    @XmlElement(name = "AttributeName", required = true)
    protected CimString attributeName;
    @XmlElement(name = "Caption", nillable = true)
    protected Caption caption;
    @XmlElement(name = "CurrentValue", nillable = true)
    protected List<CimString> currentValue;
    @XmlElement(name = "DefaultValue", nillable = true)
    protected List<CimString> defaultValue;
    @XmlElement(name = "Dependency", nillable = true)
    protected CimString dependency;
    @XmlElement(name = "DisplayOrder", nillable = true)
    protected CimInt displayOrder;
    @XmlElement(name = "Description", nillable = true)
    protected CimString description;
    @XmlElement(name = "ElementName", nillable = true)
    protected CimString elementName;
    @XmlElement(name = "FQDD", nillable = true)
    protected CimString fqdd;
    @XmlElement(name = "GroupDisplayName", nillable = true)
    protected CimString groupDisplayName;
    @XmlElement(name = "GroupID", nillable = true)
    protected CimString groupID;
    @XmlElement(name = "Generation", nillable = true)
    protected CimUnsignedLong generation;
    @XmlElement(name = "InstanceID", required = true)
    protected CimString instanceID;
    @XmlElement(name = "IsOrderedList", nillable = true)
    protected CimBoolean isOrderedList;
    @XmlElement(name = "IsReadOnly", nillable = true)
    protected CimString isReadOnly;
    @XmlElement(name = "LowerBound", nillable = true)
    protected CimUnsignedLong lowerBound;
    @XmlElement(name = "PendingValue", nillable = true)
    protected List<CimString> pendingValue;
    @XmlElement(name = "ProgrammaticUnit", nillable = true)
    protected CimString programmaticUnit;
    @XmlElement(name = "ScalarIncrement", nillable = true)
    protected CimUnsignedInt scalarIncrement;
    @XmlElement(name = "UpperBound", nillable = true)
    protected CimUnsignedLong upperBound;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();


    /**
     * Gets the value of the attributeDisplayName property.
     * 
     * @return possible object is {@link CimString }
     * 
     */
    public CimString getAttributeDisplayName() {
        return attributeDisplayName;
    }


    /**
     * Sets the value of the attributeDisplayName property.
     * 
     * @param value allowed object is {@link CimString }
     * 
     */
    public void setAttributeDisplayName(CimString value) {
        this.attributeDisplayName = value;
    }


    /**
     * Gets the value of the attributeName property.
     * 
     * @return possible object is {@link CimString }
     * 
     */
    public CimString getAttributeName() {
        return attributeName;
    }


    /**
     * Sets the value of the attributeName property.
     * 
     * @param value allowed object is {@link CimString }
     * 
     */
    public void setAttributeName(CimString value) {
        this.attributeName = value;
    }


    /**
     * Gets the value of the caption property.
     * 
     * @return possible object is {@link Caption }
     * 
     */
    public Caption getCaption() {
        return caption;
    }


    /**
     * Sets the value of the caption property.
     * 
     * @param value allowed object is {@link Caption }
     * 
     */
    public void setCaption(Caption value) {
        this.caption = value;
    }


    /**
     * Gets the value of the currentValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getCurrentValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link CimString }
     * 
     * 
     */
    public List<CimString> getCurrentValue() {
        if (currentValue == null) {
            currentValue = new ArrayList<CimString>();
        }
        return this.currentValue;
    }


    /**
     * Gets the value of the defaultValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getDefaultValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link CimString }
     * 
     * 
     */
    public List<CimString> getDefaultValue() {
        if (defaultValue == null) {
            defaultValue = new ArrayList<CimString>();
        }
        return this.defaultValue;
    }


    /**
     * Gets the value of the dependency property.
     * 
     * @return possible object is {@link CimString }
     * 
     */
    public CimString getDependency() {
        return dependency;
    }


    /**
     * Sets the value of the dependency property.
     * 
     * @param value allowed object is {@link CimString }
     * 
     */
    public void setDependency(CimString value) {
        this.dependency = value;
    }


    /**
     * Gets the value of the displayOrder property.
     * 
     * @return possible object is {@link CimInt }
     * 
     */
    public CimInt getDisplayOrder() {
        return displayOrder;
    }


    /**
     * Sets the value of the displayOrder property.
     * 
     * @param value allowed object is {@link CimInt }
     * 
     */
    public void setDisplayOrder(CimInt value) {
        this.displayOrder = value;
    }


    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link CimString }
     * 
     */
    public CimString getDescription() {
        return description;
    }


    /**
     * Sets the value of the description property.
     * 
     * @param value allowed object is {@link CimString }
     * 
     */
    public void setDescription(CimString value) {
        this.description = value;
    }


    /**
     * Gets the value of the elementName property.
     * 
     * @return possible object is {@link CimString }
     * 
     */
    public CimString getElementName() {
        return elementName;
    }


    /**
     * Sets the value of the elementName property.
     * 
     * @param value allowed object is {@link CimString }
     * 
     */
    public void setElementName(CimString value) {
        this.elementName = value;
    }


    /**
     * Gets the value of the fqdd property.
     * 
     * @return possible object is {@link CimString }
     * 
     */
    public CimString getFQDD() {
        return fqdd;
    }


    /**
     * Sets the value of the fqdd property.
     * 
     * @param value allowed object is {@link CimString }
     * 
     */
    public void setFQDD(CimString value) {
        this.fqdd = value;
    }


    /**
     * Gets the value of the groupDisplayName property.
     * 
     * @return possible object is {@link CimString }
     * 
     */
    public CimString getGroupDisplayName() {
        return groupDisplayName;
    }


    /**
     * Sets the value of the groupDisplayName property.
     * 
     * @param value allowed object is {@link CimString }
     * 
     */
    public void setGroupDisplayName(CimString value) {
        this.groupDisplayName = value;
    }


    /**
     * Gets the value of the groupID property.
     * 
     * @return possible object is {@link CimString }
     * 
     */
    public CimString getGroupID() {
        return groupID;
    }


    /**
     * Sets the value of the groupID property.
     * 
     * @param value allowed object is {@link CimString }
     * 
     */
    public void setGroupID(CimString value) {
        this.groupID = value;
    }


    /**
     * Gets the value of the generation property.
     * 
     * @return possible object is {@link CimUnsignedLong }
     * 
     */
    public CimUnsignedLong getGeneration() {
        return generation;
    }


    /**
     * Sets the value of the generation property.
     * 
     * @param value allowed object is {@link CimUnsignedLong }
     * 
     */
    public void setGeneration(CimUnsignedLong value) {
        this.generation = value;
    }


    /**
     * Gets the value of the instanceID property.
     * 
     * @return possible object is {@link CimString }
     * 
     */
    public CimString getInstanceID() {
        return instanceID;
    }


    /**
     * Sets the value of the instanceID property.
     * 
     * @param value allowed object is {@link CimString }
     * 
     */
    public void setInstanceID(CimString value) {
        this.instanceID = value;
    }


    /**
     * Gets the value of the isOrderedList property.
     * 
     * @return possible object is {@link CimBoolean }
     * 
     */
    public CimBoolean getIsOrderedList() {
        return isOrderedList;
    }


    /**
     * Sets the value of the isOrderedList property.
     * 
     * @param value allowed object is {@link CimBoolean }
     * 
     */
    public void setIsOrderedList(CimBoolean value) {
        this.isOrderedList = value;
    }


    /**
     * Gets the value of the isReadOnly property.
     * 
     * @return possible object is {@link CimString }
     * 
     */
    public CimString getIsReadOnly() {
        return isReadOnly;
    }


    /**
     * Sets the value of the isReadOnly property.
     * 
     * @param value allowed object is {@link CimString }
     * 
     */
    public void setIsReadOnly(CimString value) {
        this.isReadOnly = value;
    }


    /**
     * Gets the value of the lowerBound property.
     * 
     * @return possible object is {@link CimUnsignedLong }
     * 
     */
    public CimUnsignedLong getLowerBound() {
        return lowerBound;
    }


    /**
     * Sets the value of the lowerBound property.
     * 
     * @param value allowed object is {@link CimUnsignedLong }
     * 
     */
    public void setLowerBound(CimUnsignedLong value) {
        this.lowerBound = value;
    }


    /**
     * Gets the value of the pendingValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pendingValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getPendingValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link CimString }
     * 
     * 
     */
    public List<CimString> getPendingValue() {
        if (pendingValue == null) {
            pendingValue = new ArrayList<CimString>();
        }
        return this.pendingValue;
    }


    /**
     * Gets the value of the programmaticUnit property.
     * 
     * @return possible object is {@link CimString }
     * 
     */
    public CimString getProgrammaticUnit() {
        return programmaticUnit;
    }


    /**
     * Sets the value of the programmaticUnit property.
     * 
     * @param value allowed object is {@link CimString }
     * 
     */
    public void setProgrammaticUnit(CimString value) {
        this.programmaticUnit = value;
    }


    /**
     * Gets the value of the scalarIncrement property.
     * 
     * @return possible object is {@link CimUnsignedInt }
     * 
     */
    public CimUnsignedInt getScalarIncrement() {
        return scalarIncrement;
    }


    /**
     * Sets the value of the scalarIncrement property.
     * 
     * @param value allowed object is {@link CimUnsignedInt }
     * 
     */
    public void setScalarIncrement(CimUnsignedInt value) {
        this.scalarIncrement = value;
    }


    /**
     * Gets the value of the upperBound property.
     * 
     * @return possible object is {@link CimUnsignedLong }
     * 
     */
    public CimUnsignedLong getUpperBound() {
        return upperBound;
    }


    /**
     * Sets the value of the upperBound property.
     * 
     * @param value allowed object is {@link CimUnsignedLong }
     * 
     */
    public void setUpperBound(CimUnsignedLong value) {
        this.upperBound = value;
    }


    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Element } {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }


    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}

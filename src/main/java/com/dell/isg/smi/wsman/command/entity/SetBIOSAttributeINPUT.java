/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.10.18 at 11:10:55 AM CDT 
//

package com.dell.isg.smi.wsman.command.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TargetBIOS" type="{http://schemas.dmtf.org/wbem/wscim/1/common}cimReference"/>
 *         &lt;element name="AttributeName" type="{http://schemas.dmtf.org/wbem/wscim/1/common}cimString"/>
 *         &lt;element name="AttributeValue" type="{http://schemas.dmtf.org/wbem/wscim/1/common}cimString"/>
 *         &lt;element name="AuthorizationToken" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="PasswordEncoding">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;restriction base="&lt;http://schemas.dmtf.org/wbem/wscim/1/common>cimAnySimpleType">
 *                 &lt;anyAttribute processContents='lax'/>
 *               &lt;/restriction>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "targetBIOS", "attributeName", "attributeValue", "authorizationToken", "passwordEncoding" })
@XmlRootElement(name = "SetBIOSAttribute_INPUT")
public class SetBIOSAttributeINPUT {

    @XmlElement(name = "TargetBIOS", required = true, nillable = true)
    protected CimReference targetBIOS;
    @XmlElement(name = "AttributeName", required = true)
    protected CimString attributeName;
    @XmlElement(name = "AttributeValue", required = true)
    protected CimString attributeValue;
    @XmlElement(name = "AuthorizationToken", required = true, nillable = true)
    protected Object authorizationToken;
    @XmlElement(name = "PasswordEncoding", required = true, nillable = true)
    protected SetBIOSAttributeINPUT.PasswordEncoding passwordEncoding;


    /**
     * Gets the value of the targetBIOS property.
     * 
     * @return possible object is {@link CimReference }
     * 
     */
    public CimReference getTargetBIOS() {
        return targetBIOS;
    }


    /**
     * Sets the value of the targetBIOS property.
     * 
     * @param value allowed object is {@link CimReference }
     * 
     */
    public void setTargetBIOS(CimReference value) {
        this.targetBIOS = value;
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
     * Gets the value of the attributeValue property.
     * 
     * @return possible object is {@link CimString }
     * 
     */
    public CimString getAttributeValue() {
        return attributeValue;
    }


    /**
     * Sets the value of the attributeValue property.
     * 
     * @param value allowed object is {@link CimString }
     * 
     */
    public void setAttributeValue(CimString value) {
        this.attributeValue = value;
    }


    /**
     * Gets the value of the authorizationToken property.
     * 
     * @return possible object is {@link Object }
     * 
     */
    public Object getAuthorizationToken() {
        return authorizationToken;
    }


    /**
     * Sets the value of the authorizationToken property.
     * 
     * @param value allowed object is {@link Object }
     * 
     */
    public void setAuthorizationToken(Object value) {
        this.authorizationToken = value;
    }


    /**
     * Gets the value of the passwordEncoding property.
     * 
     * @return possible object is {@link SetBIOSAttributeINPUT.PasswordEncoding }
     * 
     */
    public SetBIOSAttributeINPUT.PasswordEncoding getPasswordEncoding() {
        return passwordEncoding;
    }


    /**
     * Sets the value of the passwordEncoding property.
     * 
     * @param value allowed object is {@link SetBIOSAttributeINPUT.PasswordEncoding }
     * 
     */
    public void setPasswordEncoding(SetBIOSAttributeINPUT.PasswordEncoding value) {
        this.passwordEncoding = value;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;restriction base="&lt;http://schemas.dmtf.org/wbem/wscim/1/common>cimAnySimpleType">
     *       &lt;anyAttribute processContents='lax'/>
     *     &lt;/restriction>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PasswordEncoding extends CimAnySimpleType {

    }

}

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
 *         &lt;element name="SetResult" type="{http://schemas.dmtf.org/wbem/wscim/1/common}cimString"/>
 *         &lt;element name="RebootRequired" type="{http://schemas.dmtf.org/wbem/wscim/1/common}cimString"/>
 *         &lt;element name="MessageID" type="{http://schemas.dmtf.org/wbem/wscim/1/common}cimString"/>
 *         &lt;element name="Message" type="{http://schemas.dmtf.org/wbem/wscim/1/common}cimString"/>
 *         &lt;element name="MessageArguments" type="{http://schemas.dmtf.org/wbem/wscim/1/common}cimString"/>
 *         &lt;element name="ReturnValue">
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
@XmlType(name = "", propOrder = { "setResult", "rebootRequired", "messageID", "message", "messageArguments", "returnValue" })
@XmlRootElement(name = "SetAttribute_OUTPUT")
public class SetAttributeOUTPUT {

    @XmlElement(name = "SetResult", required = true, nillable = true)
    protected CimString setResult;
    @XmlElement(name = "RebootRequired", required = true, nillable = true)
    protected CimString rebootRequired;
    @XmlElement(name = "MessageID", required = true, nillable = true)
    protected CimString messageID;
    @XmlElement(name = "Message", required = true, nillable = true)
    protected CimString message;
    @XmlElement(name = "MessageArguments", required = true, nillable = true)
    protected CimString messageArguments;
    @XmlElement(name = "ReturnValue", required = true, nillable = true)
    protected SetAttributeOUTPUT.ReturnValue returnValue;


    /**
     * Gets the value of the setResult property.
     * 
     * @return possible object is {@link CimString }
     * 
     */
    public CimString getSetResult() {
        return setResult;
    }


    /**
     * Sets the value of the setResult property.
     * 
     * @param value allowed object is {@link CimString }
     * 
     */
    public void setSetResult(CimString value) {
        this.setResult = value;
    }


    /**
     * Gets the value of the rebootRequired property.
     * 
     * @return possible object is {@link CimString }
     * 
     */
    public CimString getRebootRequired() {
        return rebootRequired;
    }


    /**
     * Sets the value of the rebootRequired property.
     * 
     * @param value allowed object is {@link CimString }
     * 
     */
    public void setRebootRequired(CimString value) {
        this.rebootRequired = value;
    }


    /**
     * Gets the value of the messageID property.
     * 
     * @return possible object is {@link CimString }
     * 
     */
    public CimString getMessageID() {
        return messageID;
    }


    /**
     * Sets the value of the messageID property.
     * 
     * @param value allowed object is {@link CimString }
     * 
     */
    public void setMessageID(CimString value) {
        this.messageID = value;
    }


    /**
     * Gets the value of the message property.
     * 
     * @return possible object is {@link CimString }
     * 
     */
    public CimString getMessage() {
        return message;
    }


    /**
     * Sets the value of the message property.
     * 
     * @param value allowed object is {@link CimString }
     * 
     */
    public void setMessage(CimString value) {
        this.message = value;
    }


    /**
     * Gets the value of the messageArguments property.
     * 
     * @return possible object is {@link CimString }
     * 
     */
    public CimString getMessageArguments() {
        return messageArguments;
    }


    /**
     * Sets the value of the messageArguments property.
     * 
     * @param value allowed object is {@link CimString }
     * 
     */
    public void setMessageArguments(CimString value) {
        this.messageArguments = value;
    }


    /**
     * Gets the value of the returnValue property.
     * 
     * @return possible object is {@link SetAttributeOUTPUT.ReturnValue }
     * 
     */
    public SetAttributeOUTPUT.ReturnValue getReturnValue() {
        return returnValue;
    }


    /**
     * Sets the value of the returnValue property.
     * 
     * @param value allowed object is {@link SetAttributeOUTPUT.ReturnValue }
     * 
     */
    public void setReturnValue(SetAttributeOUTPUT.ReturnValue value) {
        this.returnValue = value;
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
    public static class ReturnValue extends CimAnySimpleType {

    }

}

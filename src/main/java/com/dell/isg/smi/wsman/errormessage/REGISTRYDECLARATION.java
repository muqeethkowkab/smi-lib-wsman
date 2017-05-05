/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-548 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.01.31 at 06:09:44 PM CST 
//

package com.dell.isg.smi.wsman.errormessage;

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
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/messageregistry/1}IDENTIFICATION"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/messageregistry/1}SPECIFICATION"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/messageregistry/1}OWNING_ENTITY"/>
 *         &lt;element ref="{http://schemas.dmtf.org/wbem/messageregistry/1}DESCRIPTION"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "identification", "specification", "owningentity", "description" })
@XmlRootElement(name = "REGISTRY_DECLARATION")
public class REGISTRYDECLARATION {

    @XmlElement(name = "IDENTIFICATION", required = true)
    protected IDENTIFICATION identification;
    @XmlElement(name = "SPECIFICATION", required = true)
    protected SPECIFICATION specification;
    @XmlElement(name = "OWNING_ENTITY", required = true)
    protected String owningentity;
    @XmlElement(name = "DESCRIPTION", required = true)
    protected String description;


    /**
     * Gets the value of the identification property.
     * 
     * @return possible object is {@link IDENTIFICATION }
     * 
     */
    public IDENTIFICATION getIDENTIFICATION() {
        return identification;
    }


    /**
     * Sets the value of the identification property.
     * 
     * @param value allowed object is {@link IDENTIFICATION }
     * 
     */
    public void setIDENTIFICATION(IDENTIFICATION value) {
        this.identification = value;
    }


    /**
     * Gets the value of the specification property.
     * 
     * @return possible object is {@link SPECIFICATION }
     * 
     */
    public SPECIFICATION getSPECIFICATION() {
        return specification;
    }


    /**
     * Sets the value of the specification property.
     * 
     * @param value allowed object is {@link SPECIFICATION }
     * 
     */
    public void setSPECIFICATION(SPECIFICATION value) {
        this.specification = value;
    }


    /**
     * Gets the value of the owningentity property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getOWNINGENTITY() {
        return owningentity;
    }


    /**
     * Sets the value of the owningentity property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setOWNINGENTITY(String value) {
        this.owningentity = value;
    }


    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDESCRIPTION() {
        return description;
    }


    /**
     * Sets the value of the description property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

}

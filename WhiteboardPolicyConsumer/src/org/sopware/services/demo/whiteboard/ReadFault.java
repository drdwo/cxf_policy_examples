
package org.sopware.services.demo.whiteboard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="read_fault" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "readFault"
})
@XmlRootElement(name = "read_fault")
public class ReadFault {

    @XmlElement(name = "read_fault", required = true)
    protected String readFault;

    /**
     * Gets the value of the readFault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadFault() {
        return readFault;
    }

    /**
     * Sets the value of the readFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadFault(String value) {
        this.readFault = value;
    }

}

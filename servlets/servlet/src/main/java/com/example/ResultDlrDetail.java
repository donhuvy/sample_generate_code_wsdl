
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultDlrDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultDlrDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dlrStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultDlrDetail", propOrder = {
    "dlrStatus",
    "messageId"
})
public class ResultDlrDetail {

    protected int dlrStatus;
    protected long messageId;

    /**
     * Gets the value of the dlrStatus property.
     * 
     */
    public int getDlrStatus() {
        return dlrStatus;
    }

    /**
     * Sets the value of the dlrStatus property.
     * 
     */
    public void setDlrStatus(int value) {
        this.dlrStatus = value;
    }

    /**
     * Gets the value of the messageId property.
     * 
     */
    public long getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     */
    public void setMessageId(long value) {
        this.messageId = value;
    }

}

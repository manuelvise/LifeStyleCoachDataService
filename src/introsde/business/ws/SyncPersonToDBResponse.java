
package introsde.business.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import introsde.storage.ws.Person;


/**
 * <p>Java class for syncPersonToDBResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="syncPersonToDBResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personSynchronized" type="{http://ws.storage.introsde/}person" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "syncPersonToDBResponse", propOrder = {
    "personSynchronized"
})
public class SyncPersonToDBResponse {

    protected Person personSynchronized;

    /**
     * Gets the value of the personSynchronized property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPersonSynchronized() {
        return personSynchronized;
    }

    /**
     * Sets the value of the personSynchronized property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPersonSynchronized(Person value) {
        this.personSynchronized = value;
    }

}


package introsde.business.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import introsde.storage.ws.MeasureDefinition;


/**
 * <p>Java class for setupNewDefinitioMeasureResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setupNewDefinitioMeasureResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newMeasureDefinition" type="{http://ws.storage.introsde/}measureDefinition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setupNewDefinitioMeasureResponse", propOrder = {
    "newMeasureDefinition"
})
public class SetupNewDefinitioMeasureResponse {

    protected MeasureDefinition newMeasureDefinition;

    /**
     * Gets the value of the newMeasureDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureDefinition }
     *     
     */
    public MeasureDefinition getNewMeasureDefinition() {
        return newMeasureDefinition;
    }

    /**
     * Sets the value of the newMeasureDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureDefinition }
     *     
     */
    public void setNewMeasureDefinition(MeasureDefinition value) {
        this.newMeasureDefinition = value;
    }

}

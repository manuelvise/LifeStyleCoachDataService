
package introsde.storage.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveMeasureDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveMeasureDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measureDefinitionJson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveMeasureDefinition", propOrder = {
    "measureDefinitionJson"
})
public class SaveMeasureDefinition {

    protected String measureDefinitionJson;

    /**
     * Gets the value of the measureDefinitionJson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureDefinitionJson() {
        return measureDefinitionJson;
    }

    /**
     * Sets the value of the measureDefinitionJson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureDefinitionJson(String value) {
        this.measureDefinitionJson = value;
    }

}


package introsde.business.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import introsde.storage.ws.Person;


/**
 * <p>Java class for getPeopleWithLocalLifeStatusCalculationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPeopleWithLocalLifeStatusCalculationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="peopleWithLifeStatusCalculation" type="{http://ws.storage.introsde/}person" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPeopleWithLocalLifeStatusCalculationResponse", propOrder = {
    "peopleWithLifeStatusCalculation"
})
public class GetPeopleWithLocalLifeStatusCalculationResponse {

    protected List<Person> peopleWithLifeStatusCalculation;

    /**
     * Gets the value of the peopleWithLifeStatusCalculation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the peopleWithLifeStatusCalculation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeopleWithLifeStatusCalculation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Person }
     * 
     * 
     */
    public List<Person> getPeopleWithLifeStatusCalculation() {
        if (peopleWithLifeStatusCalculation == null) {
            peopleWithLifeStatusCalculation = new ArrayList<Person>();
        }
        return this.peopleWithLifeStatusCalculation;
    }

}

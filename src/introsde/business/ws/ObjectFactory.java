
package introsde.business.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.business.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SyncWeightToDBResponse_QNAME = new QName("http://ws.business.introsde/", "syncWeightToDBResponse");
    private final static QName _SyncPersonToDB_QNAME = new QName("http://ws.business.introsde/", "syncPersonToDB");
    private final static QName _SetupNewDefinitioMeasureResponse_QNAME = new QName("http://ws.business.introsde/", "setupNewDefinitioMeasureResponse");
    private final static QName _SyncWeightToDB_QNAME = new QName("http://ws.business.introsde/", "syncWeightToDB");
    private final static QName _SetupNewDefinitioMeasure_QNAME = new QName("http://ws.business.introsde/", "setupNewDefinitioMeasure");
    private final static QName _SyncPersonToDBResponse_QNAME = new QName("http://ws.business.introsde/", "syncPersonToDBResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.business.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SyncPersonToDBResponse }
     * 
     */
    public SyncPersonToDBResponse createSyncPersonToDBResponse() {
        return new SyncPersonToDBResponse();
    }

    /**
     * Create an instance of {@link SetupNewDefinitioMeasure }
     * 
     */
    public SetupNewDefinitioMeasure createSetupNewDefinitioMeasure() {
        return new SetupNewDefinitioMeasure();
    }

    /**
     * Create an instance of {@link SyncWeightToDB }
     * 
     */
    public SyncWeightToDB createSyncWeightToDB() {
        return new SyncWeightToDB();
    }

    /**
     * Create an instance of {@link SetupNewDefinitioMeasureResponse }
     * 
     */
    public SetupNewDefinitioMeasureResponse createSetupNewDefinitioMeasureResponse() {
        return new SetupNewDefinitioMeasureResponse();
    }

    /**
     * Create an instance of {@link SyncPersonToDB }
     * 
     */
    public SyncPersonToDB createSyncPersonToDB() {
        return new SyncPersonToDB();
    }

    /**
     * Create an instance of {@link SyncWeightToDBResponse }
     * 
     */
    public SyncWeightToDBResponse createSyncWeightToDBResponse() {
        return new SyncWeightToDBResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncWeightToDBResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.introsde/", name = "syncWeightToDBResponse")
    public JAXBElement<SyncWeightToDBResponse> createSyncWeightToDBResponse(SyncWeightToDBResponse value) {
        return new JAXBElement<SyncWeightToDBResponse>(_SyncWeightToDBResponse_QNAME, SyncWeightToDBResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncPersonToDB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.introsde/", name = "syncPersonToDB")
    public JAXBElement<SyncPersonToDB> createSyncPersonToDB(SyncPersonToDB value) {
        return new JAXBElement<SyncPersonToDB>(_SyncPersonToDB_QNAME, SyncPersonToDB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetupNewDefinitioMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.introsde/", name = "setupNewDefinitioMeasureResponse")
    public JAXBElement<SetupNewDefinitioMeasureResponse> createSetupNewDefinitioMeasureResponse(SetupNewDefinitioMeasureResponse value) {
        return new JAXBElement<SetupNewDefinitioMeasureResponse>(_SetupNewDefinitioMeasureResponse_QNAME, SetupNewDefinitioMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncWeightToDB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.introsde/", name = "syncWeightToDB")
    public JAXBElement<SyncWeightToDB> createSyncWeightToDB(SyncWeightToDB value) {
        return new JAXBElement<SyncWeightToDB>(_SyncWeightToDB_QNAME, SyncWeightToDB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetupNewDefinitioMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.introsde/", name = "setupNewDefinitioMeasure")
    public JAXBElement<SetupNewDefinitioMeasure> createSetupNewDefinitioMeasure(SetupNewDefinitioMeasure value) {
        return new JAXBElement<SetupNewDefinitioMeasure>(_SetupNewDefinitioMeasure_QNAME, SetupNewDefinitioMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncPersonToDBResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.introsde/", name = "syncPersonToDBResponse")
    public JAXBElement<SyncPersonToDBResponse> createSyncPersonToDBResponse(SyncPersonToDBResponse value) {
        return new JAXBElement<SyncPersonToDBResponse>(_SyncPersonToDBResponse_QNAME, SyncPersonToDBResponse.class, null, value);
    }

}

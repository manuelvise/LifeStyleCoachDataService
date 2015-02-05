
package introsde.storage.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "People", targetNamespace = "http://ws.storage.introsde/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface People {


    /**
     * 
     * @param personId
     * @param healthProfile
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "hpId", targetNamespace = "")
    @RequestWrapper(localName = "updatePersonHealthProfile", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.UpdatePersonHealthProfile")
    @ResponseWrapper(localName = "updatePersonHealthProfileResponse", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.UpdatePersonHealthProfileResponse")
    @Action(input = "http://ws.storage.introsde/People/updatePersonHealthProfileRequest", output = "http://ws.storage.introsde/People/updatePersonHealthProfileResponse")
    public int updatePersonHealthProfile(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId,
        @WebParam(name = "healthProfile", targetNamespace = "")
        LifeStatus healthProfile);

    /**
     * 
     * @param measureType
     * @param personId
     * @return
     *     returns java.util.List<introsde.storage.ws.HealthMeasureHistory>
     */
    @WebMethod
    @WebResult(name = "localHistory", targetNamespace = "")
    @RequestWrapper(localName = "readPersonLocalHistory", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.ReadPersonLocalHistory")
    @ResponseWrapper(localName = "readPersonLocalHistoryResponse", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.ReadPersonLocalHistoryResponse")
    @Action(input = "http://ws.storage.introsde/People/readPersonLocalHistoryRequest", output = "http://ws.storage.introsde/People/readPersonLocalHistoryResponse")
    public List<HealthMeasureHistory> readPersonLocalHistory(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId,
        @WebParam(name = "measureType", targetNamespace = "")
        String measureType);

    /**
     * 
     * @param mId
     * @param measureType
     * @param personId
     * @return
     *     returns introsde.storage.ws.HealthMeasureHistory
     */
    @WebMethod
    @WebResult(name = "singleMeasureOfPersonById", targetNamespace = "")
    @RequestWrapper(localName = "readPersonMeasurement", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.ReadPersonMeasurement")
    @ResponseWrapper(localName = "readPersonMeasurementResponse", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.ReadPersonMeasurementResponse")
    @Action(input = "http://ws.storage.introsde/People/readPersonMeasurementRequest", output = "http://ws.storage.introsde/People/readPersonMeasurementResponse")
    public HealthMeasureHistory readPersonMeasurement(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId,
        @WebParam(name = "measureType", targetNamespace = "")
        String measureType,
        @WebParam(name = "mId", targetNamespace = "")
        int mId);

    /**
     * 
     * @param measure
     * @param personId
     * @return
     *     returns introsde.storage.ws.LifeStatus
     */
    @WebMethod
    @WebResult(name = "singleMeasureSaved", targetNamespace = "")
    @RequestWrapper(localName = "savePersonMeasurement", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.SavePersonMeasurement")
    @ResponseWrapper(localName = "savePersonMeasurementResponse", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.SavePersonMeasurementResponse")
    @Action(input = "http://ws.storage.introsde/People/savePersonMeasurementRequest", output = "http://ws.storage.introsde/People/savePersonMeasurementResponse")
    public LifeStatus savePersonMeasurement(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId,
        @WebParam(name = "measure", targetNamespace = "")
        Measure measure);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.storage.ws.MeasureDefinition>
     */
    @WebMethod
    @WebResult(name = "ListOfMeasureTypes", targetNamespace = "")
    @RequestWrapper(localName = "readMeasureTypes", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.ReadMeasureTypes")
    @ResponseWrapper(localName = "readMeasureTypesResponse", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.ReadMeasureTypesResponse")
    @Action(input = "http://ws.storage.introsde/People/readMeasureTypesRequest", output = "http://ws.storage.introsde/People/readMeasureTypesResponse")
    public List<MeasureDefinition> readMeasureTypes();

    /**
     * 
     * @param measure
     * @param idMeasure
     * @return
     *     returns introsde.storage.ws.HealthMeasureHistory
     */
    @WebMethod
    @WebResult(name = "singleMeasureUpdated", targetNamespace = "")
    @RequestWrapper(localName = "updatePersonMeasure", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.UpdatePersonMeasure")
    @ResponseWrapper(localName = "updatePersonMeasureResponse", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.UpdatePersonMeasureResponse")
    @Action(input = "http://ws.storage.introsde/People/updatePersonMeasureRequest", output = "http://ws.storage.introsde/People/updatePersonMeasureResponse")
    public HealthMeasureHistory updatePersonMeasure(
        @WebParam(name = "idMeasure", targetNamespace = "")
        int idMeasure,
        @WebParam(name = "measure", targetNamespace = "")
        Measure measure);

    /**
     * 
     * @param after
     * @param before
     * @param measureType
     * @param personId
     * @return
     *     returns java.util.List<introsde.storage.ws.HealthMeasureHistory>
     */
    @WebMethod
    @WebResult(name = "ListOfMeasureFromToDateAndType", targetNamespace = "")
    @RequestWrapper(localName = "readPersonMeasureByDates", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.ReadPersonMeasureByDates")
    @ResponseWrapper(localName = "readPersonMeasureByDatesResponse", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.ReadPersonMeasureByDatesResponse")
    @Action(input = "http://ws.storage.introsde/People/readPersonMeasureByDatesRequest", output = "http://ws.storage.introsde/People/readPersonMeasureByDatesResponse")
    public List<HealthMeasureHistory> readPersonMeasureByDates(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId,
        @WebParam(name = "measureType", targetNamespace = "")
        String measureType,
        @WebParam(name = "before", targetNamespace = "")
        Long before,
        @WebParam(name = "after", targetNamespace = "")
        Long after);

    /**
     * 
     * @param personId
     * @return
     *     returns introsde.storage.ws.Person
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "http://ws.storage.introsde/")
    @RequestWrapper(localName = "readPerson", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.ReadPerson")
    @ResponseWrapper(localName = "readPersonResponse", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.ReadPersonResponse")
    @Action(input = "http://ws.storage.introsde/People/readPersonRequest", output = "http://ws.storage.introsde/People/readPersonResponse")
    public Person readPerson(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.storage.ws.Person>
     */
    @WebMethod
    @WebResult(name = "people", targetNamespace = "")
    @RequestWrapper(localName = "getPersonList", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.GetPersonList")
    @ResponseWrapper(localName = "getPersonListResponse", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.GetPersonListResponse")
    @Action(input = "http://ws.storage.introsde/People/getPersonListRequest", output = "http://ws.storage.introsde/People/getPersonListResponse")
    public List<Person> getPersonList();

    /**
     * 
     * @param personJson
     * @return
     *     returns introsde.storage.ws.Person
     */
    @WebMethod
    @WebResult(name = "personId", targetNamespace = "")
    @RequestWrapper(localName = "createPerson", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.CreatePerson")
    @ResponseWrapper(localName = "createPersonResponse", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.CreatePersonResponse")
    @Action(input = "http://ws.storage.introsde/People/createPersonRequest", output = "http://ws.storage.introsde/People/createPersonResponse")
    public Person createPerson(
        @WebParam(name = "personJson", targetNamespace = "")
        String personJson);

    /**
     * 
     * @param person
     * @return
     *     returns java.lang.Long
     */
    @WebMethod
    @WebResult(name = "personId", targetNamespace = "")
    @RequestWrapper(localName = "updatePerson", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.UpdatePerson")
    @ResponseWrapper(localName = "updatePersonResponse", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.UpdatePersonResponse")
    @Action(input = "http://ws.storage.introsde/People/updatePersonRequest", output = "http://ws.storage.introsde/People/updatePersonResponse")
    public Long updatePerson(
        @WebParam(name = "person", targetNamespace = "http://ws.storage.introsde/")
        Person person);

    /**
     * 
     * @param personId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "ValueResult", targetNamespace = "")
    @RequestWrapper(localName = "deletePerson", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.DeletePerson")
    @ResponseWrapper(localName = "deletePersonResponse", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.DeletePersonResponse")
    @Action(input = "http://ws.storage.introsde/People/deletePersonRequest", output = "http://ws.storage.introsde/People/deletePersonResponse")
    public int deletePerson(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId);

    /**
     * 
     * @param measureDefinitionJson
     * @return
     *     returns introsde.storage.ws.MeasureDefinition
     */
    @WebMethod
    @WebResult(name = "singleMeasureUpdated", targetNamespace = "")
    @RequestWrapper(localName = "saveMeasureDefinition", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.SaveMeasureDefinition")
    @ResponseWrapper(localName = "saveMeasureDefinitionResponse", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.SaveMeasureDefinitionResponse")
    @Action(input = "http://ws.storage.introsde/People/saveMeasureDefinitionRequest", output = "http://ws.storage.introsde/People/saveMeasureDefinitionResponse")
    public MeasureDefinition saveMeasureDefinition(
        @WebParam(name = "measureDefinitionJson", targetNamespace = "")
        String measureDefinitionJson);

    /**
     * 
     * @param accessToken
     * @return
     *     returns java.util.List<introsde.storage.ws.HealthMeasureHistory>
     */
    @WebMethod
    @WebResult(name = "remoteWeightHistory", targetNamespace = "")
    @RequestWrapper(localName = "readPersonRemoteWeightHistory", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.ReadPersonRemoteWeightHistory")
    @ResponseWrapper(localName = "readPersonRemoteWeightHistoryResponse", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.ReadPersonRemoteWeightHistoryResponse")
    @Action(input = "http://ws.storage.introsde/People/readPersonRemoteWeightHistoryRequest", output = "http://ws.storage.introsde/People/readPersonRemoteWeightHistoryResponse")
    public List<HealthMeasureHistory> readPersonRemoteWeightHistory(
        @WebParam(name = "accessToken", targetNamespace = "")
        String accessToken);

    /**
     * 
     * @param accessToken
     * @return
     *     returns java.lang.Long
     */
    @WebMethod
    @WebResult(name = "RemotePersonId", targetNamespace = "")
    @RequestWrapper(localName = "readRemotePersonId", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.ReadRemotePersonId")
    @ResponseWrapper(localName = "readRemotePersonIdResponse", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.ReadRemotePersonIdResponse")
    @Action(input = "http://ws.storage.introsde/People/readRemotePersonIdRequest", output = "http://ws.storage.introsde/People/readRemotePersonIdResponse")
    public Long readRemotePersonId(
        @WebParam(name = "accessToken", targetNamespace = "")
        String accessToken);

    /**
     * 
     * @param accessToken
     * @return
     *     returns introsde.storage.ws.Person
     */
    @WebMethod
    @WebResult(name = "remotePerson", targetNamespace = "")
    @RequestWrapper(localName = "readRemotePerson", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.ReadRemotePerson")
    @ResponseWrapper(localName = "readRemotePersonResponse", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.ReadRemotePersonResponse")
    @Action(input = "http://ws.storage.introsde/People/readRemotePersonRequest", output = "http://ws.storage.introsde/People/readRemotePersonResponse")
    public Person readRemotePerson(
        @WebParam(name = "accessToken", targetNamespace = "")
        String accessToken);

    /**
     * 
     * @param personId
     * @return
     *     returns java.util.List<introsde.storage.ws.Goal>
     */
    @WebMethod
    @WebResult(name = "Goals", targetNamespace = "")
    @RequestWrapper(localName = "readPersonGoals", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.ReadPersonGoals")
    @ResponseWrapper(localName = "readPersonGoalsResponse", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.ReadPersonGoalsResponse")
    @Action(input = "http://ws.storage.introsde/People/readPersonGoalsRequest", output = "http://ws.storage.introsde/People/readPersonGoalsResponse")
    public List<Goal> readPersonGoals(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId);

    /**
     * 
     * @param measureType
     * @param personId
     * @return
     *     returns introsde.storage.ws.Goal
     */
    @WebMethod
    @WebResult(name = "Goal", targetNamespace = "")
    @RequestWrapper(localName = "readPersonGoalForMeasureType", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.ReadPersonGoalForMeasureType")
    @ResponseWrapper(localName = "readPersonGoalForMeasureTypeResponse", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.ReadPersonGoalForMeasureTypeResponse")
    @Action(input = "http://ws.storage.introsde/People/readPersonGoalForMeasureTypeRequest", output = "http://ws.storage.introsde/People/readPersonGoalForMeasureTypeResponse")
    public Goal readPersonGoalForMeasureType(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId,
        @WebParam(name = "measureType", targetNamespace = "")
        String measureType);

    /**
     * 
     * @param minValue
     * @param measureType
     * @param maxValue
     * @return
     *     returns java.util.List<introsde.storage.ws.Person>
     */
    @WebMethod
    @WebResult(name = "ListOfMeasureOnRange", targetNamespace = "")
    @RequestWrapper(localName = "readPersonListByMeasurementRange", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.ReadPersonListByMeasurementRange")
    @ResponseWrapper(localName = "readPersonListByMeasurementRangeResponse", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.ReadPersonListByMeasurementRangeResponse")
    @Action(input = "http://ws.storage.introsde/People/readPersonListByMeasurementRangeRequest", output = "http://ws.storage.introsde/People/readPersonListByMeasurementRangeResponse")
    public List<Person> readPersonListByMeasurementRange(
        @WebParam(name = "measureType", targetNamespace = "")
        String measureType,
        @WebParam(name = "maxValue", targetNamespace = "")
        String maxValue,
        @WebParam(name = "minValue", targetNamespace = "")
        String minValue);

    /**
     * 
     * @param typeMeasure
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "measureDefinitionJson", targetNamespace = "")
    @RequestWrapper(localName = "getCompleteMeasureTypeFromName", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.GetCompleteMeasureTypeFromName")
    @ResponseWrapper(localName = "getCompleteMeasureTypeFromNameResponse", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.GetCompleteMeasureTypeFromNameResponse")
    @Action(input = "http://ws.storage.introsde/People/getCompleteMeasureTypeFromNameRequest", output = "http://ws.storage.introsde/People/getCompleteMeasureTypeFromNameResponse")
    public String getCompleteMeasureTypeFromName(
        @WebParam(name = "typeMeasure", targetNamespace = "")
        String typeMeasure);

    /**
     * 
     * @param value
     * @param measureType
     * @param personId
     * @param deadline
     * @return
     *     returns introsde.storage.ws.Goal
     */
    @WebMethod
    @WebResult(name = "Goal", targetNamespace = "")
    @RequestWrapper(localName = "saveGoal", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.SaveGoal")
    @ResponseWrapper(localName = "saveGoalResponse", targetNamespace = "http://ws.storage.introsde/", className = "introsde.storage.ws.SaveGoalResponse")
    @Action(input = "http://ws.storage.introsde/People/saveGoalRequest", output = "http://ws.storage.introsde/People/saveGoalResponse")
    public Goal saveGoal(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId,
        @WebParam(name = "measureType", targetNamespace = "")
        String measureType,
        @WebParam(name = "value", targetNamespace = "")
        String value,
        @WebParam(name = "deadline", targetNamespace = "")
        Long deadline);

}

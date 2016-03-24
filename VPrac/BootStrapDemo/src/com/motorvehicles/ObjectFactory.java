
package com.motorvehicles;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.motorvehicles package. 
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

    private final static QName _GetCarsResponse_QNAME = new QName("http://MotorVehicles.com", "getCarsResponse");
    private final static QName _GetBikes_QNAME = new QName("http://MotorVehicles.com", "getBikes");
    private final static QName _GetTrucks_QNAME = new QName("http://MotorVehicles.com", "getTrucks");
    private final static QName _GetBikesResponse_QNAME = new QName("http://MotorVehicles.com", "getBikesResponse");
    private final static QName _GetCars_QNAME = new QName("http://MotorVehicles.com", "getCars");
    private final static QName _GetTrucksResponse_QNAME = new QName("http://MotorVehicles.com", "getTrucksResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.motorvehicles
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCarsResponse }
     * 
     */
    public GetCarsResponse createGetCarsResponse() {
        return new GetCarsResponse();
    }

    /**
     * Create an instance of {@link GetCars }
     * 
     */
    public GetCars createGetCars() {
        return new GetCars();
    }

    /**
     * Create an instance of {@link GetTrucksResponse }
     * 
     */
    public GetTrucksResponse createGetTrucksResponse() {
        return new GetTrucksResponse();
    }

    /**
     * Create an instance of {@link GetBikesResponse }
     * 
     */
    public GetBikesResponse createGetBikesResponse() {
        return new GetBikesResponse();
    }

    /**
     * Create an instance of {@link GetTrucks }
     * 
     */
    public GetTrucks createGetTrucks() {
        return new GetTrucks();
    }

    /**
     * Create an instance of {@link GetBikes }
     * 
     */
    public GetBikes createGetBikes() {
        return new GetBikes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MotorVehicles.com", name = "getCarsResponse")
    public JAXBElement<GetCarsResponse> createGetCarsResponse(GetCarsResponse value) {
        return new JAXBElement<GetCarsResponse>(_GetCarsResponse_QNAME, GetCarsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBikes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MotorVehicles.com", name = "getBikes")
    public JAXBElement<GetBikes> createGetBikes(GetBikes value) {
        return new JAXBElement<GetBikes>(_GetBikes_QNAME, GetBikes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTrucks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MotorVehicles.com", name = "getTrucks")
    public JAXBElement<GetTrucks> createGetTrucks(GetTrucks value) {
        return new JAXBElement<GetTrucks>(_GetTrucks_QNAME, GetTrucks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBikesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MotorVehicles.com", name = "getBikesResponse")
    public JAXBElement<GetBikesResponse> createGetBikesResponse(GetBikesResponse value) {
        return new JAXBElement<GetBikesResponse>(_GetBikesResponse_QNAME, GetBikesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCars }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MotorVehicles.com", name = "getCars")
    public JAXBElement<GetCars> createGetCars(GetCars value) {
        return new JAXBElement<GetCars>(_GetCars_QNAME, GetCars.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTrucksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MotorVehicles.com", name = "getTrucksResponse")
    public JAXBElement<GetTrucksResponse> createGetTrucksResponse(GetTrucksResponse value) {
        return new JAXBElement<GetTrucksResponse>(_GetTrucksResponse_QNAME, GetTrucksResponse.class, null, value);
    }

}


package com.bootcamp.automobiles;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.motorvehicles.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Motors", targetNamespace = "http://MotorVehicles.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Motors {


    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTrucks", targetNamespace = "http://MotorVehicles.com", className = "com.motorvehicles.GetTrucks")
    @ResponseWrapper(localName = "getTrucksResponse", targetNamespace = "http://MotorVehicles.com", className = "com.motorvehicles.GetTrucksResponse")
    @Action(input = "http://MotorVehicles.com/Motors/getTrucksRequest", output = "http://MotorVehicles.com/Motors/getTrucksResponse")
    public List<String> getTrucks();

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBikes", targetNamespace = "http://MotorVehicles.com", className = "com.motorvehicles.GetBikes")
    @ResponseWrapper(localName = "getBikesResponse", targetNamespace = "http://MotorVehicles.com", className = "com.motorvehicles.GetBikesResponse")
    @Action(input = "http://MotorVehicles.com/Motors/getBikesRequest", output = "http://MotorVehicles.com/Motors/getBikesResponse")
    public List<String> getBikes();

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCars", targetNamespace = "http://MotorVehicles.com", className = "com.motorvehicles.GetCars")
    @ResponseWrapper(localName = "getCarsResponse", targetNamespace = "http://MotorVehicles.com", className = "com.motorvehicles.GetCarsResponse")
    @Action(input = "http://MotorVehicles.com/Motors/getCarsRequest", output = "http://MotorVehicles.com/Motors/getCarsResponse")
    public List<String> getCars();

}

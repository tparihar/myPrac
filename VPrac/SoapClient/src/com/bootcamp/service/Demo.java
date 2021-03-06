
package com.bootcamp.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.vishalsingh.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Demo", targetNamespace = "http://vishalsingh.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Demo {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "hello")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDetails", targetNamespace = "http://vishalsingh.com", className = "com.vishalsingh.GetDetails")
    @ResponseWrapper(localName = "getDetailsResponse", targetNamespace = "http://vishalsingh.com", className = "com.vishalsingh.GetDetailsResponse")
    @Action(input = "hello", output = "http://vishalsingh.com/Demo/getDetailsResponse")
    public String getDetails(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}

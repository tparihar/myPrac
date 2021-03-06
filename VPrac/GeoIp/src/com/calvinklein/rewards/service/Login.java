
package com.calvinklein.rewards.service;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Login", targetNamespace = "http://service.rewards.calvinklein.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Login {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validateUser", targetNamespace = "http://service.rewards.calvinklein.com/", className = "com.calvinklein.rewards.service.ValidateUser")
    @ResponseWrapper(localName = "validateUserResponse", targetNamespace = "http://service.rewards.calvinklein.com/", className = "com.calvinklein.rewards.service.ValidateUserResponse")
    @Action(input = "http://service.rewards.calvinklein.com/Login/validateUserRequest", output = "http://service.rewards.calvinklein.com/Login/validateUserResponse")
    public boolean validateUser(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.calvinklein.rewards.service.Member
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMemberDetails", targetNamespace = "http://service.rewards.calvinklein.com/", className = "com.calvinklein.rewards.service.GetMemberDetails")
    @ResponseWrapper(localName = "getMemberDetailsResponse", targetNamespace = "http://service.rewards.calvinklein.com/", className = "com.calvinklein.rewards.service.GetMemberDetailsResponse")
    @Action(input = "http://service.rewards.calvinklein.com/Login/getMemberDetailsRequest", output = "http://service.rewards.calvinklein.com/Login/getMemberDetailsResponse")
    public Member getMemberDetails(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}


package com.calvinklein.rewards.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.calvinklein.rewards.service package. 
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

    private final static QName _ValidateUser_QNAME = new QName("http://service.rewards.calvinklein.com/", "validateUser");
    private final static QName _GetMemberDetailsResponse_QNAME = new QName("http://service.rewards.calvinklein.com/", "getMemberDetailsResponse");
    private final static QName _GetMemberDetails_QNAME = new QName("http://service.rewards.calvinklein.com/", "getMemberDetails");
    private final static QName _ValidateUserResponse_QNAME = new QName("http://service.rewards.calvinklein.com/", "validateUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.calvinklein.rewards.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMemberDetailsResponse }
     * 
     */
    public GetMemberDetailsResponse createGetMemberDetailsResponse() {
        return new GetMemberDetailsResponse();
    }

    /**
     * Create an instance of {@link ValidateUser }
     * 
     */
    public ValidateUser createValidateUser() {
        return new ValidateUser();
    }

    /**
     * Create an instance of {@link GetMemberDetails }
     * 
     */
    public GetMemberDetails createGetMemberDetails() {
        return new GetMemberDetails();
    }

    /**
     * Create an instance of {@link ValidateUserResponse }
     * 
     */
    public ValidateUserResponse createValidateUserResponse() {
        return new ValidateUserResponse();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Member }
     * 
     */
    public Member createMember() {
        return new Member();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.rewards.calvinklein.com/", name = "validateUser")
    public JAXBElement<ValidateUser> createValidateUser(ValidateUser value) {
        return new JAXBElement<ValidateUser>(_ValidateUser_QNAME, ValidateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMemberDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.rewards.calvinklein.com/", name = "getMemberDetailsResponse")
    public JAXBElement<GetMemberDetailsResponse> createGetMemberDetailsResponse(GetMemberDetailsResponse value) {
        return new JAXBElement<GetMemberDetailsResponse>(_GetMemberDetailsResponse_QNAME, GetMemberDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMemberDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.rewards.calvinklein.com/", name = "getMemberDetails")
    public JAXBElement<GetMemberDetails> createGetMemberDetails(GetMemberDetails value) {
        return new JAXBElement<GetMemberDetails>(_GetMemberDetails_QNAME, GetMemberDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.rewards.calvinklein.com/", name = "validateUserResponse")
    public JAXBElement<ValidateUserResponse> createValidateUserResponse(ValidateUserResponse value) {
        return new JAXBElement<ValidateUserResponse>(_ValidateUserResponse_QNAME, ValidateUserResponse.class, null, value);
    }

}

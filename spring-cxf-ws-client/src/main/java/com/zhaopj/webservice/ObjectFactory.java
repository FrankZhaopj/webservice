
package com.zhaopj.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.zhaopj.webservice package. 
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

    private final static QName _GetRoles_QNAME = new QName("http://webservice.zhaopj.com/", "getRoles");
    private final static QName _GetRolesByUser_QNAME = new QName("http://webservice.zhaopj.com/", "getRolesByUser");
    private final static QName _GetRolesByUserResponse_QNAME = new QName("http://webservice.zhaopj.com/", "getRolesByUserResponse");
    private final static QName _GetRolesResponse_QNAME = new QName("http://webservice.zhaopj.com/", "getRolesResponse");
    private final static QName _HelloWorld_QNAME = new QName("http://webservice.zhaopj.com/", "helloWorld");
    private final static QName _HelloWorldResponse_QNAME = new QName("http://webservice.zhaopj.com/", "helloWorldResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.zhaopj.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRoles }
     * 
     */
    public GetRoles createGetRoles() {
        return new GetRoles();
    }

    /**
     * Create an instance of {@link GetRolesByUser }
     * 
     */
    public GetRolesByUser createGetRolesByUser() {
        return new GetRolesByUser();
    }

    /**
     * Create an instance of {@link GetRolesByUserResponse }
     * 
     */
    public GetRolesByUserResponse createGetRolesByUserResponse() {
        return new GetRolesByUserResponse();
    }

    /**
     * Create an instance of {@link GetRolesResponse }
     * 
     */
    public GetRolesResponse createGetRolesResponse() {
        return new GetRolesResponse();
    }

    /**
     * Create an instance of {@link HelloWorld }
     * 
     */
    public HelloWorld createHelloWorld() {
        return new HelloWorld();
    }

    /**
     * Create an instance of {@link HelloWorldResponse }
     * 
     */
    public HelloWorldResponse createHelloWorldResponse() {
        return new HelloWorldResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link MyRole }
     * 
     */
    public MyRole createMyRole() {
        return new MyRole();
    }

    /**
     * Create an instance of {@link MyRoleArray }
     * 
     */
    public MyRoleArray createMyRoleArray() {
        return new MyRoleArray();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.zhaopj.com/", name = "getRoles")
    public JAXBElement<GetRoles> createGetRoles(GetRoles value) {
        return new JAXBElement<GetRoles>(_GetRoles_QNAME, GetRoles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolesByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.zhaopj.com/", name = "getRolesByUser")
    public JAXBElement<GetRolesByUser> createGetRolesByUser(GetRolesByUser value) {
        return new JAXBElement<GetRolesByUser>(_GetRolesByUser_QNAME, GetRolesByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolesByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.zhaopj.com/", name = "getRolesByUserResponse")
    public JAXBElement<GetRolesByUserResponse> createGetRolesByUserResponse(GetRolesByUserResponse value) {
        return new JAXBElement<GetRolesByUserResponse>(_GetRolesByUserResponse_QNAME, GetRolesByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.zhaopj.com/", name = "getRolesResponse")
    public JAXBElement<GetRolesResponse> createGetRolesResponse(GetRolesResponse value) {
        return new JAXBElement<GetRolesResponse>(_GetRolesResponse_QNAME, GetRolesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWorld }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.zhaopj.com/", name = "helloWorld")
    public JAXBElement<HelloWorld> createHelloWorld(HelloWorld value) {
        return new JAXBElement<HelloWorld>(_HelloWorld_QNAME, HelloWorld.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloWorldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.zhaopj.com/", name = "helloWorldResponse")
    public JAXBElement<HelloWorldResponse> createHelloWorldResponse(HelloWorldResponse value) {
        return new JAXBElement<HelloWorldResponse>(_HelloWorldResponse_QNAME, HelloWorldResponse.class, null, value);
    }

}

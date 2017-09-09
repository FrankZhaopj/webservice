package com.zhaopj.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2017-09-09T17:40:25.570+08:00
 * Generated source version: 3.1.12
 * 
 */
@WebService(targetNamespace = "http://webservice.zhaopj.com/", name = "MyWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface MyWebService {

    @WebMethod
    @RequestWrapper(localName = "getRolesByUser", targetNamespace = "http://webservice.zhaopj.com/", className = "com.zhaopj.webservice.GetRolesByUser")
    @ResponseWrapper(localName = "getRolesByUserResponse", targetNamespace = "http://webservice.zhaopj.com/", className = "com.zhaopj.webservice.GetRolesByUserResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.zhaopj.webservice.Role> getRolesByUser(
        @WebParam(name = "arg0", targetNamespace = "")
        com.zhaopj.webservice.User arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getRoles", targetNamespace = "http://webservice.zhaopj.com/", className = "com.zhaopj.webservice.GetRoles")
    @ResponseWrapper(localName = "getRolesResponse", targetNamespace = "http://webservice.zhaopj.com/", className = "com.zhaopj.webservice.GetRolesResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.zhaopj.webservice.MyRoleArray getRoles();

    @WebMethod
    @RequestWrapper(localName = "helloWorld", targetNamespace = "http://webservice.zhaopj.com/", className = "com.zhaopj.webservice.HelloWorld")
    @ResponseWrapper(localName = "helloWorldResponse", targetNamespace = "http://webservice.zhaopj.com/", className = "com.zhaopj.webservice.HelloWorldResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String helloWorld(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}

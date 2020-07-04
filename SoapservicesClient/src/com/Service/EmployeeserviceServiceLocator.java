/**
 * EmployeeserviceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.Service;

public class EmployeeserviceServiceLocator extends org.apache.axis.client.Service implements com.Service.EmployeeserviceService {

    public EmployeeserviceServiceLocator() {
    }


    public EmployeeserviceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EmployeeserviceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Employeeservice
    private java.lang.String Employeeservice_address = "http://localhost:8080/Soapservices/services/Employeeservice";

    public java.lang.String getEmployeeserviceAddress() {
        return Employeeservice_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EmployeeserviceWSDDServiceName = "Employeeservice";

    public java.lang.String getEmployeeserviceWSDDServiceName() {
        return EmployeeserviceWSDDServiceName;
    }

    public void setEmployeeserviceWSDDServiceName(java.lang.String name) {
        EmployeeserviceWSDDServiceName = name;
    }

    public com.Service.Employeeservice getEmployeeservice() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Employeeservice_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEmployeeservice(endpoint);
    }

    public com.Service.Employeeservice getEmployeeservice(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.Service.EmployeeserviceSoapBindingStub _stub = new com.Service.EmployeeserviceSoapBindingStub(portAddress, this);
            _stub.setPortName(getEmployeeserviceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEmployeeserviceEndpointAddress(java.lang.String address) {
        Employeeservice_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.Service.Employeeservice.class.isAssignableFrom(serviceEndpointInterface)) {
                com.Service.EmployeeserviceSoapBindingStub _stub = new com.Service.EmployeeserviceSoapBindingStub(new java.net.URL(Employeeservice_address), this);
                _stub.setPortName(getEmployeeserviceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Employeeservice".equals(inputPortName)) {
            return getEmployeeservice();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Service.com", "EmployeeserviceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Service.com", "Employeeservice"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Employeeservice".equals(portName)) {
            setEmployeeserviceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

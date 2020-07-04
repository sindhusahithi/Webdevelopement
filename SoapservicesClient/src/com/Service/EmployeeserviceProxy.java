package com.Service;

public class EmployeeserviceProxy implements com.Service.Employeeservice {
  private String _endpoint = null;
  private com.Service.Employeeservice employeeservice = null;
  
  public EmployeeserviceProxy() {
    _initEmployeeserviceProxy();
  }
  
  public EmployeeserviceProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmployeeserviceProxy();
  }
  
  private void _initEmployeeserviceProxy() {
    try {
      employeeservice = (new com.Service.EmployeeserviceServiceLocator()).getEmployeeservice();
      if (employeeservice != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)employeeservice)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)employeeservice)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (employeeservice != null)
      ((javax.xml.rpc.Stub)employeeservice)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.Service.Employeeservice getEmployeeservice() {
    if (employeeservice == null)
      _initEmployeeserviceProxy();
    return employeeservice;
  }
  
  public boolean deleteEmployee(int empId) throws java.rmi.RemoteException{
    if (employeeservice == null)
      _initEmployeeserviceProxy();
    return employeeservice.deleteEmployee(empId);
  }
  
  public boolean addEmployee(com.model.Employee e) throws java.rmi.RemoteException{
    if (employeeservice == null)
      _initEmployeeserviceProxy();
    return employeeservice.addEmployee(e);
  }
  
  public com.model.Employee getEmployee(int empId) throws java.rmi.RemoteException{
    if (employeeservice == null)
      _initEmployeeserviceProxy();
    return employeeservice.getEmployee(empId);
  }
  
  public com.model.Employee[] getAllEmployees() throws java.rmi.RemoteException{
    if (employeeservice == null)
      _initEmployeeserviceProxy();
    return employeeservice.getAllEmployees();
  }
  
  
}
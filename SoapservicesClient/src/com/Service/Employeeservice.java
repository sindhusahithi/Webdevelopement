/**
 * Employeeservice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.Service;

public interface Employeeservice extends java.rmi.Remote {
    public boolean deleteEmployee(int empId) throws java.rmi.RemoteException;
    public boolean addEmployee(com.model.Employee e) throws java.rmi.RemoteException;
    public com.model.Employee getEmployee(int empId) throws java.rmi.RemoteException;
    public com.model.Employee[] getAllEmployees() throws java.rmi.RemoteException;
}

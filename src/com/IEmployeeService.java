package com;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "employeeService")
public interface IEmployeeService {

	@WebMethod(operationName = "getEmployeeById")
	@WebResult(targetNamespace = "http://com", name = "employeeById")
	public Employee getEmployeeById(@WebParam(name = "employeeId") EmployeeId employeeId);
	
	@WebMethod(operationName = "getEmployee")
	@WebResult(targetNamespace = "http://com", name = "employee")
	public Employee getEmployee();

	@WebMethod(operationName = "getEmployeeList")
	@WebResult(targetNamespace = "http://com", name = "employeeList")
	public EmployeeList getEmployeeList();

}

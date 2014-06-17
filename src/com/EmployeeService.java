package com;

import javax.jws.WebService;

@WebService(name="employeeService")
public class EmployeeService implements IEmployeeService {

	@Override
	public Employee getEmployee() {
		Employee emp = new ObjectFactory().createEmployee();
		emp.setEId(100);
		emp.setEName("SriRama");
		return emp;
	}

	@Override
	public EmployeeList getEmployeeList() {
		EmployeeList  employeeList = new ObjectFactory().createEmployeeList();
		Employee emp = new ObjectFactory().createEmployee();
		emp.setEId(1);
		emp.setEName("SriRama");
		employeeList.getEmployee().add(emp);
		System.out.println("empList.employee.size : " + employeeList.getEmployee().size());
		return employeeList;
	}
	
	@Override
	public Employee getEmployeeById(EmployeeId employeeId) {
		Employee emp = new ObjectFactory().createEmployee();
		emp.setEId(employeeId.getEId());
		emp.setEName("RaghuRam");
		return emp;
	}

}

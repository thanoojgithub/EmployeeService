package com;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

@Path("emp")
public class EmployeeRESTService {

	@GET
	@Path("/TEXT")
	@Produces(MediaType.TEXT_HTML)
	public Response getEmployeeGET() {
		System.out.println("-getEmployee-TEXT-");
		return Response.status(201).entity("HI").build();
	}

	@GET
	@Path("/XML")
	@Produces(MediaType.APPLICATION_XML)
	public JAXBElement<Employee> getEmployee() {
		System.out.println("-getEmployee-XML-");
		Employee emp = new ObjectFactory().createEmployee();
		emp.setEId(1);
		emp.setEName("SriRama");
		JAXBElement<Employee> jaxbElement = new JAXBElement<Employee>(
				new QName("http://com", "employee"), Employee.class, null, emp);
		return jaxbElement;
	}

	@GET
	@Path("/xmlEmployeeList")
	@Produces(MediaType.APPLICATION_XML)
	public EmployeeList getXmlEmployeeList() {
		System.out.println("-getEmployee-List-XML-");
		EmployeeList empList = new ObjectFactory().createEmployeeList();
		Employee emp = new ObjectFactory().createEmployee();
		emp.setEId(1);
		emp.setEName("SriRama");
		empList.getEmployee().add(emp);
		return empList;
	}

	@POST
	@Path("/postXmlEmployee")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Employee getEmployeeById(
			JAXBElement<EmployeeId> employeeId) {
		System.out.println("-getEmployee-XML-@Consumes-");
		EmployeeId empId = employeeId.getValue();
		Employee emp = new ObjectFactory().createEmployee();
		emp.setEId(empId.getEId());
		emp.setEName("RaghuRam");
		
		return emp;
	}

	@GET
	@Path("/jsonString")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployeeJSONString() {
		System.out.println("-getEmployee-JSON-String");
		com.EmployeePOJO emp = new com.EmployeePOJO(1, "DharaniPutri");
		return Response.status(201).entity("HI :: " + emp).build();
	}

	@GET
	@Path("/JSON")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployeeJSON() {
		System.out.println("-getEmployee-JSON-");
		com.Employee emp = new ObjectFactory().createEmployee();
		emp.setEId(111);
		emp.setEName("DharaniPutri");
		return emp;
	}
}

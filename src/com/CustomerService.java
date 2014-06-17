package com;

import javax.jws.WebService;

@WebService(name="customerService")
public class CustomerService implements ICustomerService {

	@Override
	public Customer getCustomer(int cId) {
		Customer customer = new ObjectFactory().createCustomer();
		customer.setCId(cId);
		customer.setCName("Seetha");
		return customer;
	}

	@Override
	public CustomerList getCustomerList() {
		CustomerList  customerList = new ObjectFactory().createCustomerList();
		Customer customer = new ObjectFactory().createCustomer();
		customer.setCId(2);
		customer.setCName("Seetha");
		customerList.getCustomer().add(customer);
		System.out.println("empList.employee.size : " + customerList.getCustomer().size());
		return customerList;
	}

	@Override
	public Customer getCustomerById(CustomerId customerId) {
		Customer customer =new ObjectFactory().createCustomer();
		customer.setCId(customerId.getCId());
		customer.setCName("SeethaRam");
		return customer;
	}

}

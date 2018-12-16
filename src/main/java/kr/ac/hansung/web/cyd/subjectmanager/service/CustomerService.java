package kr.ac.hansung.web.cyd.subjectmanager.service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.ac.hansung.web.cyd.subjectmanager.model.Customer;


public class CustomerService {
	
	private Map<String, Customer> customers;
	
	private static final CustomerService instance = new CustomerService();
	
	private CustomerService() {
		customers = new HashMap<String, Customer>();
	}
	
	public static CustomerService getInstance(){
		return instance;
	}
	
	public void addCustomer(Customer customer) {
		customers.put(customer.getId(), customer);
	}
	
	public Customer findCustomer(String id) {
		if(id!=null)
			return(customers.get(id.toLowerCase()));
		else
			return null;			
	}
	
	public boolean login(String id,String password) {
		Customer customer = customers.get(id);
		if(id!=null && password !=null)
			return customer.getPassword().equals(password);
		else
			return false;
	}
	
	public List<Customer> getAllCustomers(){
		List<Customer> customerList = new ArrayList<Customer>(customers.values());
		return customerList;
	}
}
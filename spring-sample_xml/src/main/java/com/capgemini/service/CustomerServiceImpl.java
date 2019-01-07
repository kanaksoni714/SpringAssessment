package com.capgemini.service;

import java.util.List;

import com.springsample.hibernate.CustomerRepository;
import com.springsample.model.Customers;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customers>findAll(){
		return customerRepository.findAll();
		
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}

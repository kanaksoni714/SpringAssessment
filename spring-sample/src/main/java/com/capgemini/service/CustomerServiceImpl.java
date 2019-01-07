package com.capgemini.service;

import java.util.List;

import com.springsample.hibernate.CustomerRepository;
import com.springsample.hibernate.HibernateCustomerRepositoryImpl;
import com.springsample.model.Customers;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customer= new HibernateCustomerRepositoryImpl();
	/* (non-Javadoc)
	 * @see com.capgemini.service.CustomerService#findAll()
	 */
	@Override
	public List<Customers>findAll(){
		return CustomerRepository.findAll();
		
	}

}

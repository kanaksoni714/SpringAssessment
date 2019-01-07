package com.springsample.hibernate;

import java.util.ArrayList;
import java.util.List;

import com.springsample.model.Customers;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	public List<Customers> findAll() {
		List<Customers> customers = new ArrayList<>();
		Customers customer = new Customers();
		customer.setFirstname("Kanak");
		customer.setLastname("Soni");
		customers.add(customer);
		return customers;

	}
}

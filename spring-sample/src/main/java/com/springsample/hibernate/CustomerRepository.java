package com.springsample.hibernate;

import java.util.List;

import com.springsample.model.Customers;

public interface CustomerRepository {

	List<Customers> findAll();

}
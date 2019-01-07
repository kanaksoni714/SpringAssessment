package com.capgemini.service;

import java.util.List;

import com.springsample.model.Customers;

public interface CustomerService {

	List<Customers> findAll();

}
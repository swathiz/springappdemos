package com.samples.S06InterfaceInjectionAnno.DAO.impl;

import org.springframework.stereotype.Component;

import com.samples.S06InterfaceInjectionAnno.DAO.OrderDAO;

@Component("dao")
public class OrderDAOImpl implements OrderDAO{

	@Override
	public void createOrder() {
		System.out.println("create order in mysql db");
	}

}
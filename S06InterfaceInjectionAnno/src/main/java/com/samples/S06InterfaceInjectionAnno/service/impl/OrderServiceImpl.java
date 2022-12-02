package com.samples.S06InterfaceInjectionAnno.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.samples.S06InterfaceInjectionAnno.DAO.OrderDAO;
import com.samples.S06InterfaceInjectionAnno.service.OrderService;

@Component("orderservice")
public class OrderServiceImpl implements OrderService {

	@Autowired
	@Qualifier("daov2")
	private OrderDAO orderDAO;

	public OrderDAO getOrderDAO() {
		return orderDAO;
	}

	public void setOrderDAO(OrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}

	@Override
	public void placeOrder() {
		System.out.println("Inside OrderServiceImpl.placeOrder() method...");
		orderDAO.createOrder();
	}

}
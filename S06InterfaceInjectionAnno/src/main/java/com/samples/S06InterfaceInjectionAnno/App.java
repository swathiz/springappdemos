package com.samples.S06InterfaceInjectionAnno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.S06InterfaceInjectionAnno.DAO.OrderDAO;
import com.samples.S06InterfaceInjectionAnno.DAO.impl.OrderDAOImpl;
import com.samples.S06InterfaceInjectionAnno.service.OrderService;


public class App {
	private static final String List = null;

	public static void main(String[] args) {
		// create the spring container
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/S06InterfaceInjectionAnno/SpringConfig.xml");

		OrderService service = (OrderService) springContainer.getBean("orderservice");
		System.out.println(service);
		service.placeOrder();
		

	}
}
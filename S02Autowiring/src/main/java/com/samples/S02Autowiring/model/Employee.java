package com.samples.S02Autowiring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Employee {

	private int id;
	private String name;
	
	
	//when we give autowired annotation no need to use any of byName or byType etc.
	
	@Autowired   										 //this is auto wiring by feild
	@Qualifier("addressCal")							
	//when ter are 2 address in springconfig.xml we get no unique class availible exception 
	//so to specify whc address to be taken we use Qualifier annotation
	//here we can specify whcever bean name of address to be printed
	private Address address;
	
/*	@Autowired //this is auto wiring by constructor
	public Employee(Address address) {
		this.address = address;
	}*/
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	@Required
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
package com.samples.S03StereotypeAnnotations.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//we can only give @component to specify this is the class that has to be used to create a bean

@Component("inst")  //to specify the class to create the bean with bean name 
@Scope("singleton")
public class Instructor {
	
	@Value("11") // to give the values
	private int id;
	
	@Value("Max")
	private String name;
	
	//like this we can specify the list
	@Value("#{mytopics}")
	private List<String> topics;
	
	//to give the object reference
	@Autowired
	private Profile profile;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profile + "]";
	}

	

	

}
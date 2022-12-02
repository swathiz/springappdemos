package com.samples.S06SpringJdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/S06SpringJdbc/SpringConfig.xml");
//just create a object of jdbctemplate class using which u can work on sql statements like update,get
		JdbcTemplate jdbcTemplate = (JdbcTemplate) springContainer.getBean("jdbctemplate");
		
		String sql = "insert into employee values (?, ?, ?)";
		//jdbctemplate.update is used to insert the data
		int updateResult = jdbcTemplate.update(sql, 1, "John", "Wilson");
		System.out.println("Number of records inserted: " + updateResult);
		

	}
}

//JPA - java persistance API
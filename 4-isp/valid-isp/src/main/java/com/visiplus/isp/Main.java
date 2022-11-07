package com.visiplus.isp;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	
	public static Logger logger = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		Director director = new Director();
		Employee employee = new Employee();
		Contractor contractor = new Contractor();
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(employee);
		persons.add(director);
		persons.add(contractor);
		persons.forEach((p) -> {logger.info(p.getName());});
		
		IDirector tempDirector = director;
		logger.info(tempDirector.getCA().toString());
		
		IContractor tempContractor = contractor;
		logger.info(tempContractor.getOriginalCompany());
		
	}

}

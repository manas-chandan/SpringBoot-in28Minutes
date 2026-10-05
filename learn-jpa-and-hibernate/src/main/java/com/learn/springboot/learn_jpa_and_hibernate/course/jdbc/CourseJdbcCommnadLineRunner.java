package com.learn.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import com.learn.springboot.learn_jpa_and_hibernate.course.Course;
import com.learn.springboot.learn_jpa_and_hibernate.course.State;

@RestController
@Component
public class CourseJdbcCommnadLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository courseJdbcRepository;

	@Autowired
	private StateRepository stateRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		courseJdbcRepository.insert(new Course(1,"a","aa1"));
//		courseJdbcRepository.insert(new Course(2,"b","bb2"));
//		courseJdbcRepository.insert(new Course(3,"c","cc3"));
//		
//		courseJdbcRepository.delete((long) 1);
//		
//		
//		System.out.println(courseJdbcRepository.getCourseById(2));
//		System.out.println(courseJdbcRepository.getCourseById(3));
		
//		private long id;
//		private String name;
//		private long population;
//		private String cm;
		stateRepository.save(new State(1,"Odisha",4000000,"Mohan Majhi"));
		stateRepository.save(new State(2,"Delhi",300000,"Someone1"));
		stateRepository.save(new State(3,"Maharastra",48700000,"Someone2 Now"));
		stateRepository.save(new State(4,"Odisha",956890,"Abhisek singh"));
		
		var allState =stateRepository.findAll();
		
		for(State state : allState) {
			System.out.println(state);
		}
		
	}

	
}

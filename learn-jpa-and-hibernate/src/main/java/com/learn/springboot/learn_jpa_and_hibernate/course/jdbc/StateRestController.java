package com.learn.springboot.learn_jpa_and_hibernate.course.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.springboot.learn_jpa_and_hibernate.course.State;

@RestController
public class StateRestController {
	
	@Autowired
	private StateRepository stateRepository;
	
	@GetMapping("/states")
	public List<State> getAllState(){
		
		return stateRepository.findAll();
	}
	
}

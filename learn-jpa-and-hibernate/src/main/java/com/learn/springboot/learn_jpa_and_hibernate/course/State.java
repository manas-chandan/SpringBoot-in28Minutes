package com.learn.springboot.learn_jpa_and_hibernate.course;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Component
public class State {

	@Id
	private long id;
	private String name;
	private long population;
	private String cm;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPupulation() {
		return population;
	}
	public void setPupulation(long pupulation) {
		this.population = pupulation;
	}
	public String getCm() {
		return cm;
	}
	public void setCm(String cm) {
		this.cm = cm;
	}
	@Override
	public String toString() {
		return "State [id=" + id + ", name=" + name + ", pupulation=" + population + ", cm=" + cm + "]";
	}
	public State(long id, String name, long pupulation, String cm) {
		super();
		this.id = id;
		this.name = name;
		this.population = pupulation;
		this.cm = cm;
	}
	
	
	public State() {
		
	}
}

package com.learn.springboot.restfull_web_services.exception;

import java.time.LocalDateTime;
import java.util.Map;


public class ErrorDetails {
	private LocalDateTime timestamp;
	private String message;
	private String description;
	
	private Map<String,String> errors;
	
	public ErrorDetails(LocalDateTime timestamp, String message, String description) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.description = description;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public String getMessage() {
		return message;
	}
	public String getDescription() {
		return description;
	}
	
	public Map<String, String> getErrors() {
		return errors;
	}
	
	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}
	
	
	
	
}

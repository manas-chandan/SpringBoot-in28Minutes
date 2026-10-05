package com.learn.springboot.restfull_web_services.exception;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.jspecify.annotations.Nullable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.learn.springboot.restfull_web_services.user.UserNotFoundException;

@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ErrorDetails> handleAllException(Exception ex, WebRequest request) throws Exception {
		ErrorDetails errorDetails = 
				new ErrorDetails(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(errorDetails,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<ErrorDetails> handleUserNotFoundException(Exception ex, WebRequest request) throws Exception {
		ErrorDetails errorDetails = 
				new ErrorDetails(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(errorDetails,HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public final ResponseEntity<ErrorDetails> handleArgumentTypeMissMatchException(Exception ex, WebRequest request) throws Exception {
		ErrorDetails errorDetails = 
				new ErrorDetails(
						LocalDateTime.now(), 
						"Invalid user ID. Please provide a numeric ID.", 
						request.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(errorDetails,HttpStatus.BAD_REQUEST);
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {

//		StringBuilder errorMessage = new StringBuilder();
//		
//		ex.getBindingResult().getFieldErrors().forEach(error ->{
//			errorMessage.append(error.getField())
//						.append(": ")
//						.append(error.getDefaultMessage())
//						.append("; ");
//		});
		
		Map<String, String> errors = new LinkedHashMap<>();
		
		ex.getBindingResult().getFieldErrors()
							 .forEach(error ->{
								 System.out.println(error);
								 errors.put(error.getField(),error.getDefaultMessage());
							 });
		
		ErrorDetails errorDetails = 
				new ErrorDetails(
						LocalDateTime.now(), 
						"Validation Failed", 
						request.getDescription(false));
		
		errorDetails.setErrors(errors);
		
		return new ResponseEntity<>(errorDetails,HttpStatus.BAD_REQUEST);

	}
}



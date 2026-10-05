package com.learn.springboot.restfull_web_services.helloworld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	private MessageSource messageSource;

	public HelloWorldController(MessageSource messageSource) {

		this.messageSource = messageSource;
	}

//	@RequestMapping(method=RequestMethod.GET,path="/hello-world") //either one is work
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "<h1>Hello World1<h1>";
	}

	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean");
	}

	@GetMapping("/hello-world/{name}")
	public HelloWorldBean getPathVariable(@PathVariable String name) {
		return new HelloWorldBean("Helloo " + name);
	}

	@GetMapping(path = "/message-i18n")
	public String internationalizedMessage() {

		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null, "Default Message", locale);
//		return new HelloWorldBean("internationalizedMessage");
	}
}

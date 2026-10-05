package com.learn.springboot.restfull_web_services.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	
	private static List<User> users = new ArrayList<User>();
	
	public static int idCount =0;
	
	static {
		users.add(new User(++idCount, "Manas", LocalDate.now().minusYears(30)));
		users.add(new User(++idCount, "Akash", LocalDate.now().minusYears(28)));
		users.add(new User(++idCount, "Suraj", LocalDate.now().minusYears(33)));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User getUserById(Integer id){
		
		Predicate<? super User> predicate = user ->user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
		
	}
	
		
	public User save(User user) {
		user.setId(++idCount);
		users.add(user);
		return user;
	}
	
	public User deleteUser(Integer id) {
		User user = users.stream()
				.filter(u -> u.getId().equals(id))
				.findFirst()
				.orElse(null);
		
		if(user ==null){
			throw new UserNotFoundException("id: "+id);
		}
	
		users.remove(user);
		
		return user;
	}
	
}

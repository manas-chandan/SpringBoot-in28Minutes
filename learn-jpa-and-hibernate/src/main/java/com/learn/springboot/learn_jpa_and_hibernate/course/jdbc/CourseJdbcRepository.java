package com.learn.springboot.learn_jpa_and_hibernate.course.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.learn.springboot.learn_jpa_and_hibernate.course.Course;

@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	private static String INSERT_QUERY = 
			""" 
			insert into course(id, name , author)
				values(?,?,?)
			""";
	
	private static String DELETE_QUERY = 
			"""
			delete from course 
			where id = ?
			""";
	
	private static String SELECT_QUERY= """
			
			select * from course where id =?
			""";
	
	public void insert(Course course) {
		jdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
	}
	
	public void delete(Long id) {
		jdbcTemplate.update(DELETE_QUERY,id);
	}
	
	public Course getCourseById(long id){
		
	return	jdbcTemplate.queryForObject(SELECT_QUERY, 
				new BeanPropertyRowMapper<>(Course.class), id);

	}

	
}

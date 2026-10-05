package com.learn.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.springboot.learn_jpa_and_hibernate.course.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {

}

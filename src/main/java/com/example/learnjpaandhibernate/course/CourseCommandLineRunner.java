package com.example.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRespository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRespository repository;
	
	@Override
	public void run(String... args) throws Exception {
//		repository.insert(new Course(1,"Learn Hibernate","Sambit"));
//		repository.insert(new Course(2,"Learn SQL","Sambit"));
//		repository.insert(new Course(3,"Learn React","Sambit"));
		
		repository.save(new Course(1,"Learn Hibernate","Sambit"));
		repository.save(new Course(2,"Learn SQL","Sambit"));
		repository.save(new Course(3,"Learn React","Sambit"));
		
		repository.deleteById(2l);
		
		System.out.println(repository.findById(1l));
		System.out.println(repository.findById(3l));
	}
	
}

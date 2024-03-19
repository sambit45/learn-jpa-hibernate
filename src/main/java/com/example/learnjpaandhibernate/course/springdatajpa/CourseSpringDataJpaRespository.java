package com.example.learnjpaandhibernate.course.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.learnjpaandhibernate.course.Course;

public interface CourseSpringDataJpaRespository extends JpaRepository<Course,Long> {

}

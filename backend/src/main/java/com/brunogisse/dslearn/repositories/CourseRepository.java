package com.brunogisse.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunogisse.dslearn.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}

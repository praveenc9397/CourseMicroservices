package com.pkc.springbootmicroservice1course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pkc.springbootmicroservice1course.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long>
{
    //findBy+fieldNam}
}



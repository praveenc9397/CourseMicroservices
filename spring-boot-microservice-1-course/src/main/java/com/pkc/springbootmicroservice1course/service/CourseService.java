package com.pkc.springbootmicroservice1course.service;

import java.util.List;

import com.pkc.springbootmicroservice1course.model.Course;

public interface CourseService
{
    Course saveCourse(Course course);

    void deleteCourse(Long courseId);

    List<Course> findAllCourses();
}

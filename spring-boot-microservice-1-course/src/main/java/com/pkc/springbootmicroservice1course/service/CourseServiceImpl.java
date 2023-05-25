package com.pkc.springbootmicroservice1course.service;

import com.pkc.springbootmicroservice1course.model.Course;
import com.pkc.springbootmicroservice1course.repository.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService
{
    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository)
    {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course saveCourse(Course course)
    {
        course.setCreateTime(LocalDateTime.now());

        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long courseId)
    {
        courseRepository.deleteById(courseId);
    }

    @Override
    public List<Course> findAllCourses()
    {
        return courseRepository.findAll();
    }
}

package com.react.courseservice.service;

import com.react.courseservice.model.Course;
import com.react.courseservice.repositry.CourseRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CourseServiceIMPl implements CourseService{
    private final CourseRepository courseRepository;

    public CourseServiceIMPl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    @Override
    public Course saveCourse(Course course){
        course.setCreatTime(LocalDateTime.now());
        return courseRepository.save(course);
    }
    @Override
    public void deleteCourse(Long id){
        courseRepository.deleteById(id);
    }
    @Override
    public List<Course> findCourses(){
        return courseRepository.findAll();
    }
}

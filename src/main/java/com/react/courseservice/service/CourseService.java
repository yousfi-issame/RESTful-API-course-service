package com.react.courseservice.service;

import com.react.courseservice.model.Course;

import java.util.List;

public interface CourseService {
    Course saveCourse(Course course);

    void deleteCourse(Long id);

    List<Course> findCourses();
}

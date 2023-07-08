package com.react.courseservice.controller;

import com.react.courseservice.model.Course;
import com.react.courseservice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/course")
public class courseController {

    @Autowired
    private CourseService courseService;
    @PostMapping
    public ResponseEntity<?> saveCourse(@RequestBody Course course){
        return new ResponseEntity<>(courseService.saveCourse(course), HttpStatus.CREATED);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<?> saveCourse(@PathVariable Long id){
        courseService.deleteCourse(id);
        return new ResponseEntity<>( HttpStatus.OK);
    }
    @GetMapping("All")
    public ResponseEntity<?> saveCourse(){
        return ResponseEntity.ok(courseService.findCourses());
    }

}

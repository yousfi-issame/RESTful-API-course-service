package com.react.courseservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
@Table(name="course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "title", length = 100,nullable = false)
    private String title;
    @Column(name = "subtitle", length = 100,nullable = false)
    private String subtitle;
    @Column(name = "price",nullable = false)
    private Double price;
    @Column(name = "creatTable",nullable = false)
    private LocalDateTime creatTime;
}

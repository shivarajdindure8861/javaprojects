package com.shivu.association.domain;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.JoinTable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long courseId;
    private String name;
    private LocalDate pub;
    @ManyToMany
    @JoinTable(name = "course_student", joinColumns = @JoinColumn(name = "course"), inverseJoinColumns = @JoinColumn(name = "student"))
    private List<Student> students;

}

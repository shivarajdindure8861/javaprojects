package com.shivu.association.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studId;

    private String name;

    private Integer marks;
    @ManyToMany(mappedBy = "students")
    private List<Course> courses;
}

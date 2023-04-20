package com.shivu.association.domain;

import java.util.jar.Attributes.Name;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ContactDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String mobile;

    private String email;

    @ManyToOne
    @JoinColumn(name = "person_id")

    private Person person;
}

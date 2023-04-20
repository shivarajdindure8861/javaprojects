package com.shivu.association.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class IdentityDoc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type;
    private Boolean isActive;

    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;
}
// one identity can belongs to one person
// one person can have one unique identity
/*
 * 
 * create table identity_doc (
 * doc_id bigint not null,
 * is_active bit,
 * type varchar(255),
 * person_id bigint,
 * primary key (doc_id)
 * ) engine=InnoDB
 * 
 * alter table identity_doc
 * add constraint FKtniq3yhdrxcnc08xyg37knag5
 * foreign key (person_id)
 * references person (person_id)
 * 
 */

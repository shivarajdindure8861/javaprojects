package com.shivu.data.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
public class Invoice {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "client")
    private String client;
    @Column(name = "amt")
    private Double amt;
    @Column(name = "invDt")
    private LocalDate invDt;
}

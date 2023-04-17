package com.shivu.project.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Invoice {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "client")
    private String client;

    @Column(name = "invDt")
    private LocalDate invDt;

    @Column(name = "amt")
    private Double amt;
}

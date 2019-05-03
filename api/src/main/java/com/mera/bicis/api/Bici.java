package com.mera.bicis.api;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@Data
public class Bici {

    @Id
    private Long id;
    @Column(nullable = true)
    private String color;
    @Column(nullable = true, updatable = false)
    private String modelo;
    @Column
    private Double rin;
    @Column
    private Double precio;
}

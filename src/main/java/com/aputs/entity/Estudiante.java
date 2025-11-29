package com.aputs.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    @Column(unique = true)
    private String correo;
}

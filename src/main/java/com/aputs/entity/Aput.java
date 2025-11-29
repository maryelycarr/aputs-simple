package com.aputs.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Aput {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String tipo;

    private String fecha;

    private Integer puntos;

    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;
}

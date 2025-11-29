package com.aputs.controller;

import com.aputs.entity.Estudiante;
import com.aputs.repository.EstudianteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    private final EstudianteRepository repo;

    public EstudianteController(EstudianteRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Estudiante crear(@RequestBody Estudiante e) {
        return repo.save(e);
    }

    @GetMapping
    public List<Estudiante> listar() {
        return repo.findAll();
    }
}

package com.aputs.controller;

import com.aputs.entity.Aput;
import com.aputs.repository.AputRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aputs")
public class AputController {

    private final AputRepository repo;

    public AputController(AputRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Aput crear(@RequestBody Aput a) {
        return repo.save(a);
    }

    @GetMapping
    public List<Aput> listar() {
        return repo.findAll();
    }
}

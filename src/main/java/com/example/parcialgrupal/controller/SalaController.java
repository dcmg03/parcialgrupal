package com.example.parcialgrupal.controller;

import com.example.parcialgrupal.entities.Sala;
import com.example.parcialgrupal.service.SalaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/salas")
public class SalaController {
    private final SalaService salaService;

    public SalaController(SalaService salaService) {
        this.salaService = salaService;
    }

    @GetMapping
    public List<Sala> obtenerSalas() {
        return salaService.obtenerTodasLasSalas();
    }

    @PostMapping
    public Sala guardarSala(@RequestBody Sala sala) {
        return salaService.guardarSala(sala);
    }
}

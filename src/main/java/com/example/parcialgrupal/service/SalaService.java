package com.example.parcialgrupal.service;

import com.example.parcialgrupal.entities.Sala;
import com.example.parcialgrupal.repository.SalaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaService {
    private final SalaRepository salaRepository;

    public SalaService(SalaRepository salaRepository) {
        this.salaRepository = salaRepository;
    }

    public List<Sala> obtenerTodasLasSalas() {
        return salaRepository.findAll();
    }

    public Sala guardarSala(Sala sala) {
        return salaRepository.save(sala);
    }
}

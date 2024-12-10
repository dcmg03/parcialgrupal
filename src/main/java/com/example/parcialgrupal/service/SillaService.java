package com.example.parcialgrupal.service;

import com.example.parcialgrupal.entities.Silla;
import com.example.parcialgrupal.repository.SillaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SillaService {
    private final SillaRepository sillaRepository;

    public SillaService(SillaRepository sillaRepository) {
        this.sillaRepository = sillaRepository;
    }

    public List<Silla> obtenerTodasLasSillas() {
        return sillaRepository.findAll();
    }

    public Silla guardarSilla(Silla silla) {
        return sillaRepository.save(silla);
    }
}

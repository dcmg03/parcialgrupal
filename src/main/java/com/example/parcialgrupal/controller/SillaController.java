package com.example.parcialgrupal.controller;

import com.example.parcialgrupal.entities.Silla;
import com.example.parcialgrupal.service.SillaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sillas")
public class SillaController {
    private final SillaService sillaService;

    public SillaController(SillaService sillaService) {
        this.sillaService = sillaService;
    }

    @GetMapping
    public List<Silla> obtenerSillas() {
        return sillaService.obtenerTodasLasSillas();
    }

    @PostMapping
    public Silla guardarSilla(@RequestBody Silla silla) {
        return sillaService.guardarSilla(silla);
    }
}

package com.example.parcialgrupal.entities;

import jakarta.persistence.*;


import java.util.List;

@Entity
public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @OneToMany(mappedBy = "sala", cascade = CascadeType.ALL)
    private List<Silla> sillas;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Silla> getSillas() {
        return sillas;
    }

    public void setSillas(List<Silla> sillas) {
        this.sillas = sillas;
    }
}

package com.example.BackPruebaTecnica.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "clientemarca")
public class ClienteMarca {

    @EmbeddedId
    private ClienteMarcaId id; // clave compuesta

    @Column(name = "puntos")
    private Integer puntos;

    public ClienteMarca() {}

    public ClienteMarca(ClienteMarcaId id, Integer puntos) {
        this.id = id;
        this.puntos = puntos;
    }

    public ClienteMarcaId getId() { return id; }
    public void setId(ClienteMarcaId id) { this.id = id; }

    public Integer getPuntos() { return puntos; }
    public void setPuntos(Integer puntos) { this.puntos = puntos; }
}
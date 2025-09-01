package com.example.BackPruebaTecnica.servicios;

import com.example.BackPruebaTecnica.modelos.PaisesModelo;
import com.example.BackPruebaTecnica.repositorios.UbicacionRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MostrarPaisesServicio {

    private final UbicacionRepositorio mostrarPaisesRepositorio;

    public MostrarPaisesServicio(UbicacionRepositorio mostrarPaisesRepositorio) {
        this.mostrarPaisesRepositorio = mostrarPaisesRepositorio;
    }

    public List<PaisesModelo> mostrarPaises(){
        return mostrarPaisesRepositorio.mostrarPaises();
    }
}

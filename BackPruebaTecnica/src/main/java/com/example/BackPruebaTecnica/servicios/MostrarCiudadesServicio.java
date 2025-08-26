package com.example.BackPruebaTecnica.servicios;

import com.example.BackPruebaTecnica.modelos.CiudadesModelo;
import com.example.BackPruebaTecnica.repositorios.UbicacionRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MostrarCiudadesServicio {

    private final UbicacionRepositorio mostrarCiudadesRepositorio;

    public MostrarCiudadesServicio(UbicacionRepositorio mostrarCiudadesRepositorio) {
        this.mostrarCiudadesRepositorio = mostrarCiudadesRepositorio;
    }

    public List<CiudadesModelo> mostrarCiudades(Integer departamentoId) {
        return mostrarCiudadesRepositorio.mostrarCiudades(departamentoId);
    }
}

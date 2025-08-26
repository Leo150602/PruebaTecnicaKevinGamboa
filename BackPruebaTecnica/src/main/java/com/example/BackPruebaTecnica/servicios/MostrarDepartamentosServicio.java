package com.example.BackPruebaTecnica.servicios;

import com.example.BackPruebaTecnica.modelos.DepartamentosModelo;
import com.example.BackPruebaTecnica.repositorios.UbicacionRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MostrarDepartamentosServicio {

    private final UbicacionRepositorio mostrarDepartamentosRepositorio;

    public MostrarDepartamentosServicio(UbicacionRepositorio mostrarDepartamentosRepositorio) {
        this.mostrarDepartamentosRepositorio = mostrarDepartamentosRepositorio;
    }

    public List<DepartamentosModelo> mostrarDepartamentos(Integer paisId) {
        return mostrarDepartamentosRepositorio.mostrarDepartamentos(paisId);
    }
}

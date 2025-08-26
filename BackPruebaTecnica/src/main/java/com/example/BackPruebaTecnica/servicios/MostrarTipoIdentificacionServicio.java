package com.example.BackPruebaTecnica.servicios;

import com.example.BackPruebaTecnica.modelos.TipoIdentificacionModelo;
import com.example.BackPruebaTecnica.repositorios.UbicacionRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MostrarTipoIdentificacionServicio {

    private final UbicacionRepositorio mostrarTipoIdentificacionRepositorio;

    public MostrarTipoIdentificacionServicio(UbicacionRepositorio mostrarTipoIdentificacionRepositorio) {
        this.mostrarTipoIdentificacionRepositorio = mostrarTipoIdentificacionRepositorio;
    }

    public List<TipoIdentificacionModelo> mostrarTipoIdentificaion(Integer tipoId){
        return mostrarTipoIdentificacionRepositorio.mostrarTipoIdentificacion(tipoId);
    }
}

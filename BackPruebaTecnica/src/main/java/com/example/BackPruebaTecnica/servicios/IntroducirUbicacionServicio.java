package com.example.BackPruebaTecnica.servicios;

import com.example.BackPruebaTecnica.repositorios.UbicacionRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class IntroducirUbicacionServicio {

    private final UbicacionRepositorio ubicacionRepositorio;

    public IntroducirUbicacionServicio(UbicacionRepositorio ubicacionRepositorio) {
        this.ubicacionRepositorio = ubicacionRepositorio;
    }

    @Transactional
    public void introducirPais(
           String pais
    ){
        ubicacionRepositorio.introducirPais(pais);
    }

    @Transactional
    public void introducirDepartamento(
            Integer idPais,
            String departamento
            ){
        ubicacionRepositorio.introducirDepartamento(idPais,departamento);
    }

    @Transactional
    public void introducirCiudad(
            Integer idDepartamento,
            String ciudad
    ){
        ubicacionRepositorio.introducirDepartamento(idDepartamento,ciudad);
    }

}

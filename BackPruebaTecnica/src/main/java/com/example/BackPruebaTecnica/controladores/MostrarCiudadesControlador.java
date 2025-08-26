package com.example.BackPruebaTecnica.controladores;

import com.example.BackPruebaTecnica.modelos.CiudadesModelo;
import com.example.BackPruebaTecnica.servicios.MostrarCiudadesServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ciudades")
public class MostrarCiudadesControlador {

    private final MostrarCiudadesServicio mostrarCiudadesServicio;

    public MostrarCiudadesControlador(MostrarCiudadesServicio mostrarCiudadesServicio) {
        this.mostrarCiudadesServicio = mostrarCiudadesServicio;
    }

    @GetMapping
    public ResponseEntity<List<CiudadesModelo>> mostrarCiudades(Integer departamentoId){
        List<CiudadesModelo> ciudades = mostrarCiudadesServicio.mostrarCiudades(departamentoId);
        return ResponseEntity.ok(ciudades);
    }
}

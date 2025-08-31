package com.example.BackPruebaTecnica.controladores;

import com.example.BackPruebaTecnica.modelos.CiudadesModelo;
import com.example.BackPruebaTecnica.servicios.MostrarCiudadesServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ciudades")
@CrossOrigin(origins = "*")
public class MostrarCiudadesControlador {

    private final MostrarCiudadesServicio mostrarCiudadesServicio;

    public MostrarCiudadesControlador(MostrarCiudadesServicio mostrarCiudadesServicio) {
        this.mostrarCiudadesServicio = mostrarCiudadesServicio;
    }

    @GetMapping("/{departamentoId}")
    public ResponseEntity<List<CiudadesModelo>> mostrarCiudades(@PathVariable Integer departamentoId) {
        List<CiudadesModelo> ciudades = mostrarCiudadesServicio.mostrarCiudades(departamentoId);
        return ResponseEntity.ok(ciudades);
    }
}

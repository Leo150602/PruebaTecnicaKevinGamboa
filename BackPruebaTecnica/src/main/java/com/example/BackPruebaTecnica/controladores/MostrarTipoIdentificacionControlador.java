package com.example.BackPruebaTecnica.controladores;

import com.example.BackPruebaTecnica.modelos.TipoIdentificacionModelo;
import com.example.BackPruebaTecnica.servicios.MostrarTipoIdentificacionServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tipoIdentificacion")
@CrossOrigin(origins = "*")
public class MostrarTipoIdentificacionControlador {

    private final MostrarTipoIdentificacionServicio mostrarTipoIdentificacionServicio;

    public MostrarTipoIdentificacionControlador(MostrarTipoIdentificacionServicio mostrarTipoIdentificacionServicio) {
        this.mostrarTipoIdentificacionServicio = mostrarTipoIdentificacionServicio;
    }

    @GetMapping
    public ResponseEntity<List<TipoIdentificacionModelo>> mostrarTipoIdentificacion(){
        List<TipoIdentificacionModelo> tipoIdentificacion = mostrarTipoIdentificacionServicio.mostrarTipoIdentificaion();
        return ResponseEntity.ok(tipoIdentificacion);
    }
}

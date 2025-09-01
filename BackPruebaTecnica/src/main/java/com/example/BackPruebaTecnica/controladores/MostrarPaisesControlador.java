package com.example.BackPruebaTecnica.controladores;

import com.example.BackPruebaTecnica.modelos.PaisesModelo;
import com.example.BackPruebaTecnica.servicios.MostrarPaisesServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/paises")
@CrossOrigin(origins = "*")
public class MostrarPaisesControlador {

    private final MostrarPaisesServicio mostrarPaisesServicio;

    public MostrarPaisesControlador(MostrarPaisesServicio mostrarPaisesServicio) {
        this.mostrarPaisesServicio = mostrarPaisesServicio;
    }

    @GetMapping
    public ResponseEntity<List<PaisesModelo>> mostrarPaises(){
        List<PaisesModelo> paises = mostrarPaisesServicio.mostrarPaises();
        return ResponseEntity.ok(paises);
    }
}

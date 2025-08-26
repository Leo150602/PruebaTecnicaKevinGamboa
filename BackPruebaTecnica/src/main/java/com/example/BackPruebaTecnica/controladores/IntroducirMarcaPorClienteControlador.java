package com.example.BackPruebaTecnica.controladores;

import com.example.BackPruebaTecnica.modelos.IntroducirMarcaPorClienteModelo;
import com.example.BackPruebaTecnica.servicios.IntroducirMarcaPorClienteServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/marca")
public class IntroducirMarcaPorClienteControlador {
    private final IntroducirMarcaPorClienteServicio marcaServicio;

    public IntroducirMarcaPorClienteControlador(IntroducirMarcaPorClienteServicio marcaServicio) {
        this.marcaServicio = marcaServicio;
    }

    @PostMapping("/introducir")
    public ResponseEntity<String> introducirMarca(@RequestBody IntroducirMarcaPorClienteModelo request) {
        marcaServicio.introducirMarcaPorCliente(
                request.getClienteID(),
                request.getMarcaId()
        );
        return ResponseEntity.ok("marca insertada correctamente");
    }
}
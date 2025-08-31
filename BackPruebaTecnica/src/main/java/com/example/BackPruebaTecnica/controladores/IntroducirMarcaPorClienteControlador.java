package com.example.BackPruebaTecnica.controladores;

import com.example.BackPruebaTecnica.modelos.IntroducirMarcaPorClienteModelo;
import com.example.BackPruebaTecnica.servicios.IntroducirMarcaPorClienteServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/marca")
@CrossOrigin(origins = "*")
public class IntroducirMarcaPorClienteControlador {
    private final IntroducirMarcaPorClienteServicio marcaServicio;

    public IntroducirMarcaPorClienteControlador(IntroducirMarcaPorClienteServicio marcaServicio) {
        this.marcaServicio = marcaServicio;
    }

    @PostMapping("/introducir")
    public ResponseEntity<String> introducirMarca(@RequestBody IntroducirMarcaPorClienteModelo request) {
        marcaServicio.introducirMarcaPorCliente(
                request.getClienteId(),
                request.getMarcaId()
        );
        return ResponseEntity.ok("marca insertada correctamente");
    }
}
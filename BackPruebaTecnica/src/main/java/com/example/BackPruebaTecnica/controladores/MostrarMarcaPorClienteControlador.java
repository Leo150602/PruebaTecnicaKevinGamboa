package com.example.BackPruebaTecnica.controladores;

import com.example.BackPruebaTecnica.modelos.MarcaPorClienteModelo;
import com.example.BackPruebaTecnica.servicios.MostrarMarcaPorClienteServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/marcaPorCliente")
public class MostrarMarcaPorClienteControlador {

    private final MostrarMarcaPorClienteServicio mostrarMarcaPorClienteServicio;

    public MostrarMarcaPorClienteControlador(MostrarMarcaPorClienteServicio mostrarMarcaPorClienteServicio) {
        this.mostrarMarcaPorClienteServicio = mostrarMarcaPorClienteServicio;
    }

    // Pasamos el clienteId como parámetro en la URL
    @GetMapping("/{clienteId}")
    public ResponseEntity<List<MarcaPorClienteModelo>> mostrarMarcaPorCliente(@PathVariable int clienteId){
        List<MarcaPorClienteModelo> marcaPorCliente = mostrarMarcaPorClienteServicio.mostrarMarcaPorCliente(clienteId);
        return ResponseEntity.ok(marcaPorCliente);
    }
}

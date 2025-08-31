package com.example.BackPruebaTecnica.controladores;

import com.example.BackPruebaTecnica.modelos.EliminarMarcaPorClienteModelo;
import com.example.BackPruebaTecnica.servicios.EliminarMarcaPorClienteServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/marcaPorCliente")
@CrossOrigin(origins = "*")
public class EliminarMarcaPorClienteControlador {

    private final EliminarMarcaPorClienteServicio eliminarMarcaPorClienteServicio;

    public EliminarMarcaPorClienteControlador(EliminarMarcaPorClienteServicio eliminarMarcaPorClienteServicio) {
        this.eliminarMarcaPorClienteServicio = eliminarMarcaPorClienteServicio;

    }

    @DeleteMapping("/eliminar/{clienteId}/{marcaId}")
    public ResponseEntity<String> eliminarMarcaPorCliente(@PathVariable Integer clienteId, @PathVariable Integer marcaId){
        eliminarMarcaPorClienteServicio.eliminarMarcaPorCliente(
                clienteId,marcaId
        );
        return ResponseEntity.ok("Cliente eliminado correctamente");
    }

}

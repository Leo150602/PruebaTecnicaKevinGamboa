package com.example.BackPruebaTecnica.controladores;

import com.example.BackPruebaTecnica.servicios.EliminarClienteServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eliminarCliente")
@CrossOrigin(origins = "*")
public class EliminarClienteControlador {

    private final EliminarClienteServicio eliminarClienteServicio;

    public EliminarClienteControlador(EliminarClienteServicio eliminarClienteServicio) {
        this.eliminarClienteServicio = eliminarClienteServicio;
    }

    @DeleteMapping("/{clienteId}")
    public ResponseEntity<String> eliminarCliente(@PathVariable Integer clienteId){
        eliminarClienteServicio.eliminarCliente(clienteId);
        return ResponseEntity.ok("Cliente eliminado correctamente");
    }
}

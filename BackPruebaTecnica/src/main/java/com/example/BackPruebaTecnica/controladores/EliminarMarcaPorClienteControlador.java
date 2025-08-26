package com.example.BackPruebaTecnica.controladores;

import com.example.BackPruebaTecnica.modelos.EliminarMarcaPorClienteModelo;
import com.example.BackPruebaTecnica.servicios.EliminarMarcaPorClienteServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eliminarMarca")
public class EliminarMarcaPorClienteControlador {

    private final EliminarMarcaPorClienteServicio eliminarMarcaPorClienteServicio;

    public EliminarMarcaPorClienteControlador(EliminarMarcaPorClienteServicio eliminarMarcaPorClienteServicio) {
        this.eliminarMarcaPorClienteServicio = eliminarMarcaPorClienteServicio;

    }

    @DeleteMapping("/{clienteId}/{marcaId}")
    public ResponseEntity<String> eliminarMarcaPorCliente(@RequestBody EliminarMarcaPorClienteModelo request){
        eliminarMarcaPorClienteServicio.eliminarMarcaPorCliente(
                request.getClienteId(),
                request.getMarcaId()
        );
        return ResponseEntity.ok("Cliente eliminado correctamente");
    }

}

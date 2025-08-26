package com.example.BackPruebaTecnica.controladores;

import com.example.BackPruebaTecnica.modelos.ClientesModelo;
import com.example.BackPruebaTecnica.servicios.MostrarTodosClientesServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todosClientes")
public class MostrarTodosClientesControlador {

    private final MostrarTodosClientesServicio mostrarTodosClientesServicio;

    public MostrarTodosClientesControlador(MostrarTodosClientesServicio mostrarTodosClientesServicio) {
        this.mostrarTodosClientesServicio = mostrarTodosClientesServicio;
    }

    @GetMapping
    public ResponseEntity<List<ClientesModelo>> mostrarTodosClientes(){
        List<ClientesModelo> clientes = mostrarTodosClientesServicio.mostrarTodosClientes();
        return ResponseEntity.ok(clientes);
    }
}

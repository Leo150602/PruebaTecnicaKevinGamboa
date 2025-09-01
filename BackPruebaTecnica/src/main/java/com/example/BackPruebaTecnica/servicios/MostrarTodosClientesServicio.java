package com.example.BackPruebaTecnica.servicios;

import com.example.BackPruebaTecnica.modelos.Cliente;
import com.example.BackPruebaTecnica.modelos.ClientesModelo;
import com.example.BackPruebaTecnica.repositorios.ClienteRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MostrarTodosClientesServicio {

    private final ClienteRepositorio mostrarTodosClientesRepositorio;

    public MostrarTodosClientesServicio(ClienteRepositorio mostrarTodosClientesRepositorio) {
        this.mostrarTodosClientesRepositorio = mostrarTodosClientesRepositorio;
    }

    public List<ClientesModelo> mostrarTodosClientes(){
        return mostrarTodosClientesRepositorio.mostrarTodosClientes();
    }
}

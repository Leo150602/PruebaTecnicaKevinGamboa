package com.example.BackPruebaTecnica.servicios;

import com.example.BackPruebaTecnica.repositorios.ClienteRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class EliminarClienteServicio {

    private final ClienteRepositorio eliminarClienteRepositorio;

    public EliminarClienteServicio(ClienteRepositorio eliminarClienteRepositorio) {
        this.eliminarClienteRepositorio = eliminarClienteRepositorio;
    }

    @Transactional
    public void eliminarCliente(
            int id
    ){
        eliminarClienteRepositorio.eliminarCliente(
                id
        );
    }
}

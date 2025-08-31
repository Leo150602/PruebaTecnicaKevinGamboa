package com.example.BackPruebaTecnica.servicios;

import com.example.BackPruebaTecnica.repositorios.ClienteMarcaRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class EliminarMarcaPorClienteServicio {

    private final ClienteMarcaRepositorio eliminarMarcaPorClienteRepositorio;

    public EliminarMarcaPorClienteServicio(ClienteMarcaRepositorio eliminarMarcaPorClienteRepositorio) {
        this.eliminarMarcaPorClienteRepositorio = eliminarMarcaPorClienteRepositorio;
    }

    @Transactional
    public void eliminarMarcaPorCliente(
            Integer clienteId,
            Integer marcaId
    ){
        eliminarMarcaPorClienteRepositorio.eliminarMarcaPorCliente(
                clienteId,
                marcaId
        );
    }
}

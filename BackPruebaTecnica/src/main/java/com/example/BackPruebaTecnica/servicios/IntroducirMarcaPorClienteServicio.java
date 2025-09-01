package com.example.BackPruebaTecnica.servicios;

import com.example.BackPruebaTecnica.repositorios.ClienteMarcaRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class IntroducirMarcaPorClienteServicio {

    private final ClienteMarcaRepositorio marcaRepositorio;

    public IntroducirMarcaPorClienteServicio( ClienteMarcaRepositorio marcaRepositorio) {
        this.marcaRepositorio = marcaRepositorio;
    }

    @Transactional
    public void introducirMarcaPorCliente(
            int clienteId,
            int marcaId
    ) {
        marcaRepositorio.introducirMarcaPorCliente(
                clienteId,
                marcaId
        );
    }

}

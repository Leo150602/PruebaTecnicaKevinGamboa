package com.example.BackPruebaTecnica.servicios;

import com.example.BackPruebaTecnica.modelos.MarcaPorClienteModelo;
import com.example.BackPruebaTecnica.repositorios.ClienteMarcaRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MostrarMarcaPorClienteServicio {

    private final ClienteMarcaRepositorio mostrarMarcaPorClienteRepositorio;

    public MostrarMarcaPorClienteServicio(ClienteMarcaRepositorio mostrarMarcaPorClienteRepositorio) {
        this.mostrarMarcaPorClienteRepositorio = mostrarMarcaPorClienteRepositorio;
    }

    public List<MarcaPorClienteModelo> mostrarMarcaPorCliente(int clienteId) {
        return mostrarMarcaPorClienteRepositorio.mostrarMarcaPorCliente(clienteId);
    }
}

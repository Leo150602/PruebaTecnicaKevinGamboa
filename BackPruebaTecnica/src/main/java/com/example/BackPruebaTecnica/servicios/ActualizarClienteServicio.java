package com.example.BackPruebaTecnica.servicios;

import com.example.BackPruebaTecnica.repositorios.ClienteRepositorio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class ActualizarClienteServicio {


    private final ClienteRepositorio actualizarClienteRepositorio;

    public ActualizarClienteServicio(ClienteRepositorio actualizarClienteRepositorio) {
        this.actualizarClienteRepositorio = actualizarClienteRepositorio;
    }

    @Transactional
    public void actualizarCliente(
            Integer entradaIdCliente,
            Integer entradaTipoIdentificacion,
            Integer entradaNumeroIdentificacion,
            String entradaNombresCliente,
            String entradaApellidosCliente,
            Date entradaFechaNacimiento,
            String entradaDireccion,
            Integer entradaPais,
            Integer entradaDepartamento,
            Integer entradaCiudad
    ) {
        actualizarClienteRepositorio.actualizarCliente(
                entradaIdCliente,
                entradaTipoIdentificacion,
                entradaNumeroIdentificacion,
                entradaNombresCliente,
                entradaApellidosCliente,
                entradaFechaNacimiento,
                entradaDireccion,
                entradaPais,
                entradaDepartamento,
                entradaCiudad
        );

    }
}


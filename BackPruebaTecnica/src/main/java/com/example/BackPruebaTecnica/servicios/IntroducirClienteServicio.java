package com.example.BackPruebaTecnica.servicios;

import com.example.BackPruebaTecnica.repositorios.ClienteRepositorio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import java.sql.Date;

@Service
public class IntroducirClienteServicio {

    @PersistenceContext
    private EntityManager entityManager;

    private final ClienteRepositorio clienteRepositorio;

    public IntroducirClienteServicio(ClienteRepositorio clienteRepositorio) {
        this.clienteRepositorio = clienteRepositorio;
    }

    @Transactional
    public void introducirCliente(
            Integer entradaTipoIdentificacion,
            Long entradaNumeroIdentificacion,
            String entradaNombresCliente,
            String entradaApellidosCliente,
            Date entradaFechaNacimiento,
            String entradaDireccion,
            Integer entradaPais,
            Integer entradaDepartamento,
            Integer entradaCiudad
    ) {
        clienteRepositorio.introducirCliente(
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
        entityManager.clear();
    }
}



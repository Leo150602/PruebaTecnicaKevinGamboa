package com.example.BackPruebaTecnica.servicios;

import com.example.BackPruebaTecnica.repositorios.ClienteRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class IntroducirClienteServicio {


    private final ClienteRepositorio clienteRepositorio;

    public IntroducirClienteServicio(ClienteRepositorio clienteRepositorio) {
        this.clienteRepositorio = clienteRepositorio;
    }

    @Transactional
    public void introducirCliente(
            int entradaTipoIdentificacion,
            int entradaNumeroIdentificacion,
            String entradaNombresCliente,
            String entradaApellidosCliente,
            Date entradaFechaNacimiento,
            String entradaDireccion,
            int entradaPais,
            int entradaDepartamento,
            int entradaCiudad
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
    }
}



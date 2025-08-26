package com.example.BackPruebaTecnica.controladores;

import com.example.BackPruebaTecnica.modelos.IntroducirClienteModelo;
import com.example.BackPruebaTecnica.servicios.IntroducirClienteServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class IntroducirClienteControlador {

    private final IntroducirClienteServicio clienteServicio;

    public IntroducirClienteControlador(IntroducirClienteServicio clienteServicio) {
        this.clienteServicio = clienteServicio;
    }

    @PostMapping("/introducir")
    public ResponseEntity<String> introducirCliente(@RequestBody IntroducirClienteModelo request) {
        clienteServicio.introducirCliente(
                request.getEntradaTipoIdentificacion(),
                request.getEntradaNumeroIdentificacion(),
                request.getEntradaNombresCliente(),
                request.getEntradaApellidosCliente(),
                request.getEntradaFechaNacimiento(),
                request.getEntradaDireccion(),
                request.getEntradaPais(),
                request.getEntradaDepartamento(),
                request.getEntradaCiudad()
        );
        return ResponseEntity.ok("Cliente insertado correctamente");
    }
}



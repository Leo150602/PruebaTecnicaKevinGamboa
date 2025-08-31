package com.example.BackPruebaTecnica.controladores;

import com.example.BackPruebaTecnica.modelos.ClienteDto;
import com.example.BackPruebaTecnica.servicios.IntroducirClienteServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "*")
public class IntroducirClienteControlador {

    private final IntroducirClienteServicio clienteServicio;

    public IntroducirClienteControlador(IntroducirClienteServicio clienteServicio) {
        this.clienteServicio = clienteServicio;
    }

    @PostMapping("/introducir")
    public ResponseEntity<String> introducirCliente(@RequestBody ClienteDto request) {
        clienteServicio.introducirCliente(
                request.getTipoIdentificacion(),
                request.getNumeroIdentificacion(),
                request.getNombresCliente(),
                request.getApellidosCliente(),
                request.getFechaNacimiento(),
                request.getDireccion(),
                request.getPais(),
                request.getDepartamento(),
                request.getCiudad()
        );
        return ResponseEntity.ok("Cliente insertado correctamente");
    }
}



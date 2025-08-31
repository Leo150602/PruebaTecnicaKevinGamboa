package com.example.BackPruebaTecnica.controladores;

import com.example.BackPruebaTecnica.modelos.ActualizarClienteModelo;
import com.example.BackPruebaTecnica.servicios.ActualizarClienteServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
@CrossOrigin(origins = "*")
public class ActualizarClienteControlador {

    private final ActualizarClienteServicio actualizarClienteServicio;

    public ActualizarClienteControlador(ActualizarClienteServicio actualizarClienteServicio) {
        this.actualizarClienteServicio = actualizarClienteServicio;
    }

    @PutMapping("/actualizar")
    public ResponseEntity<String> actualizarCliente(@RequestBody ActualizarClienteModelo request) {
        actualizarClienteServicio.actualizarCliente(
                request.getEntradaIdCliente(),
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
    return ResponseEntity.ok("Cliente actualizado correctamente");
    }

}

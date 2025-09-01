package com.example.BackPruebaTecnica.controladores;

import com.example.BackPruebaTecnica.modelos.IntroducirCiudadModelo;
import com.example.BackPruebaTecnica.modelos.IntroducirDepartamentoModelo;
import com.example.BackPruebaTecnica.servicios.IntroducirUbicacionServicio;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class IntroducirUbicacionControlador {

    private final IntroducirUbicacionServicio introducirUbicacionServicio;

    public IntroducirUbicacionControlador(IntroducirUbicacionServicio introducirUbicacionServicio) {
        this.introducirUbicacionServicio = introducirUbicacionServicio;
    }

    @PostMapping("/pais/introducir")
    public ResponseEntity<String> IntroducirPais(@RequestBody String request){
        introducirUbicacionServicio.introducirPais(request);
        return ResponseEntity.ok("pais Registrado");
    }

    @PostMapping("/departamento/introducir")
    public ResponseEntity<String> IntroducirDepartamento(@RequestBody IntroducirDepartamentoModelo request){
        introducirUbicacionServicio.introducirDepartamento(
                request.getIdPais(),
                request.getDepartamento()
        );
        return ResponseEntity.ok("departamento Registrado");
    }

    @PostMapping("/ciudad/introducir")
    public ResponseEntity<String> IntroducirCiudad(@RequestBody IntroducirCiudadModelo request){
        introducirUbicacionServicio.introducirCiudad(
                request.getIdDepartamento(),
                request.getCiudad()
        );
        return ResponseEntity.ok("ciudad Registrado");
    }




}

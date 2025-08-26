package com.example.BackPruebaTecnica.controladores;

import com.example.BackPruebaTecnica.modelos.DepartamentosModelo;
import com.example.BackPruebaTecnica.servicios.MostrarDepartamentosServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departamentos")
public class MostrarDepartamentosControlador {

    private final MostrarDepartamentosServicio mostrarDepartamentosServicio;

    public MostrarDepartamentosControlador(MostrarDepartamentosServicio mostrarDepartamentosServicio) {
        this.mostrarDepartamentosServicio = mostrarDepartamentosServicio;
    }

    @GetMapping
    public ResponseEntity<List<DepartamentosModelo>> mostrarDepartamentos(Integer departamentoId){
        List<DepartamentosModelo> departamentos = mostrarDepartamentosServicio.mostrarDepartamentos(departamentoId);
        return ResponseEntity.ok(departamentos);
    }
}

package com.example.BackPruebaTecnica.controladores;

import com.example.BackPruebaTecnica.modelos.DepartamentosModelo;
import com.example.BackPruebaTecnica.servicios.MostrarDepartamentosServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamentos")
@CrossOrigin(origins = "*")
public class MostrarDepartamentosControlador {

    private final MostrarDepartamentosServicio mostrarDepartamentosServicio;

    public MostrarDepartamentosControlador(MostrarDepartamentosServicio mostrarDepartamentosServicio) {
        this.mostrarDepartamentosServicio = mostrarDepartamentosServicio;
    }

    @GetMapping("/{paisId}")
    public ResponseEntity<List<DepartamentosModelo>> mostrarDepartamentos(@PathVariable Integer paisId) {
        List<DepartamentosModelo> departamentos = mostrarDepartamentosServicio.mostrarDepartamentos(paisId);
        return ResponseEntity.ok(departamentos);
    }
}

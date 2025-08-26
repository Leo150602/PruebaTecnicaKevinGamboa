package com.example.BackPruebaTecnica.repositorios;

import com.example.BackPruebaTecnica.modelos.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UbicacionRepositorio extends JpaRepository<Pais, Integer> {

    @Query(value = "CALL mostrarPaises()", nativeQuery = true)
    List<PaisesModelo> mostrarPaises();

    @Query(value = "CALL mostrarDepartamentos(:paisId)", nativeQuery = true)
    List<DepartamentosModelo> mostrarDepartamentos(@Param("paisId") Integer paisId);

    @Query(value = "CALL mostrarCiudades(:departamentoId)", nativeQuery = true)
    List<CiudadesModelo> mostrarCiudades(@Param("departamentoId") Integer departamentoId);

    @Query(value = "CALL mostrarTipoIdentificacion(:tipoId)", nativeQuery = true)
    List<TipoIdentificacionModelo> mostrarTipoIdentificacion(@Param("tipoId") Integer tipoId);
}
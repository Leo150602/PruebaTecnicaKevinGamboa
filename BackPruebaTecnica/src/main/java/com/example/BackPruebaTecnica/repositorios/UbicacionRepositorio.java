package com.example.BackPruebaTecnica.repositorios;

import com.example.BackPruebaTecnica.modelos.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UbicacionRepositorio extends JpaRepository<Pais, Integer> {

    @Query(value = "CALL mostrar_paises()", nativeQuery = true)
    List<PaisesModelo> mostrarPaises();

    @Query(value = "CALL mostrar_departamentos(:pais_id)", nativeQuery = true)
    List<DepartamentosModelo> mostrarDepartamentos(@Param("pais_id") Integer paisId);

    @Query(value = "CALL mostrar_ciudades(:departamento_id)", nativeQuery = true)
    List<CiudadesModelo> mostrarCiudades(@Param("departamento_id") Integer departamentoId);

    @Query(value = "CALL mostrar_tipo_identificacion()", nativeQuery = true)
    List<TipoIdentificacionModelo> mostrarTipoIdentificacion();
}

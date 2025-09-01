package com.example.BackPruebaTecnica.repositorios;

import com.example.BackPruebaTecnica.modelos.*;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
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

    @Modifying
    @Transactional
    @Query(value = "CALL introducir_pais(:entradaPais)", nativeQuery = true)
    void introducirPais(@Param("entradaPais") String entradaPais);

    @Modifying
    @Transactional
    @Query(value = "CALL introducir_departamento(:entradaIdPais, :entradaDepartamento)", nativeQuery = true)
    void introducirDepartamento(
            @Param("entradaIdPais") Integer entradaIdPais,
            @Param("entradaDepartamento") String entradaDepartamento
    );

    @Modifying
    @Transactional
    @Query(value = "CALL introducir_ciudad(:entradaIdDepartamento, :entradaCiudad)", nativeQuery = true)
    void introducirCiudad(
            @Param("entradaIdDepartamento") Integer entradaIdDepartamento,
            @Param("entradaCiudad") String entradaCiudad
    );
}

package com.example.BackPruebaTecnica.repositorios;

import com.example.BackPruebaTecnica.modelos.Cliente;
import com.example.BackPruebaTecnica.modelos.ClientesModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {

    @Query(value = "CALL introducirCliente(:tipoId, :numId, :nombres, :apellidos, :fechaNac, :direccion, :pais, :departamento, :ciudad)", nativeQuery = true)
    void introducirCliente(
            @Param("tipoId") Integer tipoId,
            @Param("numId") Integer numId,
            @Param("nombres") String nombres,
            @Param("apellidos") String apellidos,
            @Param("fechaNac") Date fechaNac,
            @Param("direccion") String direccion,
            @Param("pais") Integer pais,
            @Param("departamento") Integer departamento,
            @Param("ciudad") Integer ciudad
    );

    @Query(value = "CALL mostrarTodosClientes()", nativeQuery = true)
    List<ClientesModelo> mostrarTodosClientes();

    @Query(value = "CALL actualizarCliente(:id, :tipoId, :numId, :nombres, :apellidos, :fechaNac, :direccion, :pais, :departamento, :ciudad)", nativeQuery = true)
    void actualizarCliente(
            @Param("id") Integer id,
            @Param("tipoId") Integer tipoId,
            @Param("numId") Integer numId,
            @Param("nombres") String nombres,
            @Param("apellidos") String apellidos,
            @Param("fechaNac") Date fechaNac,
            @Param("direccion") String direccion,
            @Param("pais") Integer pais,
            @Param("departamento") Integer departamento,
            @Param("ciudad") Integer ciudad
    );

    @Query(value = "CALL eliminarCliente(:id)", nativeQuery = true)
    void eliminarCliente(@Param("id") Integer id);


}

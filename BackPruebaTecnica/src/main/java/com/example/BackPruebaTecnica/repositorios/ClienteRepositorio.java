package com.example.BackPruebaTecnica.repositorios;

import com.example.BackPruebaTecnica.modelos.Cliente;
import com.example.BackPruebaTecnica.modelos.ClientesModelo;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {

    @Modifying
    @Transactional
    @Query(value = "CALL introducir_cliente(:id_tipo, :id_numero, :nombres, :apellidos, :fecha_nacimiento, :direccion, :id_pais, :id_departamento, :id_ciudad)", nativeQuery = true)
    void introducirCliente(
            @Param("id_tipo") Integer tipoId,
            @Param("id_numero") Long numId,
            @Param("nombres") String nombres,
            @Param("apellidos") String apellidos,
            @Param("fecha_nacimiento") Date fechaNac,
            @Param("direccion") String direccion,
            @Param("id_pais") Integer pais,
            @Param("id_departamento") Integer departamento,
            @Param("id_ciudad") Integer ciudad
    );

    @Query(value = "CALL mostrar_todos_clientes()", nativeQuery = true)
    List<ClientesModelo> mostrarTodosClientes();

    @Modifying(clearAutomatically = true, flushAutomatically = true)
    @Transactional
    @Query(value = "CALL actualizar_cliente(:entrada_id_cliente, :entrada_id_tipo_identificacion, :entrada_numero_identificacion, :entrada_nombres_cliente, :entrada_apellidos_cliente, :entrada_fecha_nacimiento, :entrada_direccion, :entrada_id_pais, :entrada_id_departamento, :entrada_id_ciudad)", nativeQuery = true)
    void actualizarCliente(
            @Param("entrada_id_cliente") Integer idCliente,
            @Param("entrada_id_tipo_identificacion") Integer tipoId,
            @Param("entrada_numero_identificacion") Integer numId,
            @Param("entrada_nombres_cliente") String nombres,
            @Param("entrada_apellidos_cliente") String apellidos,
            @Param("entrada_fecha_nacimiento") Date fechaNac,
            @Param("entrada_direccion") String direccion,
            @Param("entrada_id_pais") Integer pais,
            @Param("entrada_id_departamento") Integer departamento,
            @Param("entrada_id_ciudad") Integer ciudad
    );

    @Modifying
    @Transactional
    @Query(value = "CALL eliminar_cliente(:id)", nativeQuery = true)
    void eliminarCliente(@Param("id") Integer id);
}

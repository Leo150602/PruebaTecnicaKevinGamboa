package com.example.BackPruebaTecnica.repositorios;

import com.example.BackPruebaTecnica.modelos.ClienteMarca;
import com.example.BackPruebaTecnica.modelos.ClienteMarcaId;
import com.example.BackPruebaTecnica.modelos.MarcaPorClienteModelo;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteMarcaRepositorio extends JpaRepository<ClienteMarca, ClienteMarcaId> {

    @Modifying
    @Transactional
    @Query(value = "CALL introducir_marca_por_cliente(:id_cliente, :id_marca)", nativeQuery = true)
    void introducirMarcaPorCliente(
            @Param("id_cliente") Integer idCliente,
            @Param("id_marca") Integer idMarca

    );

    @Modifying
    @Transactional
    @Query(value = "CALL eliminar_marca_por_cliente(:id_cliente, :id_marca)", nativeQuery = true)
    void eliminarMarcaPorCliente(
            @Param("id_cliente") Integer idCliente,
            @Param("id_marca") Integer idMarca
    );

    @Query(value = "CALL mostrar_marcas_por_cliente(:id_cliente)", nativeQuery = true)
    List<MarcaPorClienteModelo> mostrarMarcaPorCliente(@Param("id_cliente") Integer idCliente);
}


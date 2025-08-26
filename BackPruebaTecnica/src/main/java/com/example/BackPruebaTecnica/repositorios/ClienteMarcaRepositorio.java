package com.example.BackPruebaTecnica.repositorios;

import com.example.BackPruebaTecnica.modelos.ClienteMarca;
import com.example.BackPruebaTecnica.modelos.ClienteMarcaId;
import com.example.BackPruebaTecnica.modelos.MarcaPorClienteModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteMarcaRepositorio extends JpaRepository<ClienteMarca, ClienteMarcaId> {

    @Query(value = "CALL introducirMarcaPorCliente(:clienteId, :marcaId)", nativeQuery = true)
    void introducirMarcaPorCliente(
            @Param("clienteId") Integer clienteId,
            @Param("marcaId") Integer marcaId
    );

    @Query(value = "CALL eliminarMarcaPorCliente(:clienteId, :marcaId)", nativeQuery = true)
    void eliminarMarcaPorCliente(
            @Param("clienteId") Integer clienteId,
            @Param("marcaId") Integer marcaId
    );

    @Query(value = "CALL mostrarMarcaPorCliente(:clienteId)", nativeQuery = true)
    List<MarcaPorClienteModelo> mostrarMarcaPorCliente(@Param("clienteId") Integer clienteId);
}

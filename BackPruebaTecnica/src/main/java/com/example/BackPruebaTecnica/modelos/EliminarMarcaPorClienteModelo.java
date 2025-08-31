package com.example.BackPruebaTecnica.modelos;

public class EliminarMarcaPorClienteModelo {
    private Integer clienteId;
    private Integer marcaId;

    public EliminarMarcaPorClienteModelo() {
    }

    public EliminarMarcaPorClienteModelo(Integer clienteId, Integer marcaId) {
        this.clienteId = clienteId;
        this.marcaId = marcaId;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void getClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public Integer getMarcaId() {
        return marcaId;
    }

    public void setMarcaId(Integer marcaId) {
        this.marcaId = marcaId;
    }
}

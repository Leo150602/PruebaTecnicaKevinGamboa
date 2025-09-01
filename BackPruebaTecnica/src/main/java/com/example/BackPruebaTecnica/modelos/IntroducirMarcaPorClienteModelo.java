package com.example.BackPruebaTecnica.modelos;

public class IntroducirMarcaPorClienteModelo {
    private Integer clienteId;
    private Integer marcaId;

    public IntroducirMarcaPorClienteModelo() {
    }

    public IntroducirMarcaPorClienteModelo(Integer clienteId, Integer marcaId) {
        this.clienteId = clienteId;
        this.marcaId = marcaId;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public Integer getMarcaId() {
        return marcaId;
    }

    public void setMarcaId(Integer marcaId) {
        this.marcaId = marcaId;
    }
}

package com.example.BackPruebaTecnica.modelos;

public class IntroducirMarcaPorClienteModelo {
    private Integer clienteID;
    private Integer marcaId;

    public IntroducirMarcaPorClienteModelo() {
    }

    public IntroducirMarcaPorClienteModelo(Integer clienteID, Integer marcaId) {
        this.clienteID = clienteID;
        this.marcaId = marcaId;
    }

    public Integer getClienteID() {
        return clienteID;
    }

    public void setClienteID(Integer clienteID) {
        this.clienteID = clienteID;
    }

    public Integer getMarcaId() {
        return marcaId;
    }

    public void setMarcaId(Integer marcaId) {
        this.marcaId = marcaId;
    }
}

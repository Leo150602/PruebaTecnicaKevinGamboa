package com.example.BackPruebaTecnica.modelos;

public class MarcaPorClienteModelo {

    private Integer idMarca;
    private String marca;

    public MarcaPorClienteModelo() {
    }

    public MarcaPorClienteModelo(Integer idMarca, String marca) {
        this.idMarca = idMarca;
        this.marca = marca;
    }

    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

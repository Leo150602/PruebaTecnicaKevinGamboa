package com.example.BackPruebaTecnica.modelos;

public class MarcaPorClienteModelo {

    private Integer idMarca;
    private Integer marca;

    public MarcaPorClienteModelo() {
    }

    public MarcaPorClienteModelo(Integer idMarca, Integer marca) {
        this.idMarca = idMarca;
        this.marca = marca;
    }

    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public Integer getMarca() {
        return marca;
    }

    public void setMarca(Integer marca) {
        this.marca = marca;
    }
}

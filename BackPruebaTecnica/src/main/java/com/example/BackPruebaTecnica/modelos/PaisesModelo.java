package com.example.BackPruebaTecnica.modelos;

public class PaisesModelo {
    private Integer idPais;
    private String pais;

    public PaisesModelo() {
    }

    public PaisesModelo(Integer idPais, String pais) {
        this.idPais = idPais;
        this.pais = pais;
    }

    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}

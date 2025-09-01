package com.example.BackPruebaTecnica.modelos;

public class IntroducirCiudadModelo {

    private Integer idDepartamento;
    private String ciudad;

    public IntroducirCiudadModelo() {
    }

    public IntroducirCiudadModelo(Integer idDepartamento, String ciudad) {
        this.idDepartamento = idDepartamento;
        this.ciudad = ciudad;
    }

    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}

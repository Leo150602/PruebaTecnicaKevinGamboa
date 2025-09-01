package com.example.BackPruebaTecnica.modelos;

public class IntroducirDepartamentoModelo {

    private Integer idPais;
    private String departamento;

    public IntroducirDepartamentoModelo() {
    }

    public IntroducirDepartamentoModelo(Integer idPais, String departamento) {
        this.idPais = idPais;
        this.departamento = departamento;
    }

    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}

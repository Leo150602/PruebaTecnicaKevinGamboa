package com.example.BackPruebaTecnica.modelos;

public class CiudadesModelo {

    private Integer idCiudad;
    private String ciudad;

    public CiudadesModelo() {
    }

    public CiudadesModelo(Integer idCiudad, String ciudad) {
        this.idCiudad = idCiudad;
        this.ciudad = ciudad;
    }

    public Integer getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Integer idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}

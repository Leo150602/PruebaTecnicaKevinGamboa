package com.example.BackPruebaTecnica.modelos;

public class TipoIdentificacionModelo {
    private Integer idTipoIdentificacion;
    private String tipoIdentificacion;

    public TipoIdentificacionModelo() {
    }

    public TipoIdentificacionModelo(Integer idTipoIdentificacion, String tipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public Integer getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    public void setIdTipoIdentificacion(Integer idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }
}

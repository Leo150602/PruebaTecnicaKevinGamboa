package com.example.BackPruebaTecnica.modelos;

import java.sql.Date;


public class IntroducirClienteModelo {
    private int entradaTipoIdentificacion;
    private int entradaNumeroIdentificacion;
    private String entradaNombresCliente;
    private String entradaApellidosCliente;
    private Date entradaFechaNacimiento;
    private String entradaDireccion;
    private int entradaPais;
    private int entradaDepartamento;
    private int entradaCiudad;

    public IntroducirClienteModelo() {
    }

    public IntroducirClienteModelo(int entradaTipoIdentificacion, int entradaCiudad, int entradaDepartamento, int entradaPais, String entradaDireccion, String entradaApellidosCliente, int entradaNumeroIdentificacion, String entradaNombresCliente, Date entradaFechaNacimiento) {
        this.entradaTipoIdentificacion = entradaTipoIdentificacion;
        this.entradaCiudad = entradaCiudad;
        this.entradaDepartamento = entradaDepartamento;
        this.entradaPais = entradaPais;
        this.entradaDireccion = entradaDireccion;
        this.entradaApellidosCliente = entradaApellidosCliente;
        this.entradaNumeroIdentificacion = entradaNumeroIdentificacion;
        this.entradaNombresCliente = entradaNombresCliente;
        this.entradaFechaNacimiento = entradaFechaNacimiento;
    }

    public int getEntradaTipoIdentificacion() {
        return entradaTipoIdentificacion;
    }

    public void setEntradaTipoIdentificacion(int entradaTipoIdentificacion) {
        this.entradaTipoIdentificacion = entradaTipoIdentificacion;
    }

    public int getEntradaNumeroIdentificacion() {
        return entradaNumeroIdentificacion;
    }

    public void setEntradaNumeroIdentificacion(int entradaNumeroIdentificacion) {
        this.entradaNumeroIdentificacion = entradaNumeroIdentificacion;
    }

    public String getEntradaNombresCliente() {
        return entradaNombresCliente;
    }

    public void setEntradaNombresCliente(String entradaNombresCliente) {
        this.entradaNombresCliente = entradaNombresCliente;
    }

    public String getEntradaApellidosCliente() {
        return entradaApellidosCliente;
    }

    public void setEntradaApellidosCliente(String entradaApellidosCliente) {
        this.entradaApellidosCliente = entradaApellidosCliente;
    }

    public Date getEntradaFechaNacimiento() {
        return entradaFechaNacimiento;
    }

    public void setEntradaFechaNacimiento(Date entradaFechaNacimiento) {
        this.entradaFechaNacimiento = entradaFechaNacimiento;
    }

    public int getEntradaPais() {
        return entradaPais;
    }

    public void setEntradaPais(int entradaPais) {
        this.entradaPais = entradaPais;
    }

    public String getEntradaDireccion() {
        return entradaDireccion;
    }

    public void setEntradaDireccion(String entradaDireccion) {
        this.entradaDireccion = entradaDireccion;
    }

    public int getEntradaDepartamento() {
        return entradaDepartamento;
    }

    public void setEntradaDepartamento(int entradaDepartamento) {
        this.entradaDepartamento = entradaDepartamento;
    }

    public int getEntradaCiudad() {
        return entradaCiudad;
    }

    public void setEntradaCiudad(int entradaCiudad) {
        this.entradaCiudad = entradaCiudad;
    }
}

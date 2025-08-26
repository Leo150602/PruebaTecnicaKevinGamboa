package com.example.BackPruebaTecnica.modelos;

import java.sql.Date;

public class ActualizarClienteModelo {

    private int entradaIdCliente;
    private int entradaTipoIdentificacion;
    private int entradaNumeroIdentificacion;
    private String entradaNombresCliente;
    private String entradaApellidosCliente;
    private Date entradaFechaNacimiento;
    private String entradaDireccion;
    private int entradaPais;
    private int entradaDepartamento;
    private int entradaCiudad;

    public ActualizarClienteModelo() {
    }

    public ActualizarClienteModelo(int entradaIdCliente, int entradaTipoIdentificacion, int entradaNumeroIdentificacion, String entradaNombresCliente, String entradaApellidosCliente, Date entradaFechaNacimiento, String entradaDireccion, int entradaPais, int entradaDepartamento, int entradaCiudad) {
        this.entradaIdCliente = entradaIdCliente;
        this.entradaTipoIdentificacion = entradaTipoIdentificacion;
        this.entradaNumeroIdentificacion = entradaNumeroIdentificacion;
        this.entradaNombresCliente = entradaNombresCliente;
        this.entradaApellidosCliente = entradaApellidosCliente;
        this.entradaFechaNacimiento = entradaFechaNacimiento;
        this.entradaDireccion = entradaDireccion;
        this.entradaPais = entradaPais;
        this.entradaDepartamento = entradaDepartamento;
        this.entradaCiudad = entradaCiudad;
    }

    public int getEntradaIdCliente() {
        return entradaIdCliente;
    }

    public void setEntradaIdCliente(int entradaIdCliente) {
        this.entradaIdCliente = entradaIdCliente;
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

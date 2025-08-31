package com.example.BackPruebaTecnica.modelos;
import jakarta.persistence.*;

import java.sql.Date;


@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer idCliente;

    @Column(name = "id_tipo_identificacion")
    private Integer idTipoIdentificacion;

    @Column(name = "numero_identificacion")
    private Integer numeroIdentificacion;

    @Column(name = "nombres_cliente")
    private String nombresCliente;

    @Column(name = "apellidos_cliente")
    private String apellidosCliente;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "id_pais")
    private Integer idPais;

    @Column(name = "id_departamento")
    private Integer idDepartamento;

    @Column(name = "id_ciudad")
    private Integer idCiudad;

    public Cliente() {
    }

    public Cliente(Integer idCliente, Integer idTipoIdentificacion, Integer numeroIdentificacion, String nombresCliente, String apellidosCliente, Date fechaNacimiento, String direccion, Integer idPais, Integer idDepartamento, Integer idCiudad) {
        this.idCliente = idCliente;
        this.idTipoIdentificacion = idTipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombresCliente = nombresCliente;
        this.apellidosCliente = apellidosCliente;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.idPais = idPais;
        this.idDepartamento = idDepartamento;
        this.idCiudad = idCiudad;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    public void setIdTipoIdentificacion(Integer idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }

    public Integer getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(Integer numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombresCliente() {
        return nombresCliente;
    }

    public void setNombresCliente(String nombresCliente) {
        this.nombresCliente = nombresCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Integer getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Integer idCiudad) {
        this.idCiudad = idCiudad;
    }
}
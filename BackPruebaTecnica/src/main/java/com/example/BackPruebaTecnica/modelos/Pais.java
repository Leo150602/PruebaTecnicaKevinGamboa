package com.example.BackPruebaTecnica.modelos;
import jakarta.persistence.*;

@Entity
@Table(name = "pais")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPais;

    @Column(name = "pais")
    private String pais;

    public Integer getIdPais() { return idPais; }
    public void setIdPais(Integer idPais) { this.idPais = idPais; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }
}

package com.example.BackPruebaTecnica.modelos;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;
@Embeddable
public class ClienteMarcaId implements Serializable{
    private Integer idCliente;
    private Integer idMarca;

    public ClienteMarcaId() {
    }

    public ClienteMarcaId(Integer idCliente, Integer idMarca) {
        this.idCliente = idCliente;
        this.idMarca = idMarca;
    }

    public Integer getIdCliente() { return idCliente; }
    public void setIdCliente(Integer idCliente) { this.idCliente = idCliente; }

    public Integer getIdMarca() { return idMarca; }
    public void setIdMarca(Integer idMarca) { this.idMarca = idMarca; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClienteMarcaId)) return false;
        ClienteMarcaId that = (ClienteMarcaId) o;
        return Objects.equals(idCliente, that.idCliente) &&
                Objects.equals(idMarca, that.idMarca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, idMarca);
    }
}

package com.sofkau.virtualwallet.collection;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Objects;

@Data
@Document(collection = "colaborador")
public class Colaborador {
    //atributos
    @Id
    private String id;
    private String email;
    private String nombre;
    private Double balance;
    private List<Contactos> listaContactos;

    @Override
    public String toString() {
        return "Colaborador{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", nombre='" + nombre + '\'' +
                ", balance=" + balance +
                ", listaContactos=" + listaContactos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Colaborador that = (Colaborador) o;
        return id.equals(that.id) && email.equals(that.email) && nombre.equals(that.nombre) && balance.equals(that.balance) && listaContactos.equals(that.listaContactos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, nombre, balance, listaContactos);
    }
}

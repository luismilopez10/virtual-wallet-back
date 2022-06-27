package com.sofkau.virtualwallet.collection;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Data
@Document(collection = "transacciones")
public class Transacciones {
    @Id
    private String id;
    private String origen;
    private String destinatario;
    private Double cantidad;
    private String fecha;

    @Override
    public String toString() {
        return "Transacciones{" +
                "id='" + id + '\'' +
                ", origen='" + origen + '\'' +
                ", destinatario='" + destinatario + '\'' +
                ", cantidad=" + cantidad +
                ", fecha='" + fecha + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transacciones that = (Transacciones) o;
        return id.equals(that.id) && origen.equals(that.origen) && destinatario.equals(that.destinatario) && cantidad.equals(that.cantidad) && fecha.equals(that.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, origen, destinatario, cantidad, fecha);
    }
}

package com.sofkau.virtualwallet.collection;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Objects;

@Data
@Document(collection = "collaborator")
public class Collaborator {
    //atributos
    @Id
    private String id;
    private String email;
    private String name;
    private Double balance;
    private List<Contacts> contactsList;

    @Override
    public String toString() {
        return "Collaborator{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", contactsList=" + contactsList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Collaborator that = (Collaborator) o;
        return id.equals(that.id) && email.equals(that.email) && name.equals(that.name) && balance.equals(that.balance) && contactsList.equals(that.contactsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, name, balance, contactsList);
    }
}

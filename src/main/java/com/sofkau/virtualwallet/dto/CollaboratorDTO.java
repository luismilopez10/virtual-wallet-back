package com.sofkau.virtualwallet.dto;

import com.sofkau.virtualwallet.collection.Contacts;
import lombok.Data;

import java.util.List;

@Data
public class CollaboratorDTO {
    private String email;
    private String name;
    private Double balance;
    private List<Contacts> contactsList;
    private Boolean logged;
}

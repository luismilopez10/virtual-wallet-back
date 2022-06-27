package com.sofkau.virtualwallet.dto;

import com.sofkau.virtualwallet.collection.Contactos;
import lombok.Data;

import java.util.List;

@Data
public class ColaboradorDTO {
    private String id;
    private String email;
    private String nombre;
    private Double balance;
    private List<Contactos> listaContactos;
}

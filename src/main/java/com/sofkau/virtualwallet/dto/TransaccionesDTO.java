package com.sofkau.virtualwallet.dto;

import lombok.Data;

@Data
public class TransaccionesDTO {
    private String id;
    private String origen;
    private String destinatario;
    private Double cantidad;
    private String fecha;
}

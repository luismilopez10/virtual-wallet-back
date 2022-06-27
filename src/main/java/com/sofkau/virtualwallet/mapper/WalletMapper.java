package com.sofkau.virtualwallet.mapper;

import com.sofkau.virtualwallet.collection.Admin;
import com.sofkau.virtualwallet.collection.Colaborador;
import com.sofkau.virtualwallet.collection.Transacciones;
import com.sofkau.virtualwallet.dto.AdminDTO;
import com.sofkau.virtualwallet.dto.ColaboradorDTO;
import com.sofkau.virtualwallet.dto.TransaccionesDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.config.EnableWebFlux;

@Component
@EnableWebFlux
@RequiredArgsConstructor
public class WalletMapper {
    private final ModelMapper modelMapper = new ModelMapper();

    public AdminDTO toAdminDTO(Admin admin) {
        return modelMapper.map(admin, AdminDTO.class);
    }

    public Admin toEntity(AdminDTO dto) {
        return modelMapper.map(dto, Admin.class);
    }

    public ColaboradorDTO toColaboradorDTO(Colaborador colab) {
        return modelMapper.map(colab, ColaboradorDTO.class);
    }

    public Colaborador toEntity(ColaboradorDTO dto) {
        return modelMapper.map(dto, Colaborador.class);
    }

    public TransaccionesDTO toTransaccionesDTO(Transacciones transac) {
        return modelMapper.map(transac, TransaccionesDTO.class);
    }

    public Transacciones toEntity(TransaccionesDTO dto) {
        return modelMapper.map(dto, Transacciones.class);
    }
}

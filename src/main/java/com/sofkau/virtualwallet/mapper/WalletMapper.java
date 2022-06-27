package com.sofkau.virtualwallet.mapper;

import com.sofkau.virtualwallet.collection.Admin;
import com.sofkau.virtualwallet.collection.Colaborador;
import com.sofkau.virtualwallet.collection.Transactions;
import com.sofkau.virtualwallet.dto.AdminDTO;
import com.sofkau.virtualwallet.dto.CollaboratorDTO;
import com.sofkau.virtualwallet.dto.TransactionsDTO;
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

    public CollaboratorDTO toColaboradorDTO(Colaborador colab) {
        return modelMapper.map(colab, CollaboratorDTO.class);
    }

    public Colaborador toEntity(CollaboratorDTO dto) {
        return modelMapper.map(dto, Colaborador.class);
    }

    public TransactionsDTO toTransaccionesDTO(Transactions transac) {
        return modelMapper.map(transac, TransactionsDTO.class);
    }

    public Transactions toEntity(TransactionsDTO dto) {
        return modelMapper.map(dto, Transactions.class);
    }
}

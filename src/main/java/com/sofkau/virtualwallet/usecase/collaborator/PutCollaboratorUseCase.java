package com.sofkau.virtualwallet.usecase.collaborator;

import com.sofkau.virtualwallet.dto.CollaboratorDTO;
import com.sofkau.virtualwallet.mapper.WalletMapper;
import com.sofkau.virtualwallet.repository.IColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class PutCollaboratorUseCase {

    @Autowired
    private IColaboradorRepository iColaboradorRepository;
    @Autowired
    private WalletMapper walletMapper;

    public Mono<CollaboratorDTO> apply(CollaboratorDTO dto){
        return iColaboradorRepository
                .save(walletMapper.toEntity(dto))
                .map(walletMapper::toCollaboratorDTO);}
}

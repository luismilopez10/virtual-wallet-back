package com.sofkau.virtualwallet.usecase.collaborator;

import com.sofkau.virtualwallet.dto.CollaboratorDTO;
import com.sofkau.virtualwallet.mapper.WalletMapper;
import com.sofkau.virtualwallet.repository.ICollaboratorRepository;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class PostCollaboratorUseCase {
    private ICollaboratorRepository iCollaboratorRepository;
    private WalletMapper walletMapper;

    public PostCollaboratorUseCase(ICollaboratorRepository iCollaboratorRepository, WalletMapper walletMapper) {
        this.iCollaboratorRepository = iCollaboratorRepository;
        this.walletMapper = walletMapper;
    }

    public Mono<CollaboratorDTO> apply(CollaboratorDTO dto){
        return iCollaboratorRepository
                .save(walletMapper.toCollaboratorEntity(dto))
                .map(walletMapper::toCollaboratorDTO);}
}

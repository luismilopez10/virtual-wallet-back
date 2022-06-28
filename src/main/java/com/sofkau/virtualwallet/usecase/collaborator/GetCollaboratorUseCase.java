package com.sofkau.virtualwallet.usecase.collaborator;

import com.sofkau.virtualwallet.dto.CollaboratorDTO;
import com.sofkau.virtualwallet.mapper.WalletMapper;
import com.sofkau.virtualwallet.repository.ICollaboratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class GetCollaboratorUseCase {
    @Autowired
    private ICollaboratorRepository iCollaboratorRepository;
    @Autowired
    private WalletMapper walletMapper;


    public Flux<CollaboratorDTO> apply(){return iCollaboratorRepository.findAll().map(walletMapper::toCollaboratorDTO);}
}
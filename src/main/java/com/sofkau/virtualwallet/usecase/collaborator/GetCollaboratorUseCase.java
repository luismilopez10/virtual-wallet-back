package com.sofkau.virtualwallet.usecase.collaborator;

import com.sofkau.virtualwallet.dto.CollaboratorDTO;
import com.sofkau.virtualwallet.mapper.WalletMapper;
import com.sofkau.virtualwallet.repository.IColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class GetCollaboratorUseCase {
    @Autowired
    private IColaboradorRepository iColaboradorRepository;
    @Autowired
    private WalletMapper walletMapper;

    public GetCollaboratorUseCase(IColaboradorRepository iColaboradorRepository, WalletMapper walletMapper) {
        this.iColaboradorRepository = iColaboradorRepository;
        this.walletMapper = walletMapper;
    }

    public Flux<CollaboratorDTO> apply(){return iColaboradorRepository.findAll().map(walletMapper::toCollaboratorDTO);}
}

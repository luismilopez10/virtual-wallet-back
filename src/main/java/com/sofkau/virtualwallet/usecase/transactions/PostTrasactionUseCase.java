package com.sofkau.virtualwallet.usecase.transactions;

import com.sofkau.virtualwallet.collection.Collaborator;
import com.sofkau.virtualwallet.dto.CollaboratorDTO;
import com.sofkau.virtualwallet.dto.TransactionsDTO;
import com.sofkau.virtualwallet.mapper.WalletMapper;
import com.sofkau.virtualwallet.repository.ICollaboratorRepository;
import com.sofkau.virtualwallet.repository.ITransactionsRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class PostTrasactionUseCase { ;
    private ITransactionsRepository repository;
    private WalletMapper mapper;

    public PostTrasactionUseCase(ITransactionsRepository repository, WalletMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Mono<TransactionsDTO> apply (TransactionsDTO dto) {
        return repository.save(mapper.toTransactionsEntity(dto)).map(transactions -> mapper.toTransactionsDTO(transactions));
    } 
}

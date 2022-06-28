package com.sofkau.virtualwallet.usecase.transactions;

import com.sofkau.virtualwallet.dto.TransactionsDTO;
import com.sofkau.virtualwallet.mapper.WalletMapper;
import com.sofkau.virtualwallet.repository.ITransactionsRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class GetTransactionOutUseCase {
    private ITransactionsRepository repository;
    private WalletMapper mapper;

    public GetTransactionOutUseCase(ITransactionsRepository repository, WalletMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Flux<TransactionsDTO> apply (String email) {
        return repository.findAll().filter(transactions -> email.equals(transactions.getSource()))
                .map(transactions -> mapper.toTransactionsDTO(transactions));
    }
}

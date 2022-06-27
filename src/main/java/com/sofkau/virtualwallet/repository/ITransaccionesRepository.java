package com.sofkau.virtualwallet.repository;

import com.sofkau.virtualwallet.collection.Transactions;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ITransaccionesRepository extends ReactiveMongoRepository<Transactions, String> {
}

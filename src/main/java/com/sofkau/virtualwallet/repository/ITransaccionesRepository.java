package com.sofkau.virtualwallet.repository;

import com.sofkau.virtualwallet.collection.Transacciones;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ITransaccionesRepository extends ReactiveMongoRepository<Transacciones, String> {
}

package com.sofkau.virtualwallet.repository;

import com.sofkau.virtualwallet.collection.Colaborador;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IColaboradorRepository extends ReactiveMongoRepository<Colaborador, String> {
}

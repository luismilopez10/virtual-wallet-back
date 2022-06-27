package com.sofkau.virtualwallet.repository;

import com.sofkau.virtualwallet.collection.Collaborator;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IColaboradorRepository extends ReactiveMongoRepository<Collaborator, String> {
}

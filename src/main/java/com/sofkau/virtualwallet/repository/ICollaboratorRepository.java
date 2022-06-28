package com.sofkau.virtualwallet.repository;

import com.sofkau.virtualwallet.collection.Collaborator;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ICollaboratorRepository extends ReactiveMongoRepository<Collaborator, String> {
}

package com.sofkau.virtualwallet.repository;

import com.sofkau.virtualwallet.collection.Admin;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IAdminRepository extends ReactiveMongoRepository<Admin, String> {
}

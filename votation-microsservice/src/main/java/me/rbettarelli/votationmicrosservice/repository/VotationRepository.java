package me.rbettarelli.votationmicrosservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import me.rbettarelli.votationmicrosservice.model.VotationModel;

public interface VotationRepository extends MongoRepository<VotationModel, String> {
    
}

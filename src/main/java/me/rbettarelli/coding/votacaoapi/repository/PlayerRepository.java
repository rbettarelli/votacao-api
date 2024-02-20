package me.rbettarelli.coding.votacaoapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import me.rbettarelli.coding.votacaoapi.model.PlayerModel;

public interface PlayerRepository extends MongoRepository<PlayerModel, String> {
    
}

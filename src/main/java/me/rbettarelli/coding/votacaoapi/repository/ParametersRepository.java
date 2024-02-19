package me.rbettarelli.coding.votacaoapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import me.rbettarelli.coding.votacaoapi.model.ParametersModel;

public interface ParametersRepository extends MongoRepository<ParametersModel, String>  {

}
    


package me.rbettarelli.coding.votacaoapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("parameters")
public class ParametersModel {

    @Id

    private String chave;
    private String valor;
    
}

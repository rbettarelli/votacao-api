package me.rbettarelli.coding.votacaoapi.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nonapi.io.github.classgraph.json.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("player")
public class PlayerModel {

    @Id
    private String id;
    private String name;
    
}

package me.rbettarelli.votationmicrosservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("player")
public class PlayerModel {


    @Id
    private String id;
    private String name;
    
}

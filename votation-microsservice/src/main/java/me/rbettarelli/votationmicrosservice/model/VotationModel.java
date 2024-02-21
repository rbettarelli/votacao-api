package me.rbettarelli.votationmicrosservice.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("votation")

public class VotationModel {





    @Id
    private String id;
    private PlayerModel playerModel;
    private Date dateHour;
    


    
}

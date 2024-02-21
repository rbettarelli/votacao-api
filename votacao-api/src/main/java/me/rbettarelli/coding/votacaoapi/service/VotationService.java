package me.rbettarelli.coding.votacaoapi.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import me.rbettarelli.coding.votacaoapi.model.PlayerModel;

@Service
@AllArgsConstructor
public class VotationService {
    
    private static final String TOPIC_VOTATION = "votation";

    private final KafkaTemplate<Object, Object> template;

    public void addEvent (PlayerModel player) {
        template.send(TOPIC_VOTATION, player);
    }

}

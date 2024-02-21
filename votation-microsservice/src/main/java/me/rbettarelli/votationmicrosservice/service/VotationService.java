package me.rbettarelli.votationmicrosservice.service;


import java.util.Date;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.rbettarelli.votationmicrosservice.model.PlayerModel;
import me.rbettarelli.votationmicrosservice.model.VotationModel;
import me.rbettarelli.votationmicrosservice.repository.VotationRepository;

@Service
@Slf4j
@AllArgsConstructor
public class VotationService {
    

    private final VotationRepository repository;
    @KafkaListener(topics = "votation", groupId = "MicroServiceVotation")
    private void execute(ConsumerRecord<String, String> register) {


        String playerStr = register.value();
        log.info("New Vote Received = {}", playerStr);

       
        ObjectMapper mapper = new ObjectMapper();
        PlayerModel player = null;

        try {
            player = mapper.readValue(playerStr, PlayerModel.class);
        } catch (JsonMappingException ex) {
            log.error("Fail vote convert [{}]", player, ex);
            return;
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        VotationModel votation = new VotationModel(null, player, new Date());
        VotationModel entity = repository.save(votation);


        log.info("voto registado com sucesso[id={}, dateHour={}]", entity.getId(), entity.getDateHour());
    }


}

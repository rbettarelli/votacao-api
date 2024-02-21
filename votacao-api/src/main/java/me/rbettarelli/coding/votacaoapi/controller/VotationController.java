package me.rbettarelli.coding.votacaoapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import me.rbettarelli.coding.votacaoapi.model.PlayerModel;
import me.rbettarelli.coding.votacaoapi.service.VotationService;

@RestController
@RequestMapping("/api/votation")
@AllArgsConstructor
public class VotationController {


    private final VotationService service;

    @PostMapping()

    public ResponseEntity<String> vote(@RequestBody PlayerModel player) {
        
        service.addEvent(player);
        return ResponseEntity.ok("Voto computador");


    }
}

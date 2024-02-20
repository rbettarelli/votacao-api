package me.rbettarelli.coding.votacaoapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

import me.rbettarelli.coding.votacaoapi.model.PlayerModel;
import me.rbettarelli.coding.votacaoapi.repository.PlayerRepository;

@RestController
@RequestMapping("/api/player")
@AllArgsConstructor
public class PlayerController {

    private final PlayerRepository repository;

    @PostMapping()
    public ResponseEntity<PlayerModel> save(@RequestBody PlayerModel player) {
        PlayerModel entity = repository.save(player);
        return ResponseEntity.ok(entity);

    }

    @GetMapping("/consult")
    public ResponseEntity<PlayerModel> byId(@RequestParam String chave) {
        Optional<PlayerModel> optPlayer = repository.findById(chave);
        if (optPlayer.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(optPlayer.get());

    }

    @GetMapping()
    public ResponseEntity<List<PlayerModel>> allPlayers() {
        List<PlayerModel> players = repository.findAll();
        if (players.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(players);
    }

}

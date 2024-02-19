package me.rbettarelli.coding.votacaoapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class StatusController {


    @GetMapping("/api/status")
    
    public ResponseEntity<String> status() {
        return ResponseEntity.ok("online");
    }

    
}

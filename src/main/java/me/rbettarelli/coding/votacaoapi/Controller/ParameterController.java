package me.rbettarelli.coding.votacaoapi.Controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.rbettarelli.coding.votacaoapi.Model.ParametersModel;
import me.rbettarelli.coding.votacaoapi.repository.ParametersRepository;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/parameters")
public class ParameterController {

    private final ParametersRepository repository;

    public ParameterController(ParametersRepository repository) {
        this.repository = repository;
    }

    @PostMapping()
    public ResponseEntity<ParametersModel> save(@RequestBody ParametersModel parameter) {
        ParametersModel entity = repository.save(parameter);
        return ResponseEntity.ok(entity);

    }

    @GetMapping("/consult")
    public ResponseEntity<ParametersModel> byId(String chave) {
        Optional<ParametersModel> optParameter = repository.findById(chave);
        if (optParameter.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(optParameter.get());

    }

 
}

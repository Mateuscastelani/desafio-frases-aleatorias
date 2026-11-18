package br.com.castelani.screenfrases.controller;

import br.com.castelani.screenfrases.dto.FraseDTO;
import br.com.castelani.screenfrases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/series/frases")
public class FraseController {

    @Autowired
    private FraseService servico;

    @GetMapping
    public ResponseEntity<FraseDTO> obterFraseAleatoria() {
        return ResponseEntity.ok(servico.obterFraseAleatoria()); // Devolve 200 OK
    }

    @GetMapping("/todas")
    public ResponseEntity<List<FraseDTO>> obterTodasAsFrases() {
        return ResponseEntity.ok(servico.obterTodasAsFrases());
    }

    @PostMapping
    public ResponseEntity<FraseDTO> adicionarFrase(@RequestBody FraseDTO fraseDTO) {
        FraseDTO novaFrase = servico.salvarFrase(fraseDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaFrase); // Devolve 201 CREATED
    }

    @PutMapping("/{id}")
    public ResponseEntity<FraseDTO> atualizarFrase(@PathVariable Long id, @RequestBody FraseDTO fraseDTO) {
        FraseDTO fraseAtualizada = servico.atualizarFrase(id, fraseDTO);
        return ResponseEntity.ok(fraseAtualizada); // Devolve 200 OK
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarFrase(@PathVariable Long id) {
        servico.deletarFrase(id);
        return ResponseEntity.noContent().build(); // Devolve 204 NO CONTENT (sucesso, sem corpo na resposta)
    }


}

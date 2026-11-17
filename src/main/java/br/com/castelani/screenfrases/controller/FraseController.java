package br.com.castelani.screenfrases.controller;

import br.com.castelani.screenfrases.dto.FraseDTO;
import br.com.castelani.screenfrases.model.Frase;
import br.com.castelani.screenfrases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FraseController {

    @Autowired
    private FraseService servico;

    @GetMapping("/series/frases")
    public FraseDTO obterFraseAleatoria(){
        return servico.obterFraseAleatoria();

    }
}

package br.com.castelani.screenfrases.service;

import br.com.castelani.screenfrases.dto.FraseDTO;
import br.com.castelani.screenfrases.model.Frase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {


    @Autowired
    private FraseRepository repositorio;
    public FraseDTO obterFraseAleatoria() {
        Frase frase = repositorio.buscaFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }

}

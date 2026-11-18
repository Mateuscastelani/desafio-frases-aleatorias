package br.com.castelani.screenfrases.service;

import br.com.castelani.screenfrases.dto.FraseDTO;
import br.com.castelani.screenfrases.model.Frase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FraseService {


    @Autowired
    private FraseRepository repositorio;
    public FraseDTO obterFraseAleatoria() {
        Optional<Frase> frase = repositorio.encontrarFraseAleatoriaAtiva();
        return new FraseDTO(frase.get().getTitulo(), frase.get().getFrase(), frase.get().getPersonagem(), frase.get().getPoster());
    }


    // CREATE (POST)
    public FraseDTO salvarFrase(FraseDTO dto) {
        // Converte o DTO que chegou da web numa Entidade do banco de dados
        Frase novaFrase = new Frase();
        novaFrase.setTitulo(dto.titulo());
        novaFrase.setFrase(dto.frase());
        novaFrase.setPersonagem(dto.personagem());
        novaFrase.setPoster(dto.poster());

        repositorio.save(novaFrase);
        return dto;
    }

    // UPDATE (PUT)
    public FraseDTO atualizarFrase(Long id, FraseDTO dto) {
        // Procura a frase pelo ID. Se encontrar, atualiza os dados.
        Optional<Frase> fraseExistente = repositorio.findById(id);

        if (fraseExistente.isPresent()) {
            Frase fraseAtualizada = fraseExistente.get();
            fraseAtualizada.setTitulo(dto.titulo());
            fraseAtualizada.setFrase(dto.frase());
            fraseAtualizada.setPersonagem(dto.personagem());
            fraseAtualizada.setPoster(dto.poster());

            repositorio.save(fraseAtualizada);
            return dto;
        } else {
            throw new RuntimeException("Frase não encontrada!");
        }
    }

    // DELETE (Exclusão lógica)
    public void deletarFrase(Long id) {

        repositorio.findById(id).ifPresent(frase->{
            frase.setAtivo(false);
            repositorio.save(frase);
        });
    }
}

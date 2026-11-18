package br.com.castelani.screenfrases.service;


import br.com.castelani.screenfrases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface FraseRepository extends JpaRepository<Frase, Long> {

    @Query("SELECT f FROM Frase f WHERE f.ativo = true ORDER BY function('RANDOM') LIMIT 1")
    Optional<Frase> encontrarFraseAleatoriaAtiva();
}

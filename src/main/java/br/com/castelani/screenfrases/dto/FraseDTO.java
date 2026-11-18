package br.com.castelani.screenfrases.dto;

public record FraseDTO(
        Long id,
        String titulo,
        String frase,
        String personagem,
        String poster) {
}

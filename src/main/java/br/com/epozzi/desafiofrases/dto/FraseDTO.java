package br.com.epozzi.desafiofrases.dto;

import br.com.epozzi.desafiofrases.model.FraseED;

public record FraseDTO(
        String frase,
        String personagem,
        String titulo,
        String poster) {

    public static FraseDTO toDTO(FraseED fraseED) {
        return new FraseDTO(fraseED.getFrase(),
                fraseED.getPersonagem(),
                fraseED.getTitulo(),
                fraseED.getPoster());
    }
}

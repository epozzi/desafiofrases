package br.com.epozzi.desafiofrases.model;

import jakarta.persistence.*;

@Entity
@Table(name="frases")
public class FraseED {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String frase;
    private String personagem;
    private String titulo;
    private String poster;

    public FraseED() {
    }

    public String getFrase() {
        return frase;
    }

    public String getPersonagem() {
        return personagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPoster() {
        return poster;
    }
}

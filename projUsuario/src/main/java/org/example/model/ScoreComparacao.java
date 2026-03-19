package org.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "scores_comparacao")
public class ScoreComparacao {

    @Id
    private String id;
    private String descricao;
    private int score;

    public ScoreComparacao() {
    }

    public ScoreComparacao(String id, String descricao, int score) {
        this.id = id;
        this.descricao = descricao;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
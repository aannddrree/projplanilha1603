package org.example.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "comparacoes_planilha")
public class ComparacaoPlanilha {

    @Id
    private String id;
    private Planilha planilhaInicial;
    private Planilha planilhaComparacao;
    private String descricao;
    private boolean status;
    private ScoreComparacao scoreComparacao;
    private String data;

    public ComparacaoPlanilha() {
    }

    public ComparacaoPlanilha(String id, Planilha planilhaInicial, Planilha planilhaComparacao,
                              String descricao, boolean status, ScoreComparacao scoreComparacao, String data) {
        this.id = id;
        this.planilhaInicial = planilhaInicial;
        this.planilhaComparacao = planilhaComparacao;
        this.descricao = descricao;
        this.status = status;
        this.scoreComparacao = scoreComparacao;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Planilha getPlanilhaInicial() {
        return planilhaInicial;
    }

    public void setPlanilhaInicial(Planilha planilhaInicial) {
        this.planilhaInicial = planilhaInicial;
    }

    public Planilha getPlanilhaComparacao() {
        return planilhaComparacao;
    }

    public void setPlanilhaComparacao(Planilha planilhaComparacao) {
        this.planilhaComparacao = planilhaComparacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ScoreComparacao getScoreComparacao() {
        return scoreComparacao;
    }

    public void setScoreComparacao(ScoreComparacao scoreComparacao) {
        this.scoreComparacao = scoreComparacao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

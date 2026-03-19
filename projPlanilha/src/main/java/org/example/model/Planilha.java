package org.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "planilhas")
public class Planilha {

    @Id
    private String id;
    private String nomePlanilha;
    private double tamanhoArquivo;
    private int qtdLinhas;
    private int qtdColunas;
    private Usuario usuarioCadastro;
    private boolean status;

    public Planilha() {
    }

    public Planilha(String id, String nomePlanilha, double tamanhoArquivo, int qtdLinhas, int qtdColunas,
                    Usuario usuarioCadastro, boolean status) {
        this.id = id;
        this.nomePlanilha = nomePlanilha;
        this.tamanhoArquivo = tamanhoArquivo;
        this.qtdLinhas = qtdLinhas;
        this.qtdColunas = qtdColunas;
        this.usuarioCadastro = usuarioCadastro;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomePlanilha() {
        return nomePlanilha;
    }

    public void setNomePlanilha(String nomePlanilha) {
        this.nomePlanilha = nomePlanilha;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public int getQtdLinhas() {
        return qtdLinhas;
    }

    public void setQtdLinhas(int qtdLinhas) {
        this.qtdLinhas = qtdLinhas;
    }

    public int getQtdColunas() {
        return qtdColunas;
    }

    public void setQtdColunas(int qtdColunas) {
        this.qtdColunas = qtdColunas;
    }

    public Usuario getUsuarioCadastro() {
        return usuarioCadastro;
    }

    public void setUsuarioCadastro(Usuario usuarioCadastro) {
        this.usuarioCadastro = usuarioCadastro;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
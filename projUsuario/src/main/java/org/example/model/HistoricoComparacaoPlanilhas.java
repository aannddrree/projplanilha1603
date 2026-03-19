package org.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "historico_comparacao_planilhas")
public class HistoricoComparacaoPlanilhas {

    @Id
    private String id;
    private ComparacaoPlanilha comparacaoPlanilha;
    private String data;

    public HistoricoComparacaoPlanilhas() {
    }

    public HistoricoComparacaoPlanilhas(String id, ComparacaoPlanilha comparacaoPlanilha, String data) {
        this.id = id;
        this.comparacaoPlanilha = comparacaoPlanilha;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ComparacaoPlanilha getComparacaoPlanilha() {
        return comparacaoPlanilha;
    }

    public void setComparacaoPlanilha(ComparacaoPlanilha comparacaoPlanilha) {
        this.comparacaoPlanilha = comparacaoPlanilha;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

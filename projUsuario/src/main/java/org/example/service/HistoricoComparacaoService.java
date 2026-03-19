package org.example.service;

import org.example.model.HistoricoComparacaoPlanilhas;
import org.example.repository.HistoricoComparacaoPlanilhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoricoComparacaoService {

    @Autowired
    public HistoricoComparacaoPlanilhaRepository historicoComparacaoPlanilhaRepository;

    public HistoricoComparacaoPlanilhas save(HistoricoComparacaoPlanilhas historicoComparacaoPlanilhas){
        return  historicoComparacaoPlanilhaRepository.save(historicoComparacaoPlanilhas);
    }

    public List<HistoricoComparacaoPlanilhas> findAll(){
        return historicoComparacaoPlanilhaRepository.findAll();
    }
}

package org.example.service;

import org.example.model.ScoreComparacao;
import org.example.repository.ScoreComparacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreComparacaoService {

    @Autowired
    private ScoreComparacaoRepository scoreComparacaoRepository;

    public ScoreComparacao save(ScoreComparacao scoreComparacao){
        return scoreComparacaoRepository.save(scoreComparacao);
    }

    public List<ScoreComparacao> findAll(){
        return  scoreComparacaoRepository.findAll();
    }
}

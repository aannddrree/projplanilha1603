package org.example.controller;

import org.example.model.Planilha;
import org.example.model.ScoreComparacao;
import org.example.service.PlanilhaService;
import org.example.service.ScoreComparacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScoreComparacaoController {

    @Autowired
    private ScoreComparacaoService scoreComparacaoService;

    @PostMapping("/planilha")
    public ScoreComparacao save(ScoreComparacao scoreComparacao){
        return scoreComparacaoService.save(scoreComparacao);
    }
    @GetMapping("/planilha")
    public List<ScoreComparacao> findAll(){
        return  scoreComparacaoService.findAll();
    }

}

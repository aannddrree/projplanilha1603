package org.example.controller;

import org.example.model.Endereco;
import org.example.model.HistoricoComparacaoPlanilhas;
import org.example.service.EnderecoService;
import org.example.service.HistoricoComparacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HistoricoComparacaoPlanilhasController {

    @Autowired
    private HistoricoComparacaoService historicoComparacaoService;

    @PostMapping("/historicocomparacaoservice")
    public HistoricoComparacaoPlanilhas save(HistoricoComparacaoPlanilhas endereco){
        return historicoComparacaoService.save(endereco);
    }
    @GetMapping("/historicocomparacaoservice")
    public List<HistoricoComparacaoPlanilhas> findAll(){
        return  historicoComparacaoService.findAll();
    }
}

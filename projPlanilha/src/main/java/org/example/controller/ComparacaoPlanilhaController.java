package org.example.controller;

import org.example.model.ComparacaoPlanilha;
import org.example.service.ComparacaoPanilhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ComparacaoPlanilhaController {

    @Autowired
    private ComparacaoPanilhaService comparacaoPanilhaService;

    @PostMapping("/comparacaoplanilha")
    public ComparacaoPlanilha save(ComparacaoPlanilha comparacaoPlanilha){
        return comparacaoPanilhaService.save(comparacaoPlanilha);
    }
    @GetMapping("/comparacaoplanilha")
    public List<ComparacaoPlanilha> findAll(){
        return  comparacaoPanilhaService.findAll();
    }
}

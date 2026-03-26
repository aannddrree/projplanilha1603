package org.example.controller;

import org.example.model.Planilha;
import org.example.service.PlanilhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlanilhaController {

    @Autowired
    private PlanilhaService planilhaService;

    @PostMapping("/planilha")
    public Planilha save(Planilha endereco){
        return planilhaService.save(endereco);
    }
    @GetMapping("/planilha")
    public List<Planilha> findAll(){
        return  planilhaService.findAll();
    }

}

package org.example.service;

import org.example.model.Planilha;
import org.example.repository.PlanilhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanilhaService {

    @Autowired
    private PlanilhaRepository planilhaRepository;

    public Planilha save(Planilha planilha){
        return planilhaRepository.save(planilha);
    }

    public List<Planilha> findAll(){
        return  planilhaRepository.findAll();
    }
}

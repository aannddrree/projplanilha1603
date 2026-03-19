package org.example.service;

import org.example.model.ComparacaoPlanilha;
import org.example.repository.ComparacaoPlanilhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComparacaoPanilhaService {

    @Autowired
    private ComparacaoPlanilhaRepository comparacaoPlanilhaRepository;

    public ComparacaoPlanilha save(ComparacaoPlanilha comparacaoPlanilha){
        return  comparacaoPlanilhaRepository.save(comparacaoPlanilha);
    }

    public List<ComparacaoPlanilha> findAll(){
        return comparacaoPlanilhaRepository.findAll();
    }
}

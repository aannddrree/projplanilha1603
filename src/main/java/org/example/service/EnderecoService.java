package org.example.service;

import org.example.model.Endereco;
import org.example.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco save(Endereco endereco){
        return  enderecoRepository.save(endereco);
    }

    public List<Endereco> findAll(){
        return  enderecoRepository.findAll();
    }
}

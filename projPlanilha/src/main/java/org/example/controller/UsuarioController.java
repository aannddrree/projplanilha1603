package org.example.controller;

import org.example.model.ScoreComparacao;
import org.example.model.Usuario;
import org.example.service.ScoreComparacaoService;
import org.example.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/planilha")
    public Usuario save(Usuario usuario){
        return usuarioService.save(usuario);
    }
    @GetMapping("/planilha")
    public List<Usuario> findAll(){
        return  usuarioService.findAll();
    }
}

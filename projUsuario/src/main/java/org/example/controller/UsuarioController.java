package org.example.controller;

import org.example.model.Usuario;
import org.example.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/usuario")
    public Usuario save(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }
    @GetMapping("/usuario")
    public List<Usuario> findAll(){
        return  usuarioService.findAll();
    }
}

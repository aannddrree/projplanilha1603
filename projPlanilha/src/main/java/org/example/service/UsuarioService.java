package org.example.service;

import org.example.model.Usuario;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/usuario_planilha") // endpoint da SUA aplicação
public class UsuarioService {

    private final String URL = "http://localhost:8080/usuario";

    private RestTemplate restTemplate = new RestTemplate();

    @GetMapping
    public List<Usuario> findAll() {

        ResponseEntity<Usuario[]> response =
                restTemplate.getForEntity(URL, Usuario[].class);

        return Arrays.asList(response.getBody());
    }

    @PostMapping
    public Usuario save(@RequestBody Usuario usuario) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Usuario> request = new HttpEntity<>(usuario, headers);

        ResponseEntity<Usuario> response =
                restTemplate.postForEntity(URL, request, Usuario.class);

        return response.getBody();
    }
}

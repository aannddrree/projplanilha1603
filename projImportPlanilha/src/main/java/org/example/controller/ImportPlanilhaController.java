package org.example.controller;

import org.example.ImportPlanilha;
import org.example.model.Usuario;
import org.example.service.ImportPlanilhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/import_planilha")
public class ImportPlanilhaController {

    @Autowired
    private ImportPlanilhaService importPlanilhaService;

    @PostMapping
    public List<Usuario> save(@RequestParam("file") MultipartFile file) {
        return importPlanilhaService.importarExcel(file);
    }
}

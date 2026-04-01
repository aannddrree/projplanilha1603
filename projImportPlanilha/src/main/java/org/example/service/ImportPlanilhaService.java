package org.example.service;

import org.apache.poi.ss.usermodel.*;
import org.example.model.Endereco;
import org.example.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ImportPlanilhaService {

    @Autowired
    private UsuarioService usuarioService;

    public List<Usuario> importarExcel(MultipartFile file) {
        List<Usuario> usuarios = new ArrayList<>();

        try (InputStream is = file.getInputStream();
             Workbook workbook = WorkbookFactory.create(is)) {

            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rows = sheet.iterator();

            // Pular cabeçalho
            if (rows.hasNext()) rows.next();

            while (rows.hasNext()) {
                Row row = rows.next();

                Usuario usuario = new Usuario();
                usuario.setNome(getCellValue(row.getCell(0)));
                usuario.setTelefone(getCellValue(row.getCell(1)));

                Endereco endereco = new Endereco();
                endereco.setLogradouro(getCellValue(row.getCell(2)));
                endereco.setCidade(getCellValue(row.getCell(3)));
                endereco.setNumero(getCellValue(row.getCell(4)));
                endereco.setCep(getCellValue(row.getCell(5)));
                endereco.setBairro(getCellValue(row.getCell(6)));
                usuario.setEndereco(endereco);

                usuarioService.save(usuario);
                usuarios.add(usuario);
            }
            return usuarios;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao processar Excel: " + e.getMessage());
        }
    }

    // Método auxiliar (IMPORTANTE pra evitar erro de tipo)
    private String getCellValue(Cell cell) {
        if (cell == null) return "";

        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                return String.valueOf((long) cell.getNumericCellValue());
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            default:
                return "";
        }
    }
}

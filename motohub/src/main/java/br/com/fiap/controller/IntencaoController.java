package br.com.fiap.controller;

import br.com.fiap.model.Intencao;
import br.com.fiap.service.IntencaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/intencao")
public class IntencaoController {

    @Autowired
    private IntencaoService service;

    @GetMapping
    public List<Intencao> listar() {
        return service.listar();
    }

    @PostMapping
    public Intencao cadastrar(@RequestBody Intencao intencao) {
        return service.salvar(intencao);
    }

    @GetMapping("/{id}")
    public Intencao buscar(@PathVariable Long id) {
        return service.buscarPorId(id).orElseThrow(() -> new RuntimeException("Não encontrada"));
    }

    @PutMapping("/{id}")
    public Intencao atualizar(@PathVariable Long id, @RequestBody Intencao intencao) {
        return service.atualizar(id, intencao);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}

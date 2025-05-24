package br.com.fiap.controller;

import br.com.fiap.model.Moto;
import br.com.fiap.service.MotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/motos")
public class MotoController {

    @Autowired
    MotoService service;

    @GetMapping
    public List<Moto> listar() {
        return service.listar();
    }

    @PostMapping
    public Moto cadastrar(@RequestBody Moto moto) {
        return service.salvar(moto);
    }

    @GetMapping("/{id}")
    public Moto buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Moto atualizar(@PathVariable Long id, @RequestBody Moto motoAtualizada) {
        return service.atualizar(id, motoAtualizada);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}


package br.com.fiap.controller;


import br.com.fiap.model.Cliente;
import br.com.fiap.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping
    public List<Cliente> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Cliente buscar(@PathVariable Long id) {
        return service.buscarPorId(id).orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }

    @PostMapping
    public Cliente cadastrar(@RequestBody Cliente cliente) {
        return service.salvar(cliente);
    }

    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Long id, @RequestBody Cliente clienteAtualizado) {
        return service.atualizar(id, clienteAtualizado);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
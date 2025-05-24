package br.com.fiap.service;

import br.com.fiap.model.Cliente;
import br.com.fiap.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }

    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente atualizar(Long id, Cliente clienteAtualizado) {
        Cliente cliente = clienteRepository.findById(id).orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
        cliente.setNome(clienteAtualizado.getNome());
        cliente.setEmail(clienteAtualizado.getEmail());
        return clienteRepository.save(cliente);
    }

    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }
}

package br.com.fiap.service;

import br.com.fiap.model.Cliente;
import br.com.fiap.model.Intencao;
import br.com.fiap.model.Moto;
import br.com.fiap.repository.ClienteRepository;
import br.com.fiap.repository.IntencaoRepository;
import br.com.fiap.repository.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IntencaoService {

    @Autowired
    private IntencaoRepository intencaoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private MotoRepository motoRepository;

    public List<Intencao> listar() {
        return intencaoRepository.findAll();
    }

    public Optional<Intencao> buscarPorId(Long id) {
        return intencaoRepository.findById(id);
    }

    public Intencao salvar(Intencao intencao) {
        Long idCliente = intencao.getCliente().getId();
        Long idMoto = intencao.getMoto().getId();

        Cliente cliente = clienteRepository.findById(idCliente)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
        Moto moto = motoRepository.findById(idMoto)
                .orElseThrow(() -> new RuntimeException("Moto não encontrada"));

        intencao.setCliente(cliente);
        intencao.setMoto(moto);

        return intencaoRepository.save(intencao);
    }

    public Intencao atualizar(Long id, Intencao novaIntencao) {
        Intencao intencao = intencaoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Intenção não encontrada"));

        Cliente cliente = clienteRepository.findById(novaIntencao.getCliente().getId())
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
        Moto moto = motoRepository.findById(novaIntencao.getMoto().getId())
                .orElseThrow(() -> new RuntimeException("Moto não encontrada"));

        intencao.setCliente(cliente);
        intencao.setMoto(moto);
        intencao.setTipo(novaIntencao.getTipo());

        return intencaoRepository.save(intencao);
    }

    public void deletar(Long id) {
        intencaoRepository.deleteById(id);
    }
}

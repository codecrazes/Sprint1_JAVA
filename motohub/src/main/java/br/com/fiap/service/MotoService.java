package br.com.fiap.service;

import br.com.fiap.model.Moto;
import br.com.fiap.repository.MotoRepository;
import br.com.fiap.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotoService {

    @Autowired
    private MotoRepository motoRepository;

    public List<Moto> listar() {
        return motoRepository.findAll();
    }

    public Moto buscarPorId(Long id) {
        return motoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Moto não encontrada com ID: " + id));
    }

    public Moto salvar(Moto moto) {
        return motoRepository.save(moto);
    }

    public Moto atualizar(Long id, Moto motoAtualizada) {
        Moto moto = motoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Moto não encontrada com ID: " + id));

        moto.setModelo(motoAtualizada.getModelo());
        moto.setMarca(motoAtualizada.getMarca());
        moto.setAno(motoAtualizada.getAno());
        moto.setTipoUso(motoAtualizada.getTipoUso());
        moto.setDisponivel(motoAtualizada.isDisponivel());

        return motoRepository.save(moto);
    }

    public void deletar(Long id) {
        if (!motoRepository.existsById(id)) {
            throw new ResourceNotFoundException("Moto não encontrada com ID: " + id);
        }
        motoRepository.deleteById(id);
    }
}

package br.com.fiap.repository;

import br.com.fiap.model.Intencao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntencaoRepository extends JpaRepository<Intencao, Long> {
}

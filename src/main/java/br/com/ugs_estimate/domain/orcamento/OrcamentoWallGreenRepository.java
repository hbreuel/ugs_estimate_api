package br.com.ugs_estimate.domain.orcamento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrcamentoWallGreenRepository extends JpaRepository<OrcamentoWallGreen, Long> {
}

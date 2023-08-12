package br.com.ugs_estimate.domain.orcamento;

import java.math.BigDecimal;

public record DadosOrcamento(Long id, Double alturaDaParede, Double larguraDaParede, Boolean temCantoneira, String ladosCantoneira) {
}

package br.com.ugs_estimate.domain.clientes;

import br.com.ugs_estimate.domain.endereco.DadosEndreco;

public record DadosPessoaFisica(String nome, String cpf, String email, String telefone, DadosEndreco endereco) {
}

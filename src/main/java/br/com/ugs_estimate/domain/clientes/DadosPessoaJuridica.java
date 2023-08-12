package br.com.ugs_estimate.domain.clientes;

import br.com.ugs_estimate.domain.endereco.DadosEndreco;

public record DadosPessoaJuridica(String razaoSocial, String nomeFantasia, String cnpj, String email, String telefone, DadosEndreco endereco ) {
}

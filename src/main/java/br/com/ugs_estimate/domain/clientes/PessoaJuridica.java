package br.com.ugs_estimate.domain.clientes;

import br.com.ugs_estimate.domain.endereco.Endereco;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PessoaJuridica extends Pessoa {


    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;

    public PessoaJuridica(DadosPessoaJuridica dados) {
        this.razaoSocial = dados.razaoSocial();
        this.cnpj = dados.cnpj();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.endereco = new Endereco(dados.endereco());
    }
}



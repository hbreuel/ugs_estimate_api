package br.com.ugs_estimate.domain.clientes;

import br.com.ugs_estimate.domain.endereco.Endereco;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity (name = "Pessoa")
@Table (name = "clientes")
@Getter
@Setter
@NoArgsConstructor
public class Pessoa {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    protected Long id;
    protected String telefone;
    protected String email;

    @Embedded
    protected Endereco endereco;


}

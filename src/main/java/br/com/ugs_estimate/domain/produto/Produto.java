package br.com.ugs_estimate.domain.produto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity(name = "Produto")
public class Produto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String descricao;
    private BigDecimal preco1;
    private BigDecimal preco2;
    private BigDecimal preco3;

    public Produto(String codigo, String descricao, BigDecimal preco1, BigDecimal preco2, BigDecimal preco3) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco1 = preco1;
        this.preco2 = preco2;
        this.preco3 = preco3;
    }


}

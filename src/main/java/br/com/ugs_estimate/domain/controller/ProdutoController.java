package br.com.ugs_estimate.domain.controller;

import br.com.ugs_estimate.domain.produto.ListaDeProdutos;
import br.com.ugs_estimate.domain.produto.Produto;
import br.com.ugs_estimate.domain.produto.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping
    public List<Produto> listaProdutos() {
        ListaDeProdutos lista = new ListaDeProdutos();
        System.out.println(lista.getListaProdutos());
        return lista.getListaProdutos();

    }





}

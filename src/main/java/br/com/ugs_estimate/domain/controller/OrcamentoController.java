package br.com.ugs_estimate.domain.controller;

import br.com.ugs_estimate.domain.clientes.Pessoa;
import br.com.ugs_estimate.domain.clientes.PessoaRepository;
import br.com.ugs_estimate.domain.orcamento.DadosOrcamento;
import br.com.ugs_estimate.domain.orcamento.OrcamentoWallGreen;
import br.com.ugs_estimate.domain.orcamento.OrcamentoWallGreenRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orcamentos")
public class OrcamentoController {

    @Autowired
    PessoaRepository pessoaRepository;

    @Autowired
    OrcamentoWallGreenRepository repository;

    @PostMapping("novo")
    public void novoOrcamento(@RequestBody DadosOrcamento dados) {
        Pessoa pessoa = pessoaRepository.findById(dados.id()).orElse(null);
        var orcamento = new OrcamentoWallGreen(pessoa, dados);
        repository.save(orcamento);

    }

    @GetMapping
    public List<OrcamentoWallGreen> listarOrcamentos() {
        return repository.findAll().stream().toList();
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }




}



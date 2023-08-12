package br.com.ugs_estimate.domain.controller;

import br.com.ugs_estimate.domain.clientes.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    PessoaRepository repository;


    @PostMapping("/cadastraPessoaFisica")
    @Transactional
    public void cadastrarClientePessoaFisica(@RequestBody DadosPessoaFisica dados) {
        var pessoaFisica = new PessoaFisica(dados);
        repository.save(pessoaFisica);
    }

    @PostMapping("/cadastraPessoaJuridica")
    @Transactional
    public void cadastrarClientePessoaJuridica(@RequestBody DadosPessoaJuridica dados) {
        var pessoaJuridica = new PessoaJuridica(dados);
        repository.save(pessoaJuridica);
    }

    @GetMapping
    public List<Pessoa> listar() {
        return repository.findAll().stream().toList();
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);

    }

    @PutMapping("atualizaPessoaFisica/{id}")
    @Transactional
    public void atualiza(@PathVariable Long id, DadosPessoaFisica dadosPessoaFisica) {
        PessoaFisica pessoa = (PessoaFisica) repository.getReferenceById(id);
        pessoa.atualizaDados(dadosPessoaFisica);

    }

    @GetMapping("/{id}")
    public String paginaCliente(@PathVariable Long id) {
        var pessoa =  repository.getById(id);
        return "teste";
    }


}

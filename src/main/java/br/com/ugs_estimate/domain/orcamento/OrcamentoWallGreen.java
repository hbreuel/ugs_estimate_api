package br.com.ugs_estimate.domain.orcamento;

import br.com.ugs_estimate.domain.calculos.CalcularPrecoWallGreen;
import br.com.ugs_estimate.domain.calculos.CalcularWallGreen;
import br.com.ugs_estimate.domain.clientes.Pessoa;
import br.com.ugs_estimate.domain.clientes.PessoaFisica;
import br.com.ugs_estimate.domain.clientes.PessoaJuridica;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity(name = "Orcamentos")
@Table(name = "orcamentos")
@Getter
@Setter
@NoArgsConstructor
public class OrcamentoWallGreen {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String razaoSocial;
    private String nomeFantasia;
    private String email;
    private String telefone;

    private String cidade;
    private String uf;
    private LocalDate data;

    private Double alturaDaParede;
    private Double larguraDaParede;
    private Double alturaDosModulos;
    private Double larguraDosModulos;

    private Double areaModulos;

    //Estrutural
    private Integer totalDeModulosInteiros = 0;
    private Integer totalDeModulosCantoneira = 0;
    private Integer totalDeModulosNicho = 0;
    private Integer totalDeModulosDuplos = 0;
    private Integer totalDeTopos = 0;
    private Integer totalDeToposNicho = 0;
    private Integer totalDeToposDuplos = 0;
    private Integer totalDePlacasHorizontais = 0;
    private Integer totalDePlacasVerticais = 0;
    private Integer totalDeVasos = 0;
    private Integer totalDeBolsasDeSubstrato = 0;
    private Integer totalDeIniciaisFinais = 0;
    private Integer totalDePinosDeTravamento = 0;
    private Integer totalDePlacasNicho = 0 ;
    private Integer totalDePlacasDuplo = 0;
    private Integer totalDePlantas = 0;

    //Irrigação
    private Integer totalGotejadores = 0;
    private Double totalTuboCego = 0.0;
    private Integer totalCotovelos = 0;
    private Integer totalTes = 0;
    private Integer totalFinalDeLinha = 0;
    private Integer totalConectorInicial = 0;

    //Fixação
    private Integer totalParafusos = 0;
    private Integer totalBuchas = 0;

    //Cantoneiras
    private Integer totalDePlacasCantoneiras = 0;
    private Integer totalDePlacasVerticaisCantoneira = 0;
    private Integer totalDeUniaoCantoneira = 0;
    private Integer totalDeVasosCantoneira = 0;
    private Integer totalDeBolsaDeSubstratoCantoneira = 0;

    private BigDecimal precoTotalEstrutura;
    private BigDecimal precoTotalIrrigacao;
    private BigDecimal precoTotalFixacao;




    public OrcamentoWallGreen(Pessoa pessoa, DadosOrcamento dados) {
        if (pessoa != null) {

            if (pessoa instanceof PessoaFisica) {
                PessoaFisica pessoaFisica = (PessoaFisica) pessoa;
                this.nome = pessoaFisica.getNome();
            } else if (pessoa instanceof PessoaJuridica) {
                PessoaJuridica pessoaJuridica = (PessoaJuridica) pessoa;
                this.razaoSocial = pessoaJuridica.getRazaoSocial();
                this.nomeFantasia = pessoaJuridica.getNomeFantasia();
            } else {
                throw new IllegalArgumentException("ID inválido: não corresponde a uma PessoaFisica ou PessoaJuridica.");
            }
        } else {
            throw new IllegalArgumentException("Pessoa não encontrada com o ID fornecido.");
        }

        this.email = pessoa.getEmail();
        this.telefone = pessoa.getTelefone();
        this.cidade = pessoa.getEndereco().getCidade();
        this.uf = pessoa.getEndereco().getUf();
        this.data = LocalDate.now();
        this.alturaDaParede = dados.alturaDaParede();
        this.larguraDaParede = dados.larguraDaParede();

        var calculoEstrutura = new CalcularWallGreen(dados);
        //var calculoPreco = new CalcularPrecoWallGreen(calculoEstrutura, 1);
        this.areaModulos = calculoEstrutura.getAreaModulos();
        this.alturaDosModulos = calculoEstrutura.getAlturaDosModulos();
        this.larguraDosModulos = calculoEstrutura.getLarguraDosModulos();

        // Estrutural
        this.totalDeModulosInteiros = calculoEstrutura.getTotalDeModulosInteiros();
        this.totalDeModulosCantoneira = calculoEstrutura.getTotalDeModulosCantoneira();
        this.totalDeModulosNicho = calculoEstrutura.getTotalDeModulosNicho();
        this.totalDeModulosDuplos = calculoEstrutura.getTotalDeModulosDuplos();
        this.totalDeTopos = calculoEstrutura.getTotalDeTopos();
        this.totalDeToposNicho = calculoEstrutura.getTotalDeToposNicho();
        this.totalDeToposDuplos = calculoEstrutura.getTotalDeToposDuplos();
        this.totalDePlacasHorizontais = calculoEstrutura.getTotalDePlacasHorizontais();
        this.totalDePlacasVerticais = calculoEstrutura.getTotalDePlacasVerticais();
        this.totalDeVasos = calculoEstrutura.getTotalDeVasos();
        this.totalDeBolsasDeSubstrato = calculoEstrutura.getTotalDeBolsasDeSubstrato();
        this.totalDeIniciaisFinais = calculoEstrutura.getTotalDeIniciaisFinais();
        this.totalDePinosDeTravamento = calculoEstrutura.getTotalDePinosDeTravamento();
        this.totalDePlacasNicho = calculoEstrutura.getTotalDePlacasNicho();
        this.totalDePlacasDuplo = calculoEstrutura.getTotalDePlacasDuplo();
        this.totalDePlantas = calculoEstrutura.getTotalDePlantas();

        // Irrigação
        this.totalGotejadores = calculoEstrutura.getTotalGotejadores();
        this.totalTuboCego = calculoEstrutura.getTotalTuboCego();
        this.totalCotovelos = calculoEstrutura.getTotalCotovelos();
        this.totalTes = calculoEstrutura.getTotalTes();
        this.totalFinalDeLinha = calculoEstrutura.getTotalFinalDeLinha();
        this.totalConectorInicial = calculoEstrutura.getTotalConectorInicial();

        // Fixação
        this.totalParafusos = calculoEstrutura.getTotalParafusos();
        this.totalBuchas = calculoEstrutura.getTotalBuchas();

        // Cantoneiras
        this.totalDePlacasCantoneiras = calculoEstrutura.getTotalDePlacasCantoneiras();
        this.totalDePlacasVerticaisCantoneira = calculoEstrutura.getTotalDePlacasVerticaisCantoneira();
        this.totalDeUniaoCantoneira = calculoEstrutura.getTotalDeUniaoCantoneira();
        this.totalDeVasosCantoneira = calculoEstrutura.getTotalDeVasosCantoneira();
        this.totalDeBolsaDeSubstratoCantoneira = calculoEstrutura.getTotalDeBolsaDeSubstratoCantoneira();

//        this.precoTotalEstrutura = calculoPreco.getPrecoTotalEstrutural();
//        this.precoTotalIrrigacao = calculoPreco.getPrecoTotalIrrigacao();
//        this.precoTotalFixacao = calculoPreco.getPrecoTotalFixacao();

     

    }
}

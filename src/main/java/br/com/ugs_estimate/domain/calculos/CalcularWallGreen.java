package br.com.ugs_estimate.domain.calculos;

import br.com.ugs_estimate.domain.orcamento.DadosOrcamento;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;


@Getter
@Setter
public class CalcularWallGreen {

    private Double alturaDaParede;
    private Double larguraDaParede;
    private Double alturaDosModulos;
    private Double larguraDosModulos;

    private Boolean temCantoneira;
    private Boolean cantoneiraDosDoisLados;

    private Double areaModulos;
    private Double areaDaParede;

    private Integer modulosDeAltura;
    private Integer modulosDeLargura;

    private Double larguraDeUmModulo = 0.67;
    private Double alturaDeUmModulo = 0.218;

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




    private DecimalFormat decimalFormat = new DecimalFormat("#.##",  new DecimalFormatSymbols(Locale.US));




    public CalcularWallGreen(DadosOrcamento dados) {
        this.alturaDaParede = dados.alturaDaParede();
        this.larguraDaParede = dados.larguraDaParede();
        this.temCantoneira = dados.temCantoneira();

        if (dados.temCantoneira()) {
            if (dados.ladosCantoneira().equals("ambos")) {
                this.cantoneiraDosDoisLados = true;

            } else {
                this.cantoneiraDosDoisLados = false;

            }

        }

        //Altura dos módulos e quantidade de módulos de altura
        this.modulosDeAltura = ((int) Math.floor(this.alturaDaParede / alturaDeUmModulo));
        this.alturaDosModulos = modulosDeAltura * alturaDeUmModulo + 0.018;

        //Largura dos módulos e quantidade de módulos de largura
        this.modulosDeLargura = ((int) Math.floor((this.larguraDaParede / larguraDeUmModulo) + 0.017));
        this.larguraDosModulos = ((modulosDeLargura - 1) * larguraDeUmModulo) + larguraDeUmModulo + 0.017  +  0.01;

        //Double.valueOf(decimalFormat.format(

        //Cantoneira
        if (temCantoneira) {
            if (cantoneiraDosDoisLados) {
                this.larguraDosModulos =  Math.floor((this.larguraDaParede - 0.44) / 0.65368) * 0.65368 + 0.44 + 0.01;
                this.modulosDeLargura = ((int) Math.floor((this.larguraDaParede - 0.44) / 0.65368));
                this.totalDeModulosCantoneira = this.modulosDeAltura * 2;

            } else {
                this.larguraDosModulos = Math.floor((this.larguraDaParede - 0.22) / 0.65368) * 0.65368 + 0.22+ 0.01;
                this.modulosDeLargura = ((int) Math.floor((this.larguraDaParede - 0.22) / 0.65368));
                this.totalDeModulosCantoneira = this.modulosDeAltura;

            }

            this.totalDePlacasCantoneiras = this.totalDeModulosCantoneira + 1;
            this.totalDeVasosCantoneira = this.totalDeModulosCantoneira;
            this.totalDeBolsaDeSubstratoCantoneira = this.totalDeVasosCantoneira;
            this.totalDeUniaoCantoneira = this.totalDeModulosCantoneira;
            this.totalDePlacasVerticaisCantoneira = this.totalDeModulosCantoneira * 2;

        }

        this.totalDeTopos = modulosDeLargura * 2;

        //Placas Nicho Duplo
        if (this.larguraDaParede - this.larguraDosModulos >= 0.4358 && this.larguraDaParede - larguraDosModulos < 0.653 ) {
            this.larguraDosModulos += 0.4358;
            this.totalDeModulosDuplos = this.modulosDeAltura;
            this.totalDePlacasDuplo = this.totalDeModulosDuplos * 2 + 1;
            this.totalDeToposDuplos = 1;

        }

        //Placas Nicho
        if (this.larguraDaParede - this.larguraDosModulos >= 0.2182 && this.larguraDaParede - larguraDosModulos  < 0.4358 ) {
            this.larguraDosModulos += 0.2182;
            this.totalDeModulosNicho = this.modulosDeAltura;
            this.totalDePlacasNicho = this.totalDeModulosNicho * 2 + 1;
            this.totalDeToposNicho = 1;

        }



        //Área
        this.areaDaParede = larguraDaParede * alturaDaParede;
        this.areaModulos = larguraDosModulos * alturaDosModulos;

        //Total Módulos Inteiros e Plantas
        this.totalDeModulosInteiros = this.modulosDeAltura * this.modulosDeLargura;
        this.totalDePlantas = this.totalDeModulosInteiros * 3 + totalDeModulosNicho + totalDeModulosDuplos + totalDeModulosCantoneira;

        //Total de peças
        this.totalDePlacasHorizontais = totalDeModulosInteiros * 4 + this.totalDeTopos;
        this.totalDePlacasVerticais = totalDeModulosInteiros * 3 + modulosDeAltura + totalDeModulosNicho + totalDeModulosDuplos * 2;
        this.totalDeVasos = this.totalDePlantas;
        this.totalDeBolsasDeSubstrato = this.totalDeVasos;
        this.totalDePinosDeTravamento = this.totalDeModulosInteiros * 12 + totalDeModulosNicho * 4 + totalDeModulosDuplos * 8 + totalDeTopos * 3 + 1;
        this.totalDeIniciaisFinais = this.modulosDeAltura * 4 + 2;

        //Total irrigação
        this.totalTuboCego = this.alturaDosModulos * 2 + larguraDosModulos * modulosDeAltura + 0.5;
        this.totalGotejadores = this.totalDePlantas;
        this.totalCotovelos = 3;
        this.totalTes = modulosDeAltura - 2;
        this.totalConectorInicial = 1;
        this.totalFinalDeLinha = totalTes;

        //Total Fixação
        this.totalParafusos = totalDeModulosInteiros * 2 + totalDeModulosNicho + totalDeModulosInteiros + totalDeModulosCantoneira;
        this.totalBuchas = this.totalParafusos;




    }
}

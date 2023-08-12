package br.com.ugs_estimate.domain.calculos;

import br.com.ugs_estimate.domain.produto.ListaDeProdutos;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class CalcularPrecoWallGreen {

    private ListaDeProdutos lista;

    private BigDecimal precoTotalPlacaVertical;
    private BigDecimal precoTotalPlacaHorizontalMetade;
    private BigDecimal precoTotalPlacaCantoneira;
    private BigDecimal precoTotalVasoRedondo;
    private BigDecimal precoTotalBolsaDeSubstrato;
    private BigDecimal precoTotalPinoDeTravamento;
    private BigDecimal precoTotalInicialFinal;
    private BigDecimal precoTotalPlacaVerticalCantoneira;
    private BigDecimal precoTotalUniaoCantoneira;

    private BigDecimal precoTotalVasoCantoneira;
    private BigDecimal precoTotalBolsaDeSubstratoCantoneira;
    private BigDecimal precoTotalNicho;
    private BigDecimal precoTotalDuplo;
    private BigDecimal precoTotalTuboCego;
    private BigDecimal precoTotalGotejador;
    private BigDecimal precoTotalConectorTe;
    private BigDecimal precoTotalConectorCotovelo;
    private BigDecimal precoTotalConectorFinalDeLinha;
    private BigDecimal precoTotalConectorInicial;
    private BigDecimal precoTotalParafuso;
    private BigDecimal precoTotalBuchas;

    private BigDecimal precoTotalEstrutural = new BigDecimal(0.0);
    private BigDecimal precoTotalIrrigacao = new BigDecimal(0.0);
    private BigDecimal precoTotalFixacao = new BigDecimal(0.0);


    public CalcularPrecoWallGreen(CalcularWallGreen calculoEstrutura, int listaDePrecos) {

        if (listaDePrecos == 1) {

            this.precoTotalPlacaHorizontalMetade = this.lista.getPlacaHorizontalMedate().getPreco1().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDePlacasHorizontais()));
            this.precoTotalPlacaVertical = this.lista.getPlacaVertical().getPreco1().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDePlacasVerticais()));
            this.precoTotalVasoRedondo = this.lista.getVasoRedondo().getPreco1().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDeVasos()));
            this.precoTotalBolsaDeSubstrato = this.lista.getBolsaSubstrato().getPreco1().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDeBolsasDeSubstrato()));
            this.precoTotalNicho = this.lista.getPlacaNicho().getPreco1().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDePlacasNicho()));
            this.precoTotalDuplo = this.precoTotalPlacaHorizontalMetade;
            this.precoTotalInicialFinal = this.lista.getInicialFinal().getPreco1().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDeIniciaisFinais()));
            this.precoTotalPinoDeTravamento = this.lista.getPinoTravamento().getPreco1().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDePinosDeTravamento()));
            this.precoTotalPlacaCantoneira = this.lista.getPlacaCantoneira().getPreco1().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDePlacasCantoneiras()));
            this.precoTotalVasoCantoneira = this.lista.getVasoCantoneira().getPreco1().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDeVasosCantoneira()));
            this.precoTotalBolsaDeSubstratoCantoneira = this.precoTotalVasoCantoneira;
            this.precoTotalPlacaVerticalCantoneira = this.lista.getPlacaVerticalCantoneira().getPreco1().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDePlacasVerticaisCantoneira()));
            this.precoTotalUniaoCantoneira = this.lista.getUniaoCantoneira().getPreco1().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDeUniaoCantoneira()));

            this.precoTotalTuboCego = this.lista.getTuboCego().getPreco1().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalTuboCego()));
            this.precoTotalGotejador = this.lista.getGotejador2l().getPreco1().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalGotejadores()));
            this.precoTotalConectorCotovelo = this.lista.getConectorCotovelo().getPreco1().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalCotovelos()));
            this.precoTotalConectorTe = this.lista.getConectorTe().getPreco1().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalTes()));
            this.precoTotalConectorFinalDeLinha = this.lista.getFinalDeLinha().getPreco1().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalFinalDeLinha()));
            this.precoTotalConectorInicial = this.lista.getConectorInicial().getPreco1().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalConectorInicial()));

            this.precoTotalParafuso = this.lista.getParafuso().getPreco1().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalParafusos()));
            this.precoTotalBuchas = this.precoTotalParafuso;

        } else if (listaDePrecos == 2) {

            this.precoTotalPlacaHorizontalMetade = lista.getPlacaHorizontalMedate().getPreco2().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDePlacasHorizontais()));
            this.precoTotalPlacaVertical = lista.getPlacaVertical().getPreco2().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDePlacasVerticais()));
            this.precoTotalVasoRedondo = lista.getVasoRedondo().getPreco2().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDeVasos()));
            this.precoTotalBolsaDeSubstrato = lista.getBolsaSubstrato().getPreco2().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDeBolsasDeSubstrato()));
            this.precoTotalNicho = lista.getPlacaNicho().getPreco2().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDePlacasNicho()));
            this.precoTotalDuplo = this.precoTotalPlacaHorizontalMetade;
            this.precoTotalInicialFinal = lista.getInicialFinal().getPreco2().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDeIniciaisFinais()));
            this.precoTotalPinoDeTravamento = lista.getPinoTravamento().getPreco2().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDePinosDeTravamento()));
            this.precoTotalPlacaCantoneira = lista.getPlacaCantoneira().getPreco2().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDePlacasCantoneiras()));
            this.precoTotalVasoCantoneira = lista.getVasoCantoneira().getPreco2().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDeVasosCantoneira()));
            this.precoTotalBolsaDeSubstratoCantoneira = this.precoTotalVasoCantoneira;
            this.precoTotalPlacaVerticalCantoneira = lista.getPlacaVerticalCantoneira().getPreco2().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDePlacasVerticaisCantoneira()));
            this.precoTotalUniaoCantoneira = lista.getUniaoCantoneira().getPreco2().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDeUniaoCantoneira()));

            this.precoTotalTuboCego = lista.getTuboCego().getPreco2().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalTuboCego()));
            this.precoTotalGotejador = lista.getGotejador2l().getPreco2().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalGotejadores()));
            this.precoTotalConectorCotovelo = lista.getConectorCotovelo().getPreco2().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalCotovelos()));
            this.precoTotalConectorTe = lista.getConectorTe().getPreco2().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalTes()));
            this.precoTotalConectorFinalDeLinha = lista.getFinalDeLinha().getPreco2().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalFinalDeLinha()));
            this.precoTotalConectorInicial = lista.getConectorInicial().getPreco2().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalConectorInicial()));

            this.precoTotalParafuso = lista.getParafuso().getPreco2().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalParafusos()));
            this.precoTotalBuchas = this.precoTotalParafuso;

        }   else if (listaDePrecos == 3) {

                this.precoTotalPlacaHorizontalMetade = lista.getPlacaHorizontalMedate().getPreco3().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDePlacasHorizontais()));
                this.precoTotalPlacaVertical = lista.getPlacaVertical().getPreco3().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDePlacasVerticais()));
                this.precoTotalVasoRedondo = lista.getVasoRedondo().getPreco3().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDeVasos()));
                this.precoTotalBolsaDeSubstrato = lista.getBolsaSubstrato().getPreco3().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDeBolsasDeSubstrato()));
                this.precoTotalNicho = lista.getPlacaNicho().getPreco3().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDePlacasNicho()));
                this.precoTotalDuplo = this.precoTotalPlacaHorizontalMetade;
                this.precoTotalInicialFinal = lista.getInicialFinal().getPreco3().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDeIniciaisFinais()));
                this.precoTotalPinoDeTravamento = lista.getPinoTravamento().getPreco3().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDePinosDeTravamento()));
                this.precoTotalPlacaCantoneira = lista.getPlacaCantoneira().getPreco3().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDePlacasCantoneiras()));
                this.precoTotalVasoCantoneira = lista.getVasoCantoneira().getPreco3().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDeVasosCantoneira()));
                this.precoTotalBolsaDeSubstratoCantoneira = this.precoTotalVasoCantoneira;
                this.precoTotalPlacaVerticalCantoneira = lista.getPlacaVerticalCantoneira().getPreco3().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDePlacasVerticaisCantoneira()));
                this.precoTotalUniaoCantoneira = lista.getUniaoCantoneira().getPreco3().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalDeUniaoCantoneira()));

                this.precoTotalTuboCego = lista.getTuboCego().getPreco3().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalTuboCego()));
                this.precoTotalGotejador = lista.getGotejador2l().getPreco3().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalGotejadores()));
                this.precoTotalConectorCotovelo = lista.getConectorCotovelo().getPreco3().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalCotovelos()));
                this.precoTotalConectorTe = lista.getConectorTe().getPreco3().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalTes()));
                this.precoTotalConectorFinalDeLinha = lista.getFinalDeLinha().getPreco3().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalFinalDeLinha()));
                this.precoTotalConectorInicial = lista.getConectorInicial().getPreco3().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalConectorInicial()));

                this.precoTotalParafuso = lista.getParafuso().getPreco3().multiply(BigDecimal.valueOf(calculoEstrutura.getTotalParafusos()));
                this.precoTotalBuchas = this.precoTotalParafuso;

            }

        this.precoTotalEstrutural = this.precoTotalPlacaHorizontalMetade.add(this.precoTotalPlacaVertical).add(this.precoTotalVasoRedondo)
                .add(this.precoTotalBolsaDeSubstrato).add(this.precoTotalInicialFinal).add(this.precoTotalPinoDeTravamento).add(this.precoTotalPlacaCantoneira).add(this.precoTotalVasoCantoneira)
                .add(this.precoTotalUniaoCantoneira).add(this.precoTotalBolsaDeSubstratoCantoneira).add(this.precoTotalPlacaVerticalCantoneira).add(this.precoTotalNicho).add(this.precoTotalDuplo);

        this.precoTotalIrrigacao = this.precoTotalTuboCego.add(this.precoTotalGotejador).add(this.precoTotalConectorTe).add(this.precoTotalConectorCotovelo)
                .add(this.precoTotalConectorFinalDeLinha).add(this.precoTotalConectorInicial);

        this.precoTotalFixacao = this.precoTotalParafuso.add(this.precoTotalBuchas);


    }
}

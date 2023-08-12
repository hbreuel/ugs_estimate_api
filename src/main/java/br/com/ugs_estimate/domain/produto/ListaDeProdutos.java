    package br.com.ugs_estimate.domain.produto;

    import lombok.Getter;
    import lombok.Setter;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.boot.context.event.ApplicationReadyEvent;
    import org.springframework.context.event.EventListener;
    import org.springframework.stereotype.Component;

    import java.math.BigDecimal;
    import java.util.ArrayList;
    import java.util.List;


    @Getter
    @Setter
    public class ListaDeProdutos {
        private List<Produto> listaProdutos = new ArrayList<>();



        //Produto placaHorizontal;
        Produto placaVertical;
        Produto placaCantoneira;
        Produto uniaoCantoneira;
        Produto vasoCantoneira;
        Produto bolsaSubstratoCantoneira;
        Produto placaVerticalCantoneira;
        Produto telinhaVasoQuadrado;
        Produto vasoRedondo;
        Produto vasoQuadrado;
        Produto bolsaSubstrato;
        Produto placaHorizontalMedate;
        Produto placaNicho;

        Produto pinoTravamento;
        Produto inicialFinal;

        Produto conchaGrowGreen;
        Produto pinoTravamentoGrowGreen;
        Produto vasoRoofGreen;
        Produto grelhaRoofGreen;

        Produto gotejador2l;
        Produto tuboCego;
        Produto conectorTe;

        Produto conectorCotovelo;
        Produto finalDeLinha;
        Produto conectorInicial;
        Produto parafuso;
        Produto bucha;
        Produto controladorAlta1s;
        Produto controladorAlta2s;
        Produto controladorBaixa1s;
        Produto controladorBaixa2s;


        public ListaDeProdutos() {
            this.placaVertical = new Produto("100.001.002", "PLACA VERTICAL",
                    new BigDecimal("2.70"), new BigDecimal("2.80"), new BigDecimal("3.05"));
            this.placaCantoneira = new Produto("100.001.003", "PLACA CANTONEIRA",
                    new BigDecimal("3.05"), new BigDecimal("3.30"), new BigDecimal("3.55"));
            this.uniaoCantoneira = new Produto("100.001.004", "UNIÃO CANTONEIRA",
                    new BigDecimal("0.80"), new BigDecimal("0.85"), new BigDecimal("0.90"));
            this.vasoCantoneira = new Produto("100.001.005", "VASO CANTONEIRA",
                    new BigDecimal("4.35"), new BigDecimal("4.55"), new BigDecimal("4.90"));
            this.bolsaSubstratoCantoneira = new Produto("100.001.006", "BOLSA SUBSTRATO CANTONEIRA",
                    new BigDecimal("3.70"), new BigDecimal("3.85"), new BigDecimal("4.15"));
            this.placaVerticalCantoneira = new Produto("100.001.007", "PLACA VERTICAL CANTONEIRA - ANTIGA",
                    new BigDecimal("2.25"), new BigDecimal("2.35"), new BigDecimal("2.55"));
            this.vasoRedondo = new Produto("100.001.009", "VASO REDONDO",
                    new BigDecimal("2.90"), new BigDecimal("3.05"), new BigDecimal("3.30"));
            this.bolsaSubstrato = new Produto("100.001.011", "BOLSA SUBSTRATO VASO REDONDO",
                    new BigDecimal("3.70"), new BigDecimal("3.85"), new BigDecimal("4.15"));
            this.placaHorizontalMedate = new Produto("100.001.012", "PLACA HORIZONTAL METADE",
                    new BigDecimal("5.15"), new BigDecimal("5.40"), new BigDecimal("5.80"));
            this.placaNicho = new Produto("100.001.013", "PLACA HORIZONTAL NICHO",
                    new BigDecimal("5.15"), new BigDecimal("5.40"), new BigDecimal("5.80"));
            this.pinoTravamento = new Produto("100.001.014", "PINO TRAVAMENTO",
                    new BigDecimal("0.035"), new BigDecimal("0.040"), new BigDecimal("0.045"));
            this.inicialFinal  = new Produto("100.001.015", "INICIAL/FINAL",
                    new BigDecimal("0.25"), new BigDecimal("0.30"), new BigDecimal("0.35"));
            this.tuboCego = new Produto("302.001.003", "TUBO CEGO 16MM - METRO",
                    new BigDecimal("1.90"), new BigDecimal("2.10"), new BigDecimal("2.50"));
            this.conectorTe = new Produto("302.001.005", "TÊ DENTADO 17MM",
                    new BigDecimal("2.30"), new BigDecimal("2.50"), new BigDecimal("2.80"));
            this.conectorCotovelo = new Produto("302.001.004", "COTOVELO DENTADO 17MM",
                    new BigDecimal("2.00"), new BigDecimal("2.20"), new BigDecimal("2.50"));
            this.finalDeLinha = new Produto("302.001.006", "CONECTOR FINAL TIPO 8",
                    new BigDecimal("0.40"), new BigDecimal("0.50"), new BigDecimal("0.60"));
            this.conectorInicial = new Produto("302.001.008", "CONECTOR INICIAL 17MM X 1/2\"",
                    new BigDecimal("2.50"), new BigDecimal("3.00"), new BigDecimal("3.50"));
            this.parafuso = new Produto("303.001.002", "PARAFUSO INOX 8MM X 70MM",
                    new BigDecimal("2.00"), new BigDecimal("3.00"), new BigDecimal("4.00"));
            this.bucha = new Produto("303.001.005", "BUCHA DE NYLON 8MM",
                    new BigDecimal("0.25"), new BigDecimal("0.30"), new BigDecimal("0.35"));
            this.controladorAlta1s =  new Produto("300.001.001", "CONTROLADOR HUNTER BLUE TOOTH - AP - 1 SETOR",
                    new BigDecimal("890.00"), new BigDecimal("990.00"), new BigDecimal("1190.00"));
            this.controladorAlta2s = new Produto("300.001.002", "CONTROLADOR HUNTER BLUE TOOTH - AP - 2 SETORES",
                    new BigDecimal("1350.00"), new BigDecimal("1450.00"), new BigDecimal("1550.00"));
            this.controladorBaixa1s = new Produto("300.001.003", "CONTROLADOR HUNTER BLUE TOOTH - BP - 1 SETOR",
                    new BigDecimal("2300.00"), new BigDecimal("2600.00"), new BigDecimal("2900.00"));
            this.controladorBaixa2s  = new Produto("300.001.004", "CONTROLADOR HUNTER BLUE TOOTH - BP - 2 SETORES",
                    new BigDecimal("2800.00"), new BigDecimal("3100.00"), new BigDecimal("3600.00"));
        }
//
//        public ListaDeProdutos() {
////            listaProdutos.add(this.placaHorizontal = new Produto("100.001.001", "PLACA HORIZONTAL INTEIRA",
////                    new BigDecimal("7.80"), new BigDecimal("8.20"), new BigDecimal("8.80")));
//            listaProdutos.add(this.placaVertical = new Produto("100.001.002", "PLACA VERTICAL",
//                    new BigDecimal("2.70"), new BigDecimal("2.80"), new BigDecimal("3.05")));
//            listaProdutos.add(this.placaCantoneira = new Produto("100.001.003", "PLACA CANTONEIRA",
//                    new BigDecimal("3.05"), new BigDecimal("3.30"), new BigDecimal("3.55")));
//            listaProdutos.add(this.uniaoCantoneira = new Produto("100.001.004", "UNIÃO CANTONEIRA",
//                    new BigDecimal("0.80"), new BigDecimal("0.85"), new BigDecimal("0.90")));
//            listaProdutos.add(this.vasoCantoneira =  new Produto("100.001.005", "VASO CANTONEIRA",
//                    new BigDecimal("4.35"), new BigDecimal("4.55"), new BigDecimal("4.90")));
//            listaProdutos.add(this.bolsaSubstratoCantoneira = new Produto("100.001.006", "BOLSA SUBSTRATO CANTONEIRA",
//                    new BigDecimal("3.70"), new BigDecimal("3.85"), new BigDecimal("4.15")));
//            listaProdutos.add(this.placaVerticalCantoneira = new Produto("100.001.007", "PLACA VERTICAL CANTONEIRA - ANTIGA",
//                    new BigDecimal("2.25"), new BigDecimal("2.35"), new BigDecimal("2.55")));
//    //        listaProdutos.add(new Produto("100.001.008", "TELINHA VASO QUADRADO",
//    //                new BigDecimal("0.60"), new BigDecimal("0.65"), new BigDecimal("0.70")));
//            listaProdutos.add(this.vasoRedondo = new Produto("100.001.009", "VASO REDONDO",
//                    new BigDecimal("2.90"), new BigDecimal("3.05"), new BigDecimal("3.30")));
//            listaProdutos.add(new Produto("100.001.010", "VASO QUADRADO",
//                    new BigDecimal("3.85"), new BigDecimal("4.05"), new BigDecimal("4.35")));
//            listaProdutos.add(this.bolsaSubstrato = new Produto("100.001.011", "BOLSA SUBSTRATO VASO REDONDO",
//                    new BigDecimal("3.70"), new BigDecimal("3.85"), new BigDecimal("4.15")));
//            listaProdutos.add(this.placaHorizontalMedate = new Produto("100.001.012", "PLACA HORIZONTAL METADE",
//                    new BigDecimal("5.15"), new BigDecimal("5.40"), new BigDecimal("5.80")));
//            listaProdutos.add(this.placaNicho = new Produto("100.001.013", "PLACA HORIZONTAL NICHO",
//                    new BigDecimal("5.15"), new BigDecimal("5.40"), new BigDecimal("5.80")));
//            listaProdutos.add(this.pinoTravamento = new Produto("100.001.014", "PINO TRAVAMENTO",
//                    new BigDecimal("0.035"), new BigDecimal("0.040"), new BigDecimal("0.045")));
//            listaProdutos.add( this.inicialFinal = new Produto("100.001.015", "INICIAL/FINAL",
//                    new BigDecimal("0.25"), new BigDecimal("0.30"), new BigDecimal("0.35")));
//    //        listaProdutos.add(new Produto("100.001.018", "CONCHA GROW GREEN",
//    //                new BigDecimal("1.85"), new BigDecimal("1.95"), new BigDecimal("2.10")));
//    //        listaProdutos.add(new Produto("100.001.019", "PINO TRAVAMENTO GROW GREEN",
//    //                new BigDecimal("0.035"), new BigDecimal("0.040"), new BigDecimal("0.045")));
//    //        listaProdutos.add(new Produto("200.001.001", "VASO ROOFGREEN",
//    //                new BigDecimal("4.65"), new BigDecimal("4.85"), new BigDecimal("5.25")));
//    //        listaProdutos.add(new Produto("200.001.002", "GRELHA ROOFGREEN",
//    //                new BigDecimal("0.70"), new BigDecimal("0.75"), new BigDecimal("0.80")));
//    //        listaProdutos.add(new Produto("200.001.003", "TRAVA VASO MANGUEIRA",
//    //                new BigDecimal("0.15"), new BigDecimal("0.20"), new BigDecimal("0.25")));
//    //        listaProdutos.add(new Produto("200.001.004", "TRAVA VASO TUBO",
//    //                new BigDecimal("0.15"), new BigDecimal("0.20"), new BigDecimal("0.25")));
//    //        listaProdutos.add(new Produto("200.001.005", "PINO TRAVA PEQUENO",
//    //                new BigDecimal("0.20"), new BigDecimal("0.25"), new BigDecimal("0.30")));
//    //        listaProdutos.add(new Produto("200.001.006", "PINO TRAVA PEQUENO",
//    //                new BigDecimal("0.20"), new BigDecimal("0.25"), new BigDecimal("0.30")));
//            listaProdutos.add(this.controladorAlta1s =  new Produto("300.001.001", "CONTROLADOR HUNTER BLUE TOOTH - AP - 1 SETOR",
//                    new BigDecimal("890.00"), new BigDecimal("990.00"), new BigDecimal("1190.00")));
//            listaProdutos.add(this.controladorAlta2s = new Produto("300.001.002", "CONTROLADOR HUNTER BLUE TOOTH - AP - 2 SETORES",
//                    new BigDecimal("1350.00"), new BigDecimal("1450.00"), new BigDecimal("1550.00")));
//            listaProdutos.add(this.controladorBaixa1s = new Produto("300.001.003", "CONTROLADOR HUNTER BLUE TOOTH - BP - 1 SETOR",
//                    new BigDecimal("2300.00"), new BigDecimal("2600.00"), new BigDecimal("2900.00")));
//            listaProdutos.add(this.controladorBaixa2s = new Produto("300.001.004", "CONTROLADOR HUNTER BLUE TOOTH - BP - 2 SETORES",
//                    new BigDecimal("2800.00"), new BigDecimal("3100.00"), new BigDecimal("3600.00")));
//            listaProdutos.add(this.gotejador2l = new Produto("302.001.001", "GOTEJADOR AUTOCOMPENSANTE 2 LITROS/HORA",
//                    new BigDecimal("1.20"), new BigDecimal("1.35"), new BigDecimal("1.50")));
//            listaProdutos.add(new Produto("302.001.002", "GOTEJADOR AUTOCOMPENSANTE 8 LITROS/HORA",
//                    new BigDecimal("1.20"), new BigDecimal("1.35"), new BigDecimal("1.50")));
//            listaProdutos.add(this.tuboCego = new Produto("302.001.003", "TUBO CEGO 16MM - METRO",
//                    new BigDecimal("1.90"), new BigDecimal("2.10"), new BigDecimal("2.50")));
//            listaProdutos.add(this.conectorCotovelo = new Produto("302.001.004", "COTOVELO DENTADO 17MM",
//                    new BigDecimal("2.00"), new BigDecimal("2.20"), new BigDecimal("2.50")));
//            listaProdutos.add( this.conectorTe = new Produto("302.001.005", "TÊ DENTADO 17MM",
//                    new BigDecimal("2.30"), new BigDecimal("2.50"), new BigDecimal("2.80")));
//            listaProdutos.add(this.finalDeLinha = new Produto("302.001.006", "CONECTOR FINAL TIPO 8",
//                    new BigDecimal("0.40"), new BigDecimal("0.50"), new BigDecimal("0.60")));
//            listaProdutos.add(new Produto("302.001.007", "UNIÃO 17MM X 17MM",
//                    new BigDecimal("2.00"), new BigDecimal("2.20"), new BigDecimal("2.50")));
//            listaProdutos.add(this.conectorInicial = new Produto("302.001.008", "CONECTOR INICIAL 17MM X 1/2\"",
//                    new BigDecimal("2.50"), new BigDecimal("3.00"), new BigDecimal("3.50")));
//    //        listaProdutos.add(new Produto("302.001.009", "MANIFOLD 4 SAÍDAS",
//    //                new BigDecimal("2.50"), new BigDecimal("3.00"), new BigDecimal("3.50")));
//    //        listaProdutos.add(new Produto("302.001.010", "ESPAGUETE 8 MM - METRO",
//    //                new BigDecimal("1.00"), new BigDecimal("1.25"), new BigDecimal("1.50")));
//    //        listaProdutos.add(new Produto("302.001.011", "TUBO GOTEJADOR MULTIBAR 2 LITROS/HORA",
//    //                new BigDecimal("7.00"), new BigDecimal("8.50"), new BigDecimal("10.00")));
//    //        listaProdutos.add(new Produto("303.001.001", "PARAFUSO BICROMATIZADO 5MM X 60MM",
//    //                new BigDecimal("1.00"), new BigDecimal("1.50"), new BigDecimal("2.00")));
//            listaProdutos.add(this.parafuso = new Produto("303.001.002", "PARAFUSO INOX 8MM X 70MM",
//                    new BigDecimal("2.00"), new BigDecimal("3.00"), new BigDecimal("4.00")));
//    //        listaProdutos.add(new Produto("303.001.003", "PARAFUSO BICROMATIZADO 6MM X 50MM",
//    //                new BigDecimal("0.75"), new BigDecimal("1.00"), new BigDecimal("1.25")));
//    //        listaProdutos.add(new Produto("303.001.004", "BUCHA DE NYLON 6MM",
//    //                new BigDecimal("0.20"), new BigDecimal("0.25"), new BigDecimal("0.30")));
//            listaProdutos.add(this.bucha = new Produto("303.001.005", "BUCHA DE NYLON 8MM",
//                    new BigDecimal("0.25"), new BigDecimal("0.30"), new BigDecimal("0.35")));
//        }
    }

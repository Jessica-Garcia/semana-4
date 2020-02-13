package br.com.jessica.padroes.strategyb.teste;

import br.com.jessica.padroes.strategyb.modelo.Calculadora;
import br.com.jessica.padroes.strategyb.modelo.Soma;
import br.com.jessica.padroes.strategyb.modelo.Subtrai;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora soma = new Soma();
        System.out.println("Soma: " + soma.calcular(5, 3));

        Calculadora subtrai = new Subtrai();
        System.out.println("Subtrai: " + subtrai.calcular(5, 3));

    }
}

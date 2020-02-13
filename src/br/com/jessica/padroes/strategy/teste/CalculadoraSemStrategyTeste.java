package br.com.jessica.padroes.strategy.teste;

import br.com.jessica.padroes.strategy.modelo.CalculadoraSemStrategy;

public class CalculadoraSemStrategyTeste {
    public static void main(String[] args) {
        CalculadoraSemStrategy c = new CalculadoraSemStrategy();
        System.out.println(c.calcular(2.5, 2.5, '+'));
    }
}

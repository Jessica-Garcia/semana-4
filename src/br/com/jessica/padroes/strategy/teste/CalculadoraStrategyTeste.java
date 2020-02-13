package br.com.jessica.padroes.strategy.teste;

import br.com.jessica.padroes.strategy.modelo.*;

public class CalculadoraStrategyTeste {
    public static void main(String[] args) {
        CalculadoraContext calculadora = new CalculadoraContext(new Somar());
        System.out.println("Soma: " + calculadora.calcular(5, 3));

        calculadora = new CalculadoraContext(new Subtrair());
        System.out.println("Subtração: " + calculadora.calcular(5, 3));

        calculadora = new CalculadoraContext(new Multiplicar());
        System.out.println("Multiplicação: " + calculadora.calcular(5, 3));

        calculadora = new CalculadoraContext(new Dividir());
        System.out.println("Divisão: " + calculadora.calcular(5, 3));
    }
}

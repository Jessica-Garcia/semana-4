package br.com.jessica.padroes.strategy.modelo;

public class Dividir implements CalculadoraStrategy {
    @Override
    public double operacao(double numero1, double numero2) {
        return numero1 / numero2;
    }
}

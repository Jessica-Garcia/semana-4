package br.com.jessica.padroes.strategyb.modelo;


public class Soma implements Calculadora{

    @Override
    public double calcular(double numero1, double numero2) {
        return numero1 + numero2;
    }
}

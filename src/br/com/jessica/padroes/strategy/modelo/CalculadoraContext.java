package br.com.jessica.padroes.strategy.modelo;

public class CalculadoraContext {
    private CalculadoraStrategy strategy;

    public CalculadoraContext(CalculadoraStrategy strategy) {
        this.strategy = strategy;
    }
    public double calcular(double numero1, double numero2){
        return strategy.operacao(numero1,numero2);
    }
}

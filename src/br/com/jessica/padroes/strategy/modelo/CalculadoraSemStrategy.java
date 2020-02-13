package br.com.jessica.padroes.strategy.modelo;

public class CalculadoraSemStrategy {
    public double calcular(double numero1, double numero2, char operacao){
        double resultado = 0.0;
        if(operacao == '+'){
            resultado = numero1 + numero2;
        }
        else if (operacao == '-'){
            resultado = numero1 - numero2;
        }
        else if (operacao == '*'){
            resultado = numero1 * numero2;
        }
        else if (operacao == '/'){
            resultado = numero1 / numero2;
        }
        return resultado;
    }
}

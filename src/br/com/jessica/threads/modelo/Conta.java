package br.com.jessica.threads.modelo;

public class Conta {
    private int saldo = 50;

    public int getSaldo() {
        return saldo;
    }

    public void saca(int valor){
        saldo -=  valor;
    }
}

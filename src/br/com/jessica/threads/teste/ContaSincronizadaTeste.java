package br.com.jessica.threads.teste;

import br.com.jessica.threads.modelo.ContaSincronizada;

public class ContaSincronizadaTeste {
    public static void main(String[] args) {
        ContaSincronizada contaSincronizada = new ContaSincronizada();
        Thread william = new Thread(contaSincronizada, "Willian");
        Thread ana = new Thread(contaSincronizada, "Ana");
        william.start();
        ana.start();
    }
}

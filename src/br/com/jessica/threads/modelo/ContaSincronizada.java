package br.com.jessica.threads.modelo;

public class ContaSincronizada implements Runnable{

    private Conta conta = new Conta();

    // esse método precisa ser acessado por apenas uma thread por vez,
    // isso é possível usando synchronized

    private synchronized void saque(int valor){
        // synchronized (conta) { bloco de códigigo que quer sincronizar}
        if (conta.getSaldo() >= valor){
            System.out.println(Thread.currentThread().getName() + " está indo sacar");
            conta.saca(valor);
            System.out.println(Thread.currentThread().getName() + " completou o saque, saldo: " + conta.getSaldo());
        }
        else{
            System.out.println("Sem saldo para: " +
                    Thread.currentThread().getName() +
                    " efetuar o saque, saldo: " +
                    conta.getSaldo());
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            saque(10);
            if(conta.getSaldo() < 0){
                System.out.println("Deu ruim!");
            }
        }
    }
}

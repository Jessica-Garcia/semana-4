package br.com.jessica.threads.modelo;

public class ThreadRunnable implements Runnable{

    private String nome;
    private int tempo;

    public ThreadRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        //Thread t = new Thread(this);
        //t.start();
    }

    @Override
    public void run() {
        try {
            for (int i=0; i<6; i++ ){
                System.out.println("Thread: " + nome + " contador " + i);
                Thread.sleep(tempo);
            }
        }
        catch (InterruptedException e){
            System.out.println("Ocorreu um erro");
        }
        System.out.println(nome + " Terminou a execução");
    }
}

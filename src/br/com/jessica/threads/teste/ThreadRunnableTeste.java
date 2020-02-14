package br.com.jessica.threads.teste;

import br.com.jessica.threads.modelo.ThreadRunnable;

public class ThreadRunnableTeste {
    public static void main(String[] args) {

        ThreadRunnable thread1 = new ThreadRunnable("#1", 500);
        ThreadRunnable thread2 = new ThreadRunnable("#2", 500);
        ThreadRunnable thread3 = new ThreadRunnable("#3", 500);

        //precisamos criar um objeto do tipo Thread passando a instância
        // da classe runnable como parâmetro, para podermos chamar o start();

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        //pode-se definir prioridades para as threads, mas nem sempre ela vai seguir
        //essa prioridade (definir antes do start();).

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        //para dar início ao método run que executa a thread é preciso chamar o
        //método start();
        t1.start();
        t2.start();
        t3.start();

        // o método join vai fazer com que o main espere a execução das outras
        //threads acabar para depois continuar a execução do código
        try {
            t1.join();
            t2.join();
            t3.join();
        }
        catch (InterruptedException e){
            System.out.println("Ocorreu um erro");
        }

        System.out.println("Programa Finalizado");
    }
}

package br.com.jessica.padroes.singleton.modelo;

import java.util.HashSet;
import java.util.Set;

public class AviaoSingleton {

    private static AviaoSingleton instance;
    private Set<String> assentosDisponiveis;

    private AviaoSingleton() {
        this.assentosDisponiveis = new HashSet<>();
        assentosDisponiveis.add("1A");
        assentosDisponiveis.add("1B");
    }

    public boolean reservaAssento(String assento){
        return assentosDisponiveis.remove(assento);
    }

    public static AviaoSingleton getInstance() {
        if(instance == null){
            synchronized (AviaoSingleton.class){
                if (instance == null){
                    instance = new AviaoSingleton();
                }
            }
        }
        return instance;
    }
}

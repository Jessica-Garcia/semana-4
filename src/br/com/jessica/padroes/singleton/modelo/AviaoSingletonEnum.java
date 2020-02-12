package br.com.jessica.padroes.singleton.modelo;

import java.util.HashSet;
import java.util.Set;

public enum AviaoSingletonEnum {
    instance;
    private Set<String> assentosDisponiveis;

    AviaoSingletonEnum() {
        this.assentosDisponiveis = new HashSet<>();
        assentosDisponiveis.add("1A");
        assentosDisponiveis.add("1B");
    }

    private boolean reservaAssento(String assento){
        return assentosDisponiveis.remove(assento);
    }

    public static void comprarAssento(String assento){
        AviaoSingletonEnum aviao = AviaoSingletonEnum.instance;
        System.out.println(aviao.reservaAssento(assento));
    }
}

package br.com.jessica.padroes.singleton.teste;

import br.com.jessica.padroes.singleton.modelo.AviaoSingleton;

public class AviaoSingletonTeste {
    public static void main(String[] args) {
        comprarAssento("1A");
        comprarAssento("1A");

        AviaoSingleton aviaoSingleton = AviaoSingleton.getInstance();
        AviaoSingleton aviaoSingleton2 = AviaoSingleton.getInstance();

        // possuem o mesmo endereço, apontam para o mesmo objeto, no entanto isso pode
        // ser mudado com reflection
        System.out.println(aviaoSingleton);
        System.out.println(aviaoSingleton2);
    }
    private static void comprarAssento(String assento){
        AviaoSingleton aviao = AviaoSingleton.getInstance();
        System.out.println(aviao.reservaAssento(assento));
    }
}

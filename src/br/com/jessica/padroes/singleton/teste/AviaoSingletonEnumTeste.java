package br.com.jessica.padroes.singleton.teste;

import br.com.jessica.padroes.singleton.modelo.AviaoSingletonEnum;

public class AviaoSingletonEnumTeste {
    public static void main(String[] args) {
        AviaoSingletonEnum.comprarAssento("1A");
        AviaoSingletonEnum.comprarAssento("1A");

    }
}

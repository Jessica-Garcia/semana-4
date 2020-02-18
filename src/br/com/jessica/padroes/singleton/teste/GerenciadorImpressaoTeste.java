package br.com.jessica.padroes.singleton.teste;

import br.com.jessica.padroes.singleton.modelo.GerenciadorImpressao;

public class GerenciadorImpressaoTeste {
    public static void main(String[] args) {
        GerenciadorImpressao g1 = GerenciadorImpressao.getInstance();
        GerenciadorImpressao g2 = GerenciadorImpressao.getInstance();
        GerenciadorImpressao g3 = GerenciadorImpressao.getInstance();
        GerenciadorImpressao g4 = GerenciadorImpressao.getInstance();
        //GerenciadorImpressao g5 = new GerenciadorImpressao();

        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(g4);
    }
}

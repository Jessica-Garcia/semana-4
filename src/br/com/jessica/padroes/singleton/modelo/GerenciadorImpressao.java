package br.com.jessica.padroes.singleton.modelo;

public class GerenciadorImpressao {
    private static GerenciadorImpressao gerenciadorImpressao;

    private GerenciadorImpressao() {
    }

    public static GerenciadorImpressao getInstance(){
        if (gerenciadorImpressao == null){
            gerenciadorImpressao = new GerenciadorImpressao();
            System.out.println("Objeto criado");
        }
        return gerenciadorImpressao;
    }
}

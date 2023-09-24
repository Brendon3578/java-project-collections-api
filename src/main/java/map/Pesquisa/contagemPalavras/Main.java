package main.java.map.Pesquisa.contagemPalavras;

import static main.java.textutils.CLI.imprimeLinha;

public class Main {
    public static void main(String[] args) {

        ContagemPalavras palavrasOcorrencia = new ContagemPalavras();

        imprimeLinha("exibir nenhuma palavras e sua ocorrência");
        palavrasOcorrencia.exibirContagemPalavra();

        palavrasOcorrencia.adicionarPalavra("você", 8);
        palavrasOcorrencia.adicionarPalavra("eu", 15);
        palavrasOcorrencia.adicionarPalavra("Brasil", 20);
        palavrasOcorrencia.adicionarPalavra("brasileiro", 10);

        imprimeLinha("exibir 4 palavras");
        palavrasOcorrencia.exibirContagemPalavra();

        imprimeLinha("exibir a palavra mais frequente");
        System.out.println(
            palavrasOcorrencia.encontrarPalavraMaisFrequente()
        );
    }
}

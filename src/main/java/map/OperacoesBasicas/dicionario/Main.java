package main.java.map.OperacoesBasicas.dicionario;

import static main.java.textutils.CLI.imprimeLinha;

public class Main {
    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();
        imprimeLinha("exibir nenhuma palavra no dicionário");

        dicionario.exibirPalavras();

        imprimeLinha("adicionar 4 palavras");
        dicionario.adicionarPalavra("ignóbil", "aquele que não é nobre");
        dicionario.adicionarPalavra("incólume", "sem lesão ou ferimento; intato; ileso");
        dicionario.adicionarPalavra("filosofal", "relativo a filósofo");
        dicionario.adicionarPalavra("kafkiano", "Relativo a Franz Kafka");
        dicionario.adicionarPalavra("kafkiano", "semelhante à obra de Kafka, evoca uma atmosfera de pesadelo, de absurdo");

        dicionario.exibirPalavras();

        String palavraProcurada = "kafkiano";
        imprimeLinha("pesquisar a definição de "+ palavraProcurada);
        System.out.println(dicionario.pesquisarPorPalavra(palavraProcurada));

        String palavraParaRemover = "filosofal";
        imprimeLinha("remover a palavra " + palavraParaRemover);
        dicionario.removerPalavra(palavraParaRemover);

        dicionario.exibirPalavras();
    }
}

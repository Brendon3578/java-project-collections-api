package main.java.set.OperacoesBasicas.conjuntoPalavrasUnicas;


import static main.java.textutils.CLI.imprimeLinha;

public class Main {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        imprimeLinha("exibir nenhuma palavra");
        palavrasUnicas.exibirPalavrasUnicas();

        imprimeLinha("exibir 4 palavras únicas");
        palavrasUnicas.adicionarPalavra("Banana");
        palavrasUnicas.adicionarPalavra("Banana");
        palavrasUnicas.adicionarPalavra("Maçã");
        palavrasUnicas.adicionarPalavra("Pêra");
        palavrasUnicas.adicionarPalavra("Mirtilo");
        palavrasUnicas.exibirPalavrasUnicas();

        String palavraParaEncontrar = "Banana";

        imprimeLinha("verificar se existe a palavra " + palavraParaEncontrar);
        System.out.println(palavrasUnicas.verificarPalavra(palavraParaEncontrar));

        String palavraParaRemover = "Maçã";
        imprimeLinha("remover a palavra " + palavraParaRemover);

        palavrasUnicas.removerPalavra(palavraParaRemover);
        palavrasUnicas.exibirPalavrasUnicas();
    }
}

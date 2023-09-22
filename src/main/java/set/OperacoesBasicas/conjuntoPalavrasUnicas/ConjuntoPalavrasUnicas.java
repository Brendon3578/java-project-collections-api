package main.java.set.OperacoesBasicas.conjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<String>();
    }

    public void adicionarPalavra(String palavra) {
        this.palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String palavraParaRemover = null;

        for(String p : palavrasUnicasSet) {
            if (p.equals(palavra)) {
                palavraParaRemover = p;
                break;
            }
        }

        palavrasUnicasSet.remove(palavraParaRemover);
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnicasSet);
    }

}

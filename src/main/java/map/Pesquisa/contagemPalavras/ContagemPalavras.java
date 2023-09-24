package main.java.map.Pesquisa.contagemPalavras;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        this.contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        this.contagemPalavrasMap.remove(palavra);
    }

    public void exibirContagemPalavra() {
        System.out.println(contagemPalavrasMap);
    }

    public Entry<String, Integer> encontrarPalavraMaisFrequente() {
        Entry<String, Integer> palavraMaisFrequente = null;
        int maiorFrequencia = 0;

        for (Entry<String, Integer> contagemPalavra : contagemPalavrasMap.entrySet()) {
            int ocorrenciaAtual = contagemPalavra.getValue();

            if (ocorrenciaAtual > maiorFrequencia) {
                maiorFrequencia = ocorrenciaAtual;
                palavraMaisFrequente = contagemPalavra;
            }
        }

        return palavraMaisFrequente;
    }
}

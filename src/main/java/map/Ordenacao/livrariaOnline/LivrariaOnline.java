package main.java.map.Ordenacao.livrariaOnline;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livrosMap;

    public LivrariaOnline() {
        this.livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String ISBN, String titulo, String autor, double preco) {
        Livro livro = new Livro(titulo, autor, preco);

        this.livrosMap.put(ISBN, livro);
    }

    public void exibirLivros() {
        System.out.println(livrosMap);
    }

    public void removerLivro(String titulo) {
        String linkLivroParaSerRemovido = null;
        for(Map.Entry<String, Livro> livroEntry : livrosMap.entrySet()) {
            String tituloAtual = livroEntry.getValue().getTitulo();
            if (tituloAtual.equalsIgnoreCase(titulo)) {
                linkLivroParaSerRemovido = livroEntry.getKey();
                break;
            }
        }
        this.livrosMap.remove(linkLivroParaSerRemovido);
    }

    public List<Livro> exibirLivrosOrdenadosPorPreco() {
        List<Livro> livrosOrdenados = new ArrayList(livrosMap.values());

        Collections.sort(livrosOrdenados, new ComparatorPorPreco());

        return livrosOrdenados;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
            Livro livro = entry.getValue();
            if (livro.getAutor().equals(autor)) {
                livrosPorAutor.put(entry.getKey(), livro);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> obterLivroMaisCaro() {
        List<Livro> livrosMaisCaro = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;

        for (Livro livro : livrosMap.values()) {
            if (livro.getPreco() > precoMaisAlto) {
                precoMaisAlto = livro.getPreco();
            }
        }
        for(Map.Entry<String, Livro> entry: livrosMap.entrySet()) {
            if(entry.getValue().getPreco() == precoMaisAlto) {
                Livro livroComPrecoMaisAlto = livrosMap.get(entry.getKey());
                livrosMaisCaro.add(livroComPrecoMaisAlto);
            }
        }
        return livrosMaisCaro;
    }

    public List<Livro> obterLivroMaisBarato() {
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;

        for (Livro livro : livrosMap.values()) {
            if (livro.getPreco() < precoMaisBaixo) {
                precoMaisBaixo = livro.getPreco();
            }
        }

        for(Map.Entry<String, Livro> entry: livrosMap.entrySet()) {
            if(entry.getValue().getPreco() == precoMaisBaixo) {
                Livro livroComPrecoMaisBaixo = livrosMap.get(entry.getKey());
                livrosMaisBaratos.add(livroComPrecoMaisBaixo);
            }
        }
        return livrosMaisBaratos;
    }
}

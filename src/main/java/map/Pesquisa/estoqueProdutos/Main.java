package main.java.map.Pesquisa.estoqueProdutos;

import static main.java.textutils.CLI.imprimeLinha;

public class Main {
    public static void main(String[] args) {
        EstoqueProdutos produtos = new EstoqueProdutos();

        imprimeLinha("exibir nenhum produto");
        produtos.exibirProdutos();

        imprimeLinha("exibir 4 produtos");
        produtos.adicionarProduto(1002, "Banana Nanica", 3.5,50);
        produtos.adicionarProduto(1003, "Banana Prata", 2.75, 20);
        produtos.adicionarProduto(1003, "Maracujá", 5.05, 30);
        produtos.adicionarProduto(1004, "Abacate", 5.83, 10);
        produtos.adicionarProduto(1005, "Pêra", 6.94, 30);

        produtos.exibirProdutos();

        imprimeLinha("exibir produto mais caro");
        System.out.println(produtos.obterProdutoMaisCaro());

        imprimeLinha("exibir produto mais barato");
        System.out.println(produtos.obterProdutoMaisBarato());

        imprimeLinha("calcular valor total que está no estoque");
        System.out.println(produtos.calcularValorTotalEstoque());

        imprimeLinha("calcular o produto que tem o maior valor total no estoque");
        System.out.println(produtos.obterProdutoMaiorValorTotalNoEstoque());
    }
}

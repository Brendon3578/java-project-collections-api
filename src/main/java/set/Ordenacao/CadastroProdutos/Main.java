package main.java.set.Ordenacao.CadastroProdutos;


import static main.java.textutils.CLI.imprimeLinha;

public class Main {
    public static void main(String[] args) {
        CadastroProdutos produtos = new CadastroProdutos();

        imprimeLinha("exibir nenhum produto cadastrado");
        System.out.println("Há " + produtos.obterQuantidadeDeProdutos() + " produtos cadastrados");

        imprimeLinha("cadastrar 4 produtos e exibir por nome");

        produtos.adicionarProduto(105, "Coca cola 350ml", 4.0d, 10);
        produtos.adicionarProduto(106, "Pepsi 350ml", 4.0d, 10);
        produtos.adicionarProduto(106, "Pepsi 350ml", 4.0d, 10);
        produtos.adicionarProduto(100, "Salgadinho Ruffles 167g", 8.99, 15);
        produtos.adicionarProduto(1002, "Abacate", 5.99, 20);

        System.out.println("Há " + produtos.obterQuantidadeDeProdutos() + " produtos cadastrados");
        System.out.println(produtos.exibirProdutosPorNome());

        imprimeLinha("exibir os produtos por ordem de preço");
        System.out.println(produtos.exibirProdutosPorPreco());
    }
}

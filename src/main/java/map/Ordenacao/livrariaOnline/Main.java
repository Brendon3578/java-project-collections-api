package main.java.map.Ordenacao.livrariaOnline;

import static main.java.textutils.CLI.imprimeLinha;

public class Main {
    public static void main(String[] args) {
        
        LivrariaOnline livros = new LivrariaOnline();
        
        imprimeLinha("mostrar nenhum livro criado");
        livros.exibirLivros();


        imprimeLinha("adicionar 7 livros");

        livros.adicionarLivro("1","Harry Potter a Pedra Filosofal", "J.K. Rowling", 35);
        livros.adicionarLivro("2", "Harry Potter a Câmara Secreta", "J.K. Rowling", 40);
        livros.adicionarLivro("3", "Harry Potter o Prisioneiro de Azkaban", "J.K. Rowling", 40);
        livros.adicionarLivro("4", "O Hobbit", "J.R.R Tolkien", 59);
        livros.adicionarLivro("5", "O Senhor dos Anéis: A Sociedade do Anel", "J.R.R Tolkien", 59);
        livros.adicionarLivro("6", "O Senhor dos Anéis: As Duas Torres", "J.R.R Tolkien", 59);
        livros.adicionarLivro("7", "Mil Novecentos e Oitenta e Quatro", "George Orwell", 70);

        livros.exibirLivros();

        imprimeLinha("ordenar livros por preço");
        System.out.println(
            livros.exibirLivrosOrdenadosPorPreco()
        );

        imprimeLinha("obter o livro mais barato");
        System.out.println(
            livros.obterLivroMaisBarato()
        );

        imprimeLinha("obter o livro mais caro");
        System.out.println(
            livros.obterLivroMaisCaro()
        );


        String nomeAutorPesquisado = "J.K. Rowling";
        imprimeLinha("mostrar os livros da autor(a) " + nomeAutorPesquisado);
        System.out.println(
            livros.pesquisarLivrosPorAutor(nomeAutorPesquisado)
        );

        String tituloParaRemover = "Mil Novecentos e Oitenta e Quatro";

        imprimeLinha("remover o livro de título " + tituloParaRemover);
        livros.removerLivro(tituloParaRemover);
        livros.exibirLivros();
        
    }
}

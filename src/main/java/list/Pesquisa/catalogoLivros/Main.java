package main.java.list.Pesquisa.catalogoLivros;


import java.util.List;

import static main.java.textutils.CLI.imprimeLinha;

public class Main {

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        imprimeLinha("adicionar Livros");
        catalogoLivros.adicionarLivro("Harry Potter a Pedra Filosofal", "J.K. Rowling", 1997);
        catalogoLivros.adicionarLivro("Harry Potter a Câmara Secreta", "J.K. Rowling", 1998);
        catalogoLivros.adicionarLivro("Harry Potter o Prisioneiro de Azkaban", "J.K. Rowling", 1999);
        catalogoLivros.adicionarLivro("O Hobbit", "J.R.R Tolkien", 1937);
        catalogoLivros.adicionarLivro("O Senhor dos Anéis: A Sociedade do Anel", "J.R.R Tolkien", 1954);
        catalogoLivros.adicionarLivro("O Senhor dos Anéis: As Duas Torres", "J.R.R Tolkien", 1954);
        catalogoLivros.adicionarLivro("Mil Novecentos e Oitenta e Quatro", "George Orwell", 1949);
        catalogoLivros.exibirLivros();

        imprimeLinha("exibir livros de George Orwell ");
        List<Livro> livrosDeGeorgeOrwell = catalogoLivros.pesquisarPorAutor("George Orwell");
        catalogoLivros.exibirLivros(livrosDeGeorgeOrwell);

        imprimeLinha("exibir um livro do Hobbit ");
        Livro livroDoHobbit = catalogoLivros.pesquisarPorTitulo("o Hobbit");
        System.out.println(livroDoHobbit);


        imprimeLinha("exibir livros entre 1997 e 2000 ");
        List<Livro> livrosEntreDoisAnos = catalogoLivros.pesquisarPorIntervaloAnos(1997,2000);
        catalogoLivros.exibirLivros(livrosEntreDoisAnos);

    }
}

package main.java.comparableXcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void imprimeLinha() {
        System.out.println("--#---------------------------------------#--");
    }

    public static void imprimirLivros(ArrayList<Livro> livros) {
        for (Livro livro: livros) {
            String str = String.join(" - ", livro.getTitulo(), livro.getAutor(), Integer.toString(livro.getAno()));
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<Livro>(){
            {
                add(new Livro("Harry Potter a Pedra Filosofal", "J.K. Rowling", 1997));
                add(new Livro("Harry Potter a Câmara Secreta", "J.K. Rowling", 1998));
                add(new Livro("Harry Potter o Prisioneiro de Azkaban", "J.K. Rowling", 1999));
                add(new Livro("O Hobbit", "J.R.R Tolkien", 1937));
                add(new Livro("O Senhor dos Anéis", "J.K. Rowling", 1954));
                add(new Livro("Mil Novecentos e Oitenta e Quatro", "George Orwell", 1949));
            }
        };

        imprimeLinha();
        System.out.println("Livros após a ordenação natural (Título): ");

        Collections.sort(livros);
        imprimirLivros(livros);

        imprimeLinha();

        System.out.println("Livros após a ordenação por ano: ");
        Collections.sort(livros, new CompararAno());
        imprimirLivros(livros);

        imprimeLinha();

        System.out.println("Livros após a ordenação por autor: ");
        Collections.sort(livros, new CompararAutor());
        imprimirLivros(livros);

        imprimeLinha();

        System.out.println("Livros após a ordenação por ano, autor e título: ");
        Collections.sort(livros, new CompararAutorTitulo());
        imprimirLivros(livros);

    }
}

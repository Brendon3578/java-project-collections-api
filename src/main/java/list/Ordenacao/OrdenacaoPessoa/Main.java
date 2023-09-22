package main.java.list.Ordenacao.OrdenacaoPessoa;

import static main.java.textutils.CLI.imprimeLinha;

public class Main {
    public static void main(String[] args) {

        OrdenacaoPessoa pessoas = new OrdenacaoPessoa();

        imprimeLinha("criar objetos de pessoas");
        pessoas.adicionarPessoa("Brendon", 19, 1.80);
        pessoas.adicionarPessoa("Walter White", 50, 1.79);
        pessoas.adicionarPessoa("Michael Scott", 39, 1.75);
        pessoas.adicionarPessoa("Bilbo Bolseiro", 50, 1.25);

        pessoas.listarPessoas();

        imprimeLinha("ordenar pessoas por idade");
        System.out.println(pessoas.ordenarPorIdade());

        imprimeLinha("ordenar pessoas por altura");
        System.out.println(pessoas.ordenarPorAltura());

    }
}

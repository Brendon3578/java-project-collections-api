package main.java.list.Ordenacao.OrdenacaoNumeros;


import static main.java.textutils.CLI.imprimeLinha;

public class Main {
    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        imprimeLinha("adicionar números na lista");
        numeros.adicionarNumero(3);
        numeros.adicionarNumero(14);
        numeros.adicionarNumero(15);
        numeros.adicionarNumero(9);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(6);
        numeros.adicionarNumero(53);
        numeros.adicionarNumero(58);

        imprimeLinha("ordenar números em ordem ascendente");

        System.out.println(numeros.ordenarAscendente());

        imprimeLinha("ordenar números em ordem descendente");
        System.out.println(numeros.ordenarDescendente());
    }
}

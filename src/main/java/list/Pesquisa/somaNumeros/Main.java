package main.java.list.Pesquisa.somaNumeros;

public class Main {
    public static void imprimeLinha(String mensagem) {
        System.out.println("> " +"-".repeat(64));
        System.out.println("> Deve " + mensagem);
    }

    public static void main(String[] args) {
        SomaNumeros numerosLista = new SomaNumeros();

        numerosLista.adicionarNumero(2);
        numerosLista.adicionarNumero(5);
        numerosLista.adicionarNumero(-2);
        numerosLista.adicionarNumero(-50);
        numerosLista.adicionarNumero(50);

        imprimeLinha("mostrar os números");
        numerosLista.exibirNumeros();

        imprimeLinha("calcular a soma dos números");

        System.out.println(numerosLista.calcularSoma());

        imprimeLinha("mostrar o maior número");
        System.out.println(numerosLista.encontrarMaiorNumero());


        imprimeLinha("mostrar o menor número");
        System.out.println(numerosLista.encontrarMenorNumero());


    }
}

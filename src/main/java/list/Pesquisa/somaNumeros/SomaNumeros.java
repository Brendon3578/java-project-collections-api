package main.java.list.Pesquisa.somaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosLista;

    public SomaNumeros() {
        this.numerosLista = new ArrayList<Integer>();
    }

    public void adicionarNumero(int numero) {
        this.numerosLista.add(numero);
    }

    public int calcularSoma() {
        int total = 0;
        for (Integer n : numerosLista) {
            total += n;
        }

        return total;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = 0;

        for (Integer n : numerosLista) {
            maiorNumero = Integer.max(maiorNumero, n);
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = 0;

        for (Integer n : numerosLista) {
            menorNumero = Integer.min(menorNumero, n);
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        System.out.println(numerosLista);
    }

}

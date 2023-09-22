package main.java.list.Ordenacao.OrdenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros implements Comparator<Integer> {
    private List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    @Override
    public int compare(Integer i1, Integer i2) {
        return Integer.compare(i1,i2);
    }

    public void adicionarNumero(int numero) {
        this.listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosEmOrdemAscendente = new ArrayList<>(listaNumeros);
        Collections.sort(numerosEmOrdemAscendente);
        return numerosEmOrdemAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosEmOrdemDescendente = new ArrayList<>(listaNumeros);
        numerosEmOrdemDescendente.sort(Collections.reverseOrder());
        return  numerosEmOrdemDescendente;
    }

}

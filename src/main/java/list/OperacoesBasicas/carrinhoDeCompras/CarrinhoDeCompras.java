package main.java.list.OperacoesBasicas.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    public List<Item> itensLista;

    public CarrinhoDeCompras() {
        this.itensLista = new ArrayList<Item>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        this.itensLista.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensRemovidos = new ArrayList();

        if (!itensLista.isEmpty()) {
            for (Item i : itensLista) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensRemovidos.add(i);
                }
            }
        } else {
            System.out.println("A lista está vazia!");
        }

        this.itensLista.removeAll(itensRemovidos);
    }

    public double calcularValorTotal() {
        double total = 0;

        if (!itensLista.isEmpty()) {
            for (Item i : itensLista) {
                total += i.getPreco() * i.getQuantidade();
            }
            return total;
        } else {
            throw new RuntimeException("A Lista está vazia, operação não pode ser efetuada.");
        }


    }

    public void exibirItens() {
        System.out.println(itensLista);
    }
}

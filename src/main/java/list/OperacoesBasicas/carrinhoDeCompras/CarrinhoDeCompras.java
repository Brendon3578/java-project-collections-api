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
        List itensRemovidos = new ArrayList();

        for (Item i : itensLista) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensRemovidos.add(i);
            }
        }

        this.itensLista.removeAll(itensRemovidos);
    }

    public double calcularValorTotal() {
        double total = 0;

        for (Item i : itensLista) {
            total += i.getPreco() * i.getQuantidade();
        }
        return total;
    }

    public void exibirItens() {
        System.out.println(itensLista);
    }
}

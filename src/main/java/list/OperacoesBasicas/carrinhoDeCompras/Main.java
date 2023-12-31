package main.java.list.OperacoesBasicas.carrinhoDeCompras;

import static main.java.textutils.CLI.imprimeLinha;

public class Main {

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeComprasList = new CarrinhoDeCompras();

        imprimeLinha("Carrinho de compras deve estar vazio");
        carrinhoDeComprasList.exibirItens();

        imprimeLinha("Carrinho de compras deve estar com um produto de coca-cola");
        carrinhoDeComprasList.adicionarItem("Coca-cola 2L", 4.50, 2);
        carrinhoDeComprasList.exibirItens();
        System.out.println("Total dos itens: R$" + carrinhoDeComprasList.calcularValorTotal());

        imprimeLinha("Carrinho de compras deve estar com um produto de pepsi apenas");
        carrinhoDeComprasList.removerItem("Coca-cola 2L");
        carrinhoDeComprasList.adicionarItem("Pepsi 2L", 3.50, 2);
        carrinhoDeComprasList.exibirItens();
        System.out.println("Total dos itens: R$" + carrinhoDeComprasList.calcularValorTotal());
    }
}

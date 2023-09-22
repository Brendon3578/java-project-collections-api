package main.java.set.OperacoesBasicas.conjuntoConvidado;


import static main.java.textutils.CLI.imprimeLinha;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        imprimeLinha("exibir nenhum convidado");
        System.out.println(convidados.contarConvidados());

        convidados.adicionarConvidado("Pessoa 1", 1233);
        convidados.adicionarConvidado("Pessoa 2", 1234);
        convidados.adicionarConvidado("Pessoa 3", 1235);
        convidados.adicionarConvidado("Pessoa 4", 1235);
        convidados.adicionarConvidado("Pessoa 5", 1236);

        imprimeLinha("exibir 4 convidados ");
        convidados.exibirConvidados();
    }
}

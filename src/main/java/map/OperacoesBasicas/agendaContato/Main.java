package main.java.map.OperacoesBasicas.agendaContato;

import static main.java.textutils.CLI.imprimeLinha;

public class Main {
    public static void main(String[] args) {

        AgendaContatos contatos = new AgendaContatos();

        imprimeLinha("exibir nenhum contato");
        contatos.exibirContatos();

        imprimeLinha("exibir 3 contatos");
        contatos.adicionarContato("Brendon", "1999-0999");
        contatos.adicionarContato("Brendon Desenvolvedor", "2999-0999");
        contatos.adicionarContato("Brendon", "3999-0999");
        contatos.adicionarContato("Brendon Desenvolvedor Cloud", "4999-0999");
        contatos.exibirContatos();

        imprimeLinha("procurar e exibir o telefone de contato de Brendon");
        System.out.println(contatos.pesquisarPorNome("Brendon"));

        String contatoParaRemover = "Brendon";
        imprimeLinha("remover o contato de " + contatoParaRemover);
        contatos.removerContato(contatoParaRemover);
        System.out.println("Contato de " +contatoParaRemover+ ": " +contatos.pesquisarPorNome(contatoParaRemover));

    }
}

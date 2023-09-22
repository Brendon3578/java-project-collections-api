package main.java.set.Pesquisa.agendaContatos;


import static main.java.textutils.CLI.imprimeLinha;

public class Main {
    public static void main(String[] args) {
        AgendaContatos contatos = new AgendaContatos();

        imprimeLinha("exibir nenhum contato da agenda");
        contatos.exibirContatos();

        imprimeLinha("adicionar 4 novos contatos (sem a repetição do nome)");
        contatos.adicionarContato("Brendon", "9999-9999");
        contatos.adicionarContato("Brendon Github", "9999-9999");
        contatos.adicionarContato("Desenvolvedor Cloud", "9999-9999");
        contatos.adicionarContato("Desenvolvedor Full-stack", "9999-9999");
        contatos.adicionarContato("Brendon", "9999-9999");
        contatos.exibirContatos();

        imprimeLinha("atualizar o número de contato");
        Contato contatoAtualizado = contatos.atualizarNumeroContato("Brendon", "8888-8888");
        System.out.println(contatoAtualizado);
        contatos.exibirContatos();

        String nomeContatoPesquisado = "Desenvolvedor";

        imprimeLinha("pesquisar contatos pelo nome de: '"  + nomeContatoPesquisado + "'");
        System.out.println(contatos.pesquisarPorNome(nomeContatoPesquisado));
    }
}

package main.java.list.OperacoesBasicas.tarefas;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void imprimeLinha(String mensagem) {
        System.out.println("> " +"-".repeat(64));
        System.out.println("> Testando se " + mensagem);
    }

    public static void main(String[] args) {
        ListaTarefas listaDeTarefas = new ListaTarefas();
        imprimeLinha("lista está vazia");
        System.out.println("O total de tarefas é " + listaDeTarefas.obterNumeroTotalTarefas());

        imprimeLinha("lista deve conter 3 tarefas");
        listaDeTarefas.adicionarNovaTarefa("Tarefa 1");
        listaDeTarefas.adicionarNovaTarefa("Tarefa 2");
        listaDeTarefas.adicionarNovaTarefa("Tarefa 3");

        listaDeTarefas.obterDescricoesTarefas();


        imprimeLinha("lista deve conter apenas 2 tarefas e remover a tarefa 1");
        listaDeTarefas.adicionarNovaTarefa("Tarefa 1");
        listaDeTarefas.adicionarNovaTarefa("Tarefa 1");
        listaDeTarefas.removerTarefa("Tarefa 1");
        listaDeTarefas.listarTarefas();

        imprimeLinha("lista deve adicionar 2 tarefas do dia 14 e 15");
        listaDeTarefas.adicionarNovaTarefaComData("Tarefa do dia 15/09/2023", LocalDate.parse("2023-09-15"));
        listaDeTarefas.adicionarNovaTarefaComData("Tarefa do dia 14/09/2023", LocalDate.parse("2023-09-14"));
        listaDeTarefas.listarTarefas();

        imprimeLinha("lista deve remover tarefas anteriores do dia 18");
        listaDeTarefas.removerTarefaAnterioresQueUmaData(LocalDate.parse("2023-09-18"));
        listaDeTarefas.listarTarefas();
    }
}

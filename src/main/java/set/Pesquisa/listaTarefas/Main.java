package main.java.set.Pesquisa.listaTarefas;



import static main.java.textutils.CLI.imprimeLinha;

public class Main {
    public static void main(String[] args) {
        ListaTarefas tarefas = new ListaTarefas();

        imprimeLinha("exibir nenhuma tarefa");
        tarefas.exibirTarefas();
        tarefas.contarTarefas();

        imprimeLinha("adicionar 5 tarefas");

        tarefas.adicionarTarefa("Estudar Java");
        tarefas.adicionarTarefa("Estudar AWS");
        tarefas.adicionarTarefa("Estudar sobre DevOps");
        tarefas.adicionarTarefa("Estudar sobre Spring Boot");
        tarefas.adicionarTarefa("Estudar sobre Storage");
        tarefas.adicionarTarefa("Estudar Java");
        tarefas.exibirTarefas();

        imprimeLinha("contar as tarefas");
        System.out.println("Quantidade de tarefas: " + tarefas.contarTarefas());

        imprimeLinha("marcar duas tarefas concluídas e exibir as duas");
        System.out.println(tarefas.marcarTarefaConcluida("Estudar Java"));
        System.out.println(tarefas.marcarTarefaConcluida("Estudar AWS"));
        System.out.println("Tarefas concluídas:" + tarefas.obterTarefasConcluidas());

        imprimeLinha("marcar uma tarefa pendente e mostrar 4 tarefas pendentes");
        System.out.println(tarefas.marcarTarefaPendente("Estudar Java"));
        System.out.println("Tarefas pendentes:" + tarefas.obterTarefasPendentes());

        imprimeLinha("remover todas as tarefas");
        tarefas.limparListaTarefas();

        imprimeLinha("mostrar que a lista de tarefas já está vázia");
        tarefas.limparListaTarefas();

    }
}

package main.java.list.OperacoesBasicas.tarefas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaDeTarefas;

    public ListaTarefas() {
        this.listaDeTarefas = new ArrayList<>();
    }

    public void adicionarNovaTarefa(String descricao) {
        this.listaDeTarefas.add(new Tarefa(descricao));
    }

    public void adicionarNovaTarefaComData(String descricao, LocalDate data) {
        this.listaDeTarefas.add(new Tarefa(descricao, data));
    }
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : listaDeTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }

        listaDeTarefas.removeAll(tarefasParaRemover);
    }

    public void removerTarefaAnterioresQueUmaData(LocalDate dataToRemove) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : listaDeTarefas) {
            boolean tarefaEhAntesDaDataEspecifica = t.getDataTarefa().isBefore(dataToRemove);
            if (tarefaEhAntesDaDataEspecifica) {
                tarefasParaRemover.add(t);
            }
        }

        listaDeTarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return listaDeTarefas.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(listaDeTarefas);
    }

    public void listarTarefas() {
        for (Tarefa t : listaDeTarefas) {
            System.out.println(t.getDescricao() + " - criado em: " + t.getDataTarefa());
        }
    }

}

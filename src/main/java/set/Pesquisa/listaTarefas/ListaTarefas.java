package main.java.set.Pesquisa.listaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<Tarefa>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;

        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equals(descricao)) {
                tarefaParaRemover = t;
                break;
            }
        }
        this.tarefaSet.remove(tarefaParaRemover);
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet();

        for (Tarefa t : tarefaSet) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet();

        for (Tarefa t : tarefaSet) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }

        return tarefasPendentes;
    }

    public Tarefa marcarTarefaConcluida(String descricao) {
        Tarefa tarefaConcluida = null;

        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
                tarefaConcluida = t;
                break;
            }
        }

        return tarefaConcluida;
    }

    public Tarefa marcarTarefaPendente(String descricao) {
        Tarefa tarefaPendente = null;

        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(false);
                tarefaPendente = t;
                break;
            }
        }

        return tarefaPendente;
    }

    public void limparListaTarefas() {
        if (this.tarefaSet.isEmpty()) {
            System.out.println("Lista de tarefas já foi esvaziada.");
        } else {
            this.tarefaSet.clear();
        }
    }

}

package main.java.list.OperacoesBasicas.tarefas;

import java.time.LocalDate;

public class Tarefa {
    private String descricao;
    private LocalDate dataTarefa;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.dataTarefa = LocalDate.now();
    }

    public Tarefa(String descricao, LocalDate dataTarefa) {
        this.descricao = descricao;
        this.dataTarefa = dataTarefa;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataTarefa() {
        return dataTarefa;
    }

    public void setDataTarefa(LocalDate dataTarefa) {
        this.dataTarefa = dataTarefa;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", dataTarefa=" + dataTarefa +
                '}';
    }
}

package main.java.set.Ordenacao.listaAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, int matricula, double mediaFinal) {
        this.alunoSet.add(new Aluno(nome, matricula, mediaFinal));
    }

    public void removerAluno(int matricula) {
        Aluno alunoParaRemover = null;

        for (Aluno a : alunoSet) {
            if (a.getMatricula() == matricula) {
                alunoParaRemover = a;
                break;
            }
        }

        this.alunoSet.remove(alunoParaRemover);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorMediaFinal() {
        Set<Aluno> alunosPorMedia = new TreeSet<>(new ComparatorPorMediaFinal());
        alunosPorMedia.addAll(alunoSet);
        return alunosPorMedia;
    }

    public Set<Aluno> exibirAlunos() {
        return this.alunoSet;
    }

}

package main.java.set.Ordenacao.listaAlunos;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private int matricula;
    private double mediaFinal;

    public Aluno(String nome, int matricula, double mediaFinal) {
        this.nome = nome;
        this.matricula = matricula;
        this.mediaFinal = mediaFinal;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                nome + '\'' +
                ", matricula=" + matricula +
                ", nota=" + mediaFinal +
                '}';
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return getMatricula() == aluno.getMatricula();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }
}

class ComparatorPorMediaFinal implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getMediaFinal(), a2.getMediaFinal());
    }
}
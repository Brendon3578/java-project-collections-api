package main.java.set.Ordenacao.listaAlunos;

import static main.java.textutils.CLI.imprimeLinha;

public class Main {
    public static void main(String[] args) {
        GerenciadorAlunos alunos = new GerenciadorAlunos();

        imprimeLinha("exibir nenhum aluno criado");
        System.out.println(alunos.exibirAlunos());

        imprimeLinha("criar 4 alunos com matrículas únicas");
        alunos.adicionarAluno("Brendon", 1, 9);
        alunos.adicionarAluno("Ciclano", 2, 8);
        alunos.adicionarAluno("Beltrano", 3, 6);
        alunos.adicionarAluno("Fulano Repetido", 3, 7);
        alunos.adicionarAluno("Lepano", 4, 10);

        System.out.println(alunos.exibirAlunos());

        imprimeLinha("listar alunos por ordem alfabética");
        System.out.println(alunos.exibirAlunosPorNome());

        imprimeLinha("listar alunos por ordem de maior média final");
        System.out.println(alunos.exibirAlunosPorMediaFinal());

    }
}

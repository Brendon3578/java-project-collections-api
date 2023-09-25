package main.java.map.Ordenacao.agendaEventos;

import java.time.LocalDate;

import static main.java.textutils.CLI.imprimeLinha;

public class Main {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        imprimeLinha("mostrar nenhum evento agendado");
        agendaEventos.exibirAgenda();

        imprimeLinha("adicionar 4 eventos");

        LocalDate dataDaqui4Dias = LocalDate.now().plusDays(4);
        LocalDate dataDaqui3Dias = LocalDate.now().plusDays(3);
        LocalDate dataDaqui2Dias = LocalDate.now().plusDays(2);
        LocalDate dataDaqui1Dias = LocalDate.now().plusDays(1);

        agendaEventos.adicionarEvento(dataDaqui1Dias, "Festival de Halloween", "Halloween legal");
        agendaEventos.adicionarEvento(dataDaqui2Dias, "Festival de Natal", "Christmas legal");
        agendaEventos.adicionarEvento(dataDaqui3Dias, "Festival de Páscoa", "Easter legal");
        agendaEventos.adicionarEvento(dataDaqui4Dias, "Festival do Saci", "Saci legal");

        agendaEventos.exibirAgenda();

        imprimeLinha("Mostrar a agenda mais próxima");
        System.out.println(agendaEventos.obterProximoEvento());
    }
}

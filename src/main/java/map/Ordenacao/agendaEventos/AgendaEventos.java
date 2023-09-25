package main.java.map.Ordenacao.agendaEventos;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        this.eventosMap.put(data, evento);
    }

    private Map<LocalDate, Evento> obterEventosEmOrdemDeProximidade(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<LocalDate, Evento>(this.eventosMap);
        return eventosTreeMap;
    }

    public void exibirAgenda() {
        System.out.println(this.obterEventosEmOrdemDeProximidade());
    }

    public Evento obterProximoEvento() {
        Map<LocalDate, Evento> eventos = this.obterEventosEmOrdemDeProximidade();
        Evento eventoProximo = null;

        // Set<LocalDate> dataSet = eventos.keySet();
        // Collection<Evento> values = eventos.values();


        LocalDate dataAtual = LocalDate.now();


        for(Map.Entry<LocalDate, Evento> entry : eventos.entrySet()) {
            LocalDate data = entry.getKey();

            if (data.isEqual(dataAtual) || data.isAfter(dataAtual)) {
                Evento evento = entry.getValue();
                System.out.println("O próximo evento: " + evento + " acontecerá na data " + data);
                eventoProximo = evento;
                break;
            }
        }

        return eventoProximo;
    }
}

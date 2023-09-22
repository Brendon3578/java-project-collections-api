package main.java.map.OperacoesBasicas.agendaContato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, String> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, String telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            System.out.println("[!] O Map está vazio!");
        }
    }

    public void exibirContatos() {
        if (agendaContatoMap.isEmpty()) {
            System.out.println("[!] Não há nenhum contato na agenda");
        } else {
            System.out.println(agendaContatoMap);
        }
    }

    public String pesquisarPorNome(String nome) {
        String telefonePorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            telefonePorNome = agendaContatoMap.get(nome);
        }
        return telefonePorNome;

    }
}

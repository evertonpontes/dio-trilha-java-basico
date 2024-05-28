package map.agendaContato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    Map<String, Contato> contatos;

    public AgendaContato() {
        this.contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        contatos.put(nome, new Contato(nome, telefone));
    }

    public void removerContato(String nome) {
        contatos.remove(nome);
    }

    public void exibirContato() {
        System.out.println(contatos);
    }

    public Integer pesquisarPorNome(String nome) {
        return contatos.get(nome).getTelefone();
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.adicionarContato("Nome 1", 123456);
        agendaContato.adicionarContato("Nome 2", 846636);
        agendaContato.adicionarContato("Nome 3", 000000);
        agendaContato.adicionarContato("Nome 4", 111111);
        agendaContato.adicionarContato("Nome 5", 888888);

        agendaContato.exibirContato();

        System.out.println(agendaContato.pesquisarPorNome("Nome 2"));

        agendaContato.removerContato("Nome 3");

        agendaContato.exibirContato();
    }
}

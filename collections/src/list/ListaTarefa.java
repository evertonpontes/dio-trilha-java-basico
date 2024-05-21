package list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> listaTarefaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                listaTarefaRemover.add(t);
            }
        }
        this.tarefaList.remove(listaTarefaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return this.tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(this.tarefaList);
    }
}

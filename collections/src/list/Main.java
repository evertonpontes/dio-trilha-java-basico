package list;

public class Main {
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Implement get,post,delete methods");
        listaTarefa.adicionarTarefa("Add createUser controller");
        listaTarefa.adicionarTarefa("Add Authenticate route");

        System.out.println(listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();

        listaTarefa.removerTarefa("Add createUser controller");

        System.out.println(listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();

    }
}

package set.conjuntoConvidado;

public class Main {

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Nome 1", 1);
        conjuntoConvidados.adicionarConvidado("Nome 2", 2);
        conjuntoConvidados.adicionarConvidado("Nome 3", 3);
        conjuntoConvidados.adicionarConvidado("Nome 4", 4);
        conjuntoConvidados.adicionarConvidado("Nome 5", 5);
        conjuntoConvidados.adicionarConvidado("Nome 6", 6);

        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(4);

        conjuntoConvidados.exibirConvidados();
    }
}

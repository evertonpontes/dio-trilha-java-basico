package set.conjuntoConvidado;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoRemover = null;

        if (!convidados.isEmpty()) {
            for(Convidado c: convidados) {
                if (c.getCodigoConvite() == codigoConvite) {
                    convidadoRemover = c;
                    break;
                }
            }

            convidados.remove(convidadoRemover);
        }
    }

    public void exibirConvidados() {
        System.out.println(convidados);
    }
}

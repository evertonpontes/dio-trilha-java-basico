package list.somaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int somaTotal = 0;

        if (!numeros.isEmpty()) {
            for(int n: numeros) {
                somaTotal += n;
            }
        }

        return somaTotal;
    }

    public int encontrarMaiorNumero() {
        int numeroMaior = numeros.get(0);

        if (!numeros.isEmpty()) {
            for(int n: numeros) {
                if (Integer.compare(n, numeroMaior) == 1) {
                    numeroMaior = n;
                }
            }
        }

        return numeroMaior;
    }

    public int encontrarMenorNumero() {
        int numeroMaior = numeros.get(0);

        if (!numeros.isEmpty()) {
            for(int n: numeros) {
                if (Integer.compare(n, numeroMaior) == -1) {
                    numeroMaior = n;
                }
            }
        }

        return numeroMaior;
    }

    public void exibirNumeros() {
        System.out.println(numeros);
    }
}

package list.somaNumeros;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        Random rand = new Random();

        somaNumeros.adicionarNumero(rand.nextInt(10,50));
        somaNumeros.adicionarNumero(rand.nextInt(10,50));
        somaNumeros.adicionarNumero(rand.nextInt(10,50));
        somaNumeros.adicionarNumero(rand.nextInt(10,50));
        somaNumeros.adicionarNumero(rand.nextInt(10,50));
        somaNumeros.adicionarNumero(rand.nextInt(10,50));
        somaNumeros.adicionarNumero(rand.nextInt(10,50));

        somaNumeros.exibirNumeros();

        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
    }
}

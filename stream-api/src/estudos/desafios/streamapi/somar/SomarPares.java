package estudos.desafios.streamapi.somar;

import java.util.List;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class SomarPares {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> getNumerosPares = (n1) -> n1 % 2 == 0;

        Optional<Integer> resultado = numeros.stream().filter(getNumerosPares).reduce(0, Integer::sum).describeConstable();

        resultado.ifPresent(integer -> System.out.println("O resultado é " + integer));
    }
}

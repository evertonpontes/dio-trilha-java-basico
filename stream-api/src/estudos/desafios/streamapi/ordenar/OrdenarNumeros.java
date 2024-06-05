package estudos.desafios.streamapi.ordenar;

import java.util.List;
import java.util.Arrays;

public class OrdenarNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream().sorted(Integer::compare).forEach(System.out::println);
    }

}

public class RepeticoesFor {
    public static void main(String[] args) throws Exception {
        String[] listaNomes = { "Maria", "Pedro", "João", "Ana", "Márcia" };

        for (int x = 0; x < listaNomes.length; x++) {
            System.out.println(listaNomes[x]);
        }

        // Outra forma de iterar itens de uma lista

        for (String nome : listaNomes) {
            System.out.println(nome);
        }
    }
}

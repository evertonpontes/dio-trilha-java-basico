import java.util.concurrent.ThreadLocalRandom;

public class RepeticoesWhile {
    public static void main(String[] args) {
        double quantDinheiroNaCarteira = 50.0;

        System.out.println("Comprando doces");

        while (quantDinheiroNaCarteira > 0) {
            double precoDoce = valorAleatorio();

            if (precoDoce > quantDinheiroNaCarteira) {
                break;
            }

            System.out.println("Doce preco " + precoDoce);
            quantDinheiroNaCarteira -= precoDoce;
        }

        System.out.println("Sobrou na carteira R$" + quantDinheiroNaCarteira);

    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}

public class SwitchCase {
    public static void main(String[] args) {
        char plano = 'A';

        switch (plano) {
            case 'T':
                System.out.println("Ligações ilimitadas para qualquer operadora.");

            case 'M':
                System.out.println("5Gb de Internet grátis.");

            case 'B':
                System.out.println("Whatsapp ilimitado.");
                break;

            default:
                System.out.println("Operação não reconhecida.");
        }
    }
}

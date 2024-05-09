import java.util.Scanner;

public class TratamentoExcecoes {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite o seu nome");
            String nome = scanner.next();
            System.out.println("Digite a sua idade");
            int idade = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Campo idade está incorreto!");
        }
        scanner.close();
    }
}

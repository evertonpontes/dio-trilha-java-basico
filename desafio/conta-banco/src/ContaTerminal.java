import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);

        System.out.printf("+-------------------------------+%n");
        System.out.printf("|          Conta Banco          |%n");
        System.out.printf("+-------------------------------+%n");

        System.out.println("Por favor, digite o número da Conta e.g.(1021)");

        int numero = Integer.valueOf(myObj.nextLine());

        System.out.println("Por favor, digite o número da Agência e.g.(067-8)");

        String agencia = myObj.nextLine();

        System.out.println("Por favor, digite o seu Nome");

        String nomeCliente = myObj.nextLine();

        System.out.println("Por favor, digite o seu Saldo");

        double saldo = Double.valueOf(myObj.nextLine());

        System.out.printf("+-------------------------------+%n");
        System.out.printf("|           Resultado           |%n");
        System.out.printf("+-------------------------------+%n");

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque.",
                nomeCliente, agencia, numero, saldo, "%n");

    }
}

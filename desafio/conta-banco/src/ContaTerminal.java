import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Por favor, digite o número da Conta e.g.(1021)> ");

        int numero = Integer.valueOf(myObj.nextLine());
        
        System.out.print("Por favor, digite o número da Agência e.g.(067-8)> ");

        String agencia = myObj.nextLine();

        System.out.print("Por favor, digite o seu Nome> ");

        String nomeCliente = myObj.nextLine();

        System.out.print("Por favor, digite o seu Saldo> ");

        double saldo = Double.valueOf(myObj.nextLine());

        System.out.print("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");

    }
}

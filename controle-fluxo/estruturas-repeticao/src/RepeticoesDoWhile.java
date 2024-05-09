import java.util.Arrays;
import java.util.Scanner;

public class RepeticoesDoWhile {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String[] emailList = {};

        System.out.println("Quantos emails devo adicionar na lista? ");
        int tamanhoLista = myScanner.nextInt();
        int count = 0;

        do {
            String email = "emailtest" + count + "@gmail.com";
            System.out.println(email);
            emailList = Arrays.copyOf(emailList, emailList.length + 1);
            emailList[emailList.length - 1] = email;
            count++;
        } while (emailList.length <= tamanhoLista);

        System.out.println(Arrays.toString(emailList));
    }
}

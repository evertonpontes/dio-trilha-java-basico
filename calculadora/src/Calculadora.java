import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Escreva uma operação. e.g. 1 + 2");

        String operation = myScanner.nextLine();

        String[] operationSplit = operation.split(" ");

        int numberOne = Integer.parseInt(operationSplit[0]);
        int numberTwo = Integer.parseInt(operationSplit[2]);
        String signal = operationSplit[1];

        int result = 0;

        switch (signal) {
            case "+":
                result = numberOne + numberTwo;
                break;

            case "-":
                result = numberOne - numberTwo;
                break;

            case "*":
                result = numberOne * numberTwo;
                break;

            case "/":
                result = numberOne / numberTwo;
                break;

            default:
                System.out.println("Operação não encontrada!");
                break;
        }

        System.out.println("Resultado da operação de " + signal + " é: " + result);
    }
}

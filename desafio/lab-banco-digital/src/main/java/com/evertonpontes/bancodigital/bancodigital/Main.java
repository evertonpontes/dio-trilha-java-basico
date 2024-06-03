package com.evertonpontes.bancodigital.bancodigital;

import com.evertonpontes.bancodigital.bancodigital.models.*;

public class Main {
    public static void main(String[] args) {
        Banco bradesco = new Banco("Bradesco");

        Cliente jose = new Cliente("Jose");
        Cliente maria = new Cliente("Maria");
        Cliente pedro = new Cliente("Pedro");

        Conta contaJose = new ContaCorrente(bradesco, jose);
        Conta contaMaria = new ContaPoupanca(bradesco, maria);
        Conta contaPedro = new ContaCorrente(bradesco, pedro);

        jose.setConta(contaJose);
        maria.setConta(contaMaria);
        pedro.setConta(contaPedro);

        bradesco.addContaParaList(contaJose);
        bradesco.addContaParaList(contaMaria);
        bradesco.addContaParaList(contaPedro);

        System.out.printf("*————— Informacoes do banco %s —————*%n", bradesco.getNome());

        System.out.println("Contas=");
        if (!bradesco.getContaList().isEmpty()) {
            for (Conta conta: bradesco.getContaList()) {
                System.out.println(conta);
            }
        } else {
            System.out.println("enpty");
        }
        System.out.println("*———————————————————————————————————*");
        System.out.printf("%n");

        System.out.printf("Depositando nas contas de %s, %s, %s%n", jose.getNome(), maria.getNome(), pedro.getNome());

        contaJose.depositar(100);
        contaMaria.depositar(20);
        contaPedro.depositar(85);

        System.out.println("Imprimindo o extrato");
        System.out.printf("%n");

        jose.getConta().imprimirExtrato();
        System.out.printf("%n");
        maria.getConta().imprimirExtrato();
        System.out.printf("%n");
        pedro.getConta().imprimirExtrato();
        System.out.printf("%n");

        System.out.printf("Transferindo dinheiro da conta de %s para conta de %s%n", jose.getNome(), maria.getNome());

        contaJose.transferir(50, contaMaria);

        System.out.println("Imprimindo o extrato");
        System.out.printf("%n");

        jose.getConta().imprimirExtrato();
        maria.getConta().imprimirExtrato();

    }
}
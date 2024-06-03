package com.evertonpontes.bancodigital.bancodigital.models;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Banco banco, Cliente cliente) {
        super(banco, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta Poupanca ===");
        super.imprimirInfosComuns();
    }
}

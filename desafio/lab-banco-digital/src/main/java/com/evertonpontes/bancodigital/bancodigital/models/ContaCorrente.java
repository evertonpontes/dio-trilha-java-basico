package com.evertonpontes.bancodigital.bancodigital.models;

public class ContaCorrente extends Conta {
    public ContaCorrente(Banco banco, Cliente cliente) {
        super(banco, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}

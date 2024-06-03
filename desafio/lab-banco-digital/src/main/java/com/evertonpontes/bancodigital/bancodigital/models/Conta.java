package com.evertonpontes.bancodigital.bancodigital.models;

public abstract class Conta implements IConta {

    private static int SEQUENCIAL = 1;

    private final int agencia;
    private final int numero;
    private final Banco banco;
    private final Cliente cliente;
    private double saldo;

    public Conta(Banco banco, Cliente cliente) {
        this.agencia = banco.getAgencia().getNumero();
        this.numero = SEQUENCIAL++;
        this.banco = banco;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo-=valor;
    }

    @Override
    public void depositar(double valor) {
        saldo+=valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Banco getBanco() {
        return banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Numero: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }

    @Override
    public String toString() {
        return String.format("{%nAgencia= %d,%nNumero= %d,%nBanco= %s,%nCliente= %s,%nSaldo= %.2f%n};", agencia, numero, banco.getNome(), cliente.getNome(), saldo);
    }
}
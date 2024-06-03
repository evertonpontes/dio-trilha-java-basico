package com.evertonpontes.bancodigital.bancodigital.models;

public class Cliente {
    private String nome;
    private Conta conta;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", conta=" + conta +
                '}';
    }
}

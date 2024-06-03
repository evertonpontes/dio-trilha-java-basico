package com.evertonpontes.bancodigital.bancodigital.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Banco {
    private final String nome;
    private final List<Conta> contaList;
    private final Agencia agencia;

    public Banco(String nome) {
        this.nome = nome;
        this.contaList = new ArrayList<>();
        this.agencia = generateAgencia();
    }

    public void addContaParaList(Conta novaConta) {
        contaList.add(novaConta);
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContaList() {
        return contaList;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    private static Agencia generateAgencia() {
        Random random = new Random();
        return new Agencia(random.nextInt(1000, 9999));
    }
}

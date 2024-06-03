package com.evertonpontes.bancodigital.bancodigital.models;

public class Agencia {
    private int numero;

    public Agencia(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "numero=" + numero +
                '}';
    }
}

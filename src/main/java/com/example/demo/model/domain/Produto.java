package com.example.demo.model.domain;

public abstract class Produto {

    String nome;
    float valor;
    int codigo;

    public String toString() {
        return "Produto{" + "nome=" + nome + ", valor=" + valor + ", codigo=" + codigo + '}';
    }

    public abstract float calcularValorFinal();
}

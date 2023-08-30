package com.example.demo.model.domain;

public class Comida extends Produto{

    float peso;
    boolean vegano;
    String ingredientes;

    public Comida(String nome, float valor, int codigo, float peso, boolean vegano, String ingredientes) {
        this.nome = nome;
        this.valor = valor;
        this.codigo = codigo;
        this.peso = peso;
        this.vegano = vegano;
        this.ingredientes = ingredientes;
    }

    public String toString(){
        return "Comida{" + "nome=" + nome + ", valor=" + valor + ", codigo=" + codigo + ", peso=" + peso + ", vegano=" + vegano + ", ingredientes=" + ingredientes + '}';
    }

    @Override
    public float calcularValorFinal() {
        return this.valor * peso;
    }
}

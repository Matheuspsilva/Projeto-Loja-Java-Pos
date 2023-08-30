package com.example.demo.model.domain;

public class Bebida extends Produto{

    boolean gelada;
    float tamanho;
    String marca;

    public Bebida(String nome, float valor, int codigo, boolean gelada, float tamanho, String marca) {
        this.nome = nome;
        this.valor = valor;
        this.codigo = codigo;
        this.gelada = gelada;
        this.tamanho = tamanho;
        this.marca = marca;
    }

    public String toString(){
        return "Bebida{" + "nome=" + nome + ", valor=" + valor + ", codigo=" + codigo + ", gelada=" + gelada + ", tamanho=" + tamanho + ", marca=" + marca + '}';
    }

    @Override
    public float calcularValorFinal() {
        return this.valor * tamanho;
    }
}

package com.example.demo.model.domain;

public class Sobremesa extends Produto{

    float quantidade;
    boolean doce;
    String informacoes;

    public Sobremesa(String nome, float valor, int codigo, float quantidade, boolean doce, String informacoes) {
        this.nome = nome;
        this.valor = valor;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.doce = doce;
        this.informacoes = informacoes;
    }

    public String toString(){
        return "Sobremesa{" + "nome=" + nome + ", valor=" + valor + ", codigo=" + codigo + ", quantidade=" + quantidade + ", doce=" + doce + ", informacoes=" + informacoes + '}';
    }

    public float calcularValorFinal() {
        return this.valor * quantidade;
    }
}

package com.example.demo.domain.model;

public class Comida extends Produto{

    //1.1 Todas as classes precisam ter pelo menos três atributos e todos
    //os tipos de dados precisam ser utilizados em pelo menos uma
    //ocorrência.

    float peso;
    boolean vegano;
    String ingredientes;

    float quantidade;

    public Comida(String nome, float valor, int codigo, float peso, boolean vegano, String ingredientes, float quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.codigo = codigo;
        this.peso = peso;
        this.vegano = vegano;
        this.ingredientes = ingredientes;
        this.quantidade = quantidade;
    }

    //1.3 Todas as classes de domínio precisam ter o toString
    //implementado.
    public String toString(){
        return "Comida{" + "nome=" + nome + ", valor=" + valor + ", codigo=" + codigo + ", peso=" + peso + ", vegano=" + vegano + ", ingredientes=" + ingredientes + '}';
    }

    //3.2 Cada filha precisa implementar diferentemente o método abstrato.
    @Override
    public float calcularIcmsIncidente() {
        return this.valor * 0.05f;
    }
}

package com.example.demo.domain.model;

public class Bebida extends Produto{

    //1.1 Todas as classes precisam ter pelo menos três atributos e todos
    //os tipos de dados precisam ser utilizados em pelo menos uma
    //ocorrência.

    boolean gelada;
    float tamanho;
    String marca;

    float quantidade;

    public Bebida(String nome, float valor, int codigo, boolean gelada, float tamanho, String marca, float quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.codigo = codigo;
        this.gelada = gelada;
        this.tamanho = tamanho;
        this.marca = marca;
        this.quantidade = quantidade;
    }

    //1.3 Todas as classes de domínio precisam ter o toString
    //implementado.
    public String toString(){
        return "Bebida{" + "nome=" + nome + ", valor=" + valor + ", codigo=" + codigo + ", gelada=" + gelada + ", tamanho=" + tamanho + ", marca=" + marca + '}';
    }

    public boolean isGelada() {
        return gelada;
    }

    public void setGelada(boolean gelada) {
        this.gelada = gelada;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    //3.2 Cada filha precisa implementar diferentemente o método abstrato.
    @Override
    public float calcularIcmsIncidente() {
        return this.valor * 0.12f;
    }
}

package com.example.demo.domain.model;

public class Sobremesa extends Produto{

    //1.1 Todas as classes precisam ter pelo menos três atributos e todos
    //os tipos de dados precisam ser utilizados em pelo menos uma
    //ocorrência.

    float quantidade;
    boolean doce;
    String informacoes;

    public Sobremesa(String nome, float valor, int codigo, boolean doce, String informacoes, float quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.doce = doce;
        this.informacoes = informacoes;
    }

    //1.3 Todas as classes de domínio precisam ter o toString
    //implementado.
    public String toString(){
        return "Sobremesa{" + "nome=" + nome + ", valor=" + valor + ", codigo=" + codigo + ", quantidade=" + quantidade + ", doce=" + doce + ", informacoes=" + informacoes + '}';
    }

    //3.2 Cada filha precisa implementar diferentemente o método abstrato.
    @Override
    public float calcularIcmsIncidente() {
        return this.valor * 0.05f;
    }
}

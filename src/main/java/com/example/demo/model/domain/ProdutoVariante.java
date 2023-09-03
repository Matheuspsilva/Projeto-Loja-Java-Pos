package com.example.demo.model.domain;

public class ProdutoVariante {

    //1.1 Todas as classes precisam ter pelo menos três atributos e todos
    //os tipos de dados precisam ser utilizados em pelo menos uma
    //ocorrência.

    private String nome;
    private String descricao;

    //1.3 Todas as classes de domínio precisam ter o toString
    //implementado.
    public String toString(){
        return "ProdutoVariante{" + "nome=" + nome + ", descricao=" + descricao + '}';
    }
}

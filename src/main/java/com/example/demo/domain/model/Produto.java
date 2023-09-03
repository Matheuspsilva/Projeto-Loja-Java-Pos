package com.example.demo.domain.model;

public abstract class Produto {

    //1.1 Todas as classes precisam ter pelo menos três atributos e todos
    //os tipos de dados precisam ser utilizados em pelo menos uma
    //ocorrência.

    String nome;
    float valor;
    int codigo;

    //1.3 Todas as classes de domínio precisam ter o toString
    //implementado.
    public String toString() {
        return "Produto{" + "nome=" + nome + ", valor=" + valor + ", codigo=" + codigo + '}';
    }

    public float getValor() {
        return this.valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    //2.1 É necessário criar um método abstrato na classe mãe.
    public abstract float calcularIcmsIncidente();
}

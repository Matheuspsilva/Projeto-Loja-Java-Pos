package com.example.demo.model.domain;

public class OrderItem {

    //1.1 Todas as classes precisam ter pelo menos três atributos e todos
    //os tipos de dados precisam ser utilizados em pelo menos uma
    //ocorrência.
    private Produto produto;
    private int quantidade;
    private Pedido pedido;

    public OrderItem(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float calcularValorTotal() {
        return quantidade * produto.getValor();
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    //1.3 Todas as classes de domínio precisam ter o toString
    //implementado.
    @Override
    public String toString() {
        return "OrderItem{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                ", pedido=" + pedido +
                '}';
    }
}
package com.example.demo.domain.model;

import com.example.demo.domain.service.GeradorNotaFiscalService;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public class Pedido {

    //1.1 Todas as classes precisam ter pelo menos três atributos e todos
    //os tipos de dados precisam ser utilizados em pelo menos uma
    //ocorrência.

    private String descricao;
    private LocalDateTime data;
    private boolean web;

    //3.3 Criação do relacionamento entre a classe principal e a mãe com
    //List.
    private List<OrderItem> orderItems;
    private Solicitante solicitante;
    //3.1 Criação de um atributo do tipo vetor.
    private String[] cumpons;

    //3.2 Criação de um atributo do tipo Set.
    private Set<String> tags;

    private String numero;


    public Pedido(String descricao, LocalDateTime data, boolean web, List<OrderItem> orderItems, Solicitante solicitante,GeradorNotaFiscalService gerador, String numero){
        this.descricao = descricao;
        this.data = data;
        this.web = web;
        this.orderItems = orderItems;
        this.solicitante = solicitante;
        this.numero = numero;

        // Estabeleça a relação bidirecional entre Pedido e OrderItem
        for (OrderItem item : orderItems) {
            item.setPedido(this);
        }

        gerador.gerarNotaFiscal(this);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public boolean isWeb() {
        return web;
    }

    public void setWeb(boolean web) {
        this.web = web;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Solicitante getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Solicitante solicitante) {
        this.solicitante = solicitante;
    }

    public String[] getCumpons() {
        return cumpons;
    }

    public void setCumpons(String[] cumpons) {
        this.cumpons = cumpons;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float calcularTotal() {
        float total = 0;
        for (OrderItem item : orderItems) {
            total += item.calcularValorTotal();
        }
        return total;
    }

    //1.3 Todas as classes de domínio precisam ter o toString
    //implementado.
    @Override
    public String toString() {
        return "Pedido{" +
                "descricao='" + descricao + '\'' +
                ", data=" + data +
                ", web=" + web +
                ", orderItems=" + orderItems +
                ", solicitante=" + solicitante +
                '}';
    }
}

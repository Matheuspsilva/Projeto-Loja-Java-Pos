package com.example.demo.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    String descricao;
    LocalDateTime data;
    boolean web;
    List<Produto> produtos;
    Solicitante solicitante;

    public Pedido(String descricao, LocalDateTime data, boolean web, List<Produto> produtos, Solicitante solicitante) {
        this.descricao = descricao;
        this.data = data;
        this.web = web;
        this.produtos = produtos;
        this.solicitante = solicitante;
    }

    public String toString() {
        return "Pedido{" + "descricao=" + descricao + ", data=" + data + ", web=" + web + ", produtos=" + produtos + ", solicitante=" + solicitante + '}';
    }
}

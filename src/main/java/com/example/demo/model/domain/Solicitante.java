package com.example.demo.model.domain;

public class Solicitante {

    String nome;
    String cpf;
    String email;

    public Solicitante(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String toString() {
        return "Solicitante{" + "nome=" + nome + ", cpf=" + cpf + ", email=" + email + '}';
    }
}

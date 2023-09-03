package com.example.demo.model.domain;

public class Solicitante {

    //1.1 Todas as classes precisam ter pelo menos três atributos e todos
    //os tipos de dados precisam ser utilizados em pelo menos uma
    //ocorrência.

    String nome;
    String cpf;
    String email;

    //1.4 A classe de associação (“Solicitante”) precisa ter um construtor
    //que receba todos os atributos como parâmetro.
    public Solicitante(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //1.3 Todas as classes de domínio precisam ter o toString
    //implementado.
    public String toString() {
        return "Solicitante{" + "nome=" + nome + ", cpf=" + cpf + ", email=" + email + '}';
    }
}

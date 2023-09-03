package com.example.demo.domain.service;

import com.example.demo.domain.exception.GeradorNotaFiscalException;
import com.example.demo.domain.model.Pedido;

import java.io.*;

public class GeradorNotaFiscalService {

    private String nomeEmpresa;
    private String enderecoEmpresa;



    public GeradorNotaFiscalService() {
        try {
            carregarConfiguracoes("configuracoes_nf.txt");
        } catch (IOException e) {
            //4.2 Cada classe de negócio deve usar uma classe de exception.
            throw new GeradorNotaFiscalException("Erro ao carregar configurações", e);
        }
    }

    // 4.2 Fazer a leitura de um arquivo texto com o layout definido pelo
    //aluno.
    private void carregarConfiguracoes(String arquivoConfig) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoConfig))) {
            nomeEmpresa = br.readLine();
            enderecoEmpresa = br.readLine();
            // Carregar outras configurações...
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //4.4 Um arquivo texto deve ser gerado com um layout diferente da
    //entrada.
    public void gerarNotaFiscal(Pedido pedido) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pedido.getNumero() + ".txt"))) {

            // Escrever os dados fixos da nota fiscal
            writer.write("Nome da Empresa: " + nomeEmpresa);
            writer.newLine();
            writer.write("Endereço da Empresa: " + enderecoEmpresa);
            writer.newLine();
            // Escrever outros dados fixos...

            // Escrever dados específicos do pedido
            writer.write("Número do Pedido: " + pedido.getNumero());
            writer.newLine();
            writer.write("Data do Pedido: " + pedido.getData());
            writer.newLine();
            // Escrever outros detalhes do pedido...

            // Calcular e escrever o valor total do pedido
            double total = pedido.calcularTotal();
            writer.write("Total do Pedido: " + total);

            // Fechar o arquivo
            writer.close();
        } catch (IOException e) {
            //4.2 Cada classe de negócio deve usar uma classe de exception.
            throw new GeradorNotaFiscalException("Erro ao gerar nota fiscal", e);

        }

    }

}
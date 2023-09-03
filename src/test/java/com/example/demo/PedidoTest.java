package com.example.demo;

import com.example.demo.model.domain.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PedidoTest {

	//1.2 As classes de teste precisam ter pelo menos três instâncias dos
	//objetos.
	@Test
	void criarPedidoComSucesso() {

		Produto coca = new Bebida("Coca-Cola", 5.0f, 1, true, 1.0f, "Coca-Cola", 500.0f);
		Produto fanta = new Bebida("Fanta", 5.0f, 2, true, 1.0f, "Coca-Cola", 500.0f);
		Produto pepsi = new Bebida("Pepsi", 5.0f, 3, true, 1.0f, "Pepsi", 500.0f);

		Produto pizza = new Comida("Pizza", 20.0f, 4, 1.0f, false, "Queijo, tomate, molho de tomate", 200.0f);
		Produto hamburguer = new Comida("Hamburguer", 20.0f, 5, 1.0f, false, "Pão, carne, queijo, tomate, molho de tomate", 100.0f);
		Produto cachorroQuente = new Comida("Cachorro Quente", 20.0f, 6, 1.0f, false, "Pão, salsicha, queijo, tomate, molho de tomate", 150.0f);

		Produto sorvete = new Sobremesa("Sorvete", 10.0f, 7,  true, "Sorvete de chocolate", 300.0f);
		Produto pudim = new Sobremesa("Pudim", 10.0f, 8,  true, "Pudim de leite", 75.0f);
		Produto bolo = new Sobremesa("Bolo", 10.0f, 9,  true, "Bolo de chocolate", 150.0f);

		//Criação de Solicitantes
		Solicitante solicitante1 = new Solicitante("João", "123456789", "joao@email.com");
		Solicitante solicitante2 = new Solicitante("Maria", "987654321", "maria@email.com");
		Solicitante solicitante3 = new Solicitante("José", "123456789", "jose@email.com");

		//Criação de OrderItems
		OrderItem orderItem1 = new OrderItem(coca, 5);
		OrderItem orderItem2 = new OrderItem(pizza, 2);
		OrderItem orderItem3 = new OrderItem(sorvete, 1);

		OrderItem orderItem4 = new OrderItem(fanta, 5);
		OrderItem orderItem5 = new OrderItem(hamburguer, 2);
		OrderItem orderItem6 = new OrderItem(pudim, 1);

		OrderItem orderItem7 = new OrderItem(pepsi, 5);
		OrderItem orderItem8 = new OrderItem(cachorroQuente, 2);
		OrderItem orderItem9 = new OrderItem(bolo, 1);

		//Criação de Pedidos
		Pedido pedido1 = new Pedido("Pedido 1", LocalDateTime.now(), true, List.of(orderItem1, orderItem2, orderItem3), solicitante1);
		Pedido pedido2 = new Pedido("Pedido 2", LocalDateTime.now(), true, List.of(orderItem4, orderItem5, orderItem6), solicitante2);
		Pedido pedido3 = new Pedido("Pedido 3", LocalDateTime.now(), true, List.of(orderItem7, orderItem8, orderItem9), solicitante3);

		String[] cumpons = {"CUPOM1", "CUPOM2", "CUPOM3"};
		pedido1.setCumpons(cumpons);
		pedido1.setTags(Set.of("Enviado", "Entrega Express"));

		assertEquals("Pedido 1", pedido1.getDescricao());
		assertEquals(true, pedido1.isWeb());
		assertEquals(List.of(orderItem1, orderItem2, orderItem3), pedido1.getOrderItems());
		assertEquals(solicitante1, pedido1.getSolicitante());
		assertEquals(cumpons, pedido1.getCumpons());
		assertEquals(Set.of("Enviado", "Entrega Express"), pedido1.getTags());

		assertEquals("Pedido 2", pedido2.getDescricao());
		assertEquals(true, pedido2.isWeb());
		assertEquals(List.of(orderItem4, orderItem5, orderItem6), pedido2.getOrderItems());
		assertEquals(solicitante2, pedido2.getSolicitante());

		assertEquals("Pedido 3", pedido3.getDescricao());
		assertEquals(true, pedido3.isWeb());
		assertEquals(List.of(orderItem7, orderItem8, orderItem9), pedido3.getOrderItems());
		assertEquals(solicitante3, pedido3.getSolicitante());

	}

}

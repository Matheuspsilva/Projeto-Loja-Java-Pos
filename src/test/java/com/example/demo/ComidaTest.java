package com.example.demo;

import com.example.demo.model.domain.Bebida;
import com.example.demo.model.domain.Comida;
import com.example.demo.model.domain.Produto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ComidaTest {

	//1.2 As classes de teste precisam ter pelo menos três instâncias dos
	//objetos.
	@Test
	void criarComidasComSucesso() {

		Produto pizza = new Comida("Pizza", 20.0f, 4, 1.0f, false, "Queijo, tomate, molho de tomate", 200.0f);
		Produto hamburguer = new Comida("Hamburguer", 20.0f, 5, 1.0f, false, "Pão, carne, queijo, tomate, molho de tomate", 100.0f);
		Produto cachorroQuente = new Comida("Cachorro Quente", 20.0f, 6, 1.0f, false, "Pão, salsicha, queijo, tomate, molho de tomate", 150.0f);

		assertEquals("Pizza", pizza.getNome());
		assertEquals(20.0f, pizza.getValor());
		assertEquals(4, pizza.getCodigo());

		assertEquals("Hamburguer", hamburguer.getNome());
		assertEquals(20.0f, hamburguer.getValor());
		assertEquals(5, hamburguer.getCodigo());

		assertEquals("Cachorro Quente", cachorroQuente.getNome());
		assertEquals(20.0f, cachorroQuente.getValor());
		assertEquals(6, cachorroQuente.getCodigo());

	}

}

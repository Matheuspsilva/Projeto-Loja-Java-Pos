package com.example.demo;

import com.example.demo.model.domain.Bebida;
import com.example.demo.model.domain.Produto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BebidaTest {

	//1.2 As classes de teste precisam ter pelo menos três instâncias dos
	//objetos.
	@Test
	void criarBebidasComSucesso() {

		Produto coca = new Bebida("Coca-Cola", 5.0f, 1, true, 1.0f, "Coca-Cola", 500.0f);
		Produto fanta = new Bebida("Fanta", 5.0f, 2, true, 1.0f, "Coca-Cola", 500.0f);
		Produto pepsi = new Bebida("Pepsi", 5.0f, 3, true, 1.0f, "Pepsi", 500.0f);

		assertEquals("Coca-Cola", coca.getNome());
		assertEquals(5.0f, coca.getValor());
		assertEquals(1, coca.getCodigo());

		assertEquals("Fanta", fanta.getNome());
		assertEquals(5.0f, fanta.getValor());
		assertEquals(2, fanta.getCodigo());

		assertEquals("Pepsi", pepsi.getNome());
		assertEquals(5.0f, pepsi.getValor());
		assertEquals(3, pepsi.getCodigo());

	}

}

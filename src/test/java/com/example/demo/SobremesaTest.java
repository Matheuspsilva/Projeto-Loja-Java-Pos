package com.example.demo;

import com.example.demo.model.domain.Comida;
import com.example.demo.model.domain.Produto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SobremesaTest {

	//1.2 As classes de teste precisam ter pelo menos três instâncias dos
	//objetos.
	@Test
	void criarSobremesasComSucesso() {

		Produto pudim = new Comida("Pudim", 10.0f, 7, 1.0f, false, "Leite condensado, leite, ovos", 100.0f);
		Produto bolo = new Comida("Bolo", 10.0f, 8, 1.0f, false, "Farinha, leite condensado, leite, ovos", 100.0f);
		Produto sorvete = new Comida("Sorvete", 10.0f, 9, 1.0f, false, "Leite condensado, leite, ovos", 100.0f);

		assertEquals("Pudim", pudim.getNome());
		assertEquals(10.0f, pudim.getValor());
		assertEquals(7, pudim.getCodigo());

		assertEquals("Bolo", bolo.getNome());
		assertEquals(10.0f, bolo.getValor());
		assertEquals(8, bolo.getCodigo());

		assertEquals("Sorvete", sorvete.getNome());
		assertEquals(10.0f, sorvete.getValor());
		assertEquals(9, sorvete.getCodigo());

	}

}

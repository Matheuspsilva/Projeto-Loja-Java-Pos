package com.example.demo;

import com.example.demo.model.domain.Comida;
import com.example.demo.model.domain.Produto;
import com.example.demo.model.domain.Solicitante;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SolicitanteTest {

	//1.2 As classes de teste precisam ter pelo menos três instâncias dos
	//objetos.
	@Test
	void criarSolicitanteComSucesso() {

		Solicitante solicitante1 = new Solicitante("João", "123456789", "joao@email.com");
		Solicitante solicitante2 = new Solicitante("Maria", "987654321", "maria@email.com");
		Solicitante solicitante3 = new Solicitante("José", "123456789", "jose@email.com");

		assertEquals("João", solicitante1.getNome());
		assertEquals("123456789", solicitante1.getCpf());
		assertEquals("joao@email.com", solicitante1.getEmail());

		assertEquals("Maria", solicitante2.getNome());
		assertEquals("987654321", solicitante2.getCpf());
		assertEquals("maria@email.com", solicitante2.getEmail());

		assertEquals("José", solicitante3.getNome());
		assertEquals("123456789", solicitante3.getCpf());
		assertEquals("jose@email.com", solicitante3.getEmail());

	}

}

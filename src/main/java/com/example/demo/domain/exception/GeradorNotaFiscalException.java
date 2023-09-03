package com.example.demo.domain.exception;

public class GeradorNotaFiscalException extends RuntimeException{
    // 4.1 Criação de classes de exceptions para tratar regras de negócio.

    public GeradorNotaFiscalException(String message) {
        super(message);
    }

    public GeradorNotaFiscalException(String message, Throwable cause) {
        super(message, cause);
    }
}

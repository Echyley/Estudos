package com.example.erudio.exceptions.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.erudio.exceptions.ExceptionResponse;
import com.example.erudio.exceptions.ResourceNotFoundException;

// Esta classe é um controlador de exceções global
@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    // Este método trata exceções do tipo Exception
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ExceptionResponse> handleAllExceptions(Exception ex, WebRequest request) {
        // Cria uma resposta personalizada com a data atual, mensagem da exceção e descrição da solicitação
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),
                request.getDescription(false));
        // Retorna a resposta personalizada com um status HTTP 500 (INTERNAL_SERVER_ERROR)
        return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    // Este método trata exceções do tipo ResourceNotFoundException
    @ExceptionHandler(ResourceNotFoundException.class)
    public final ResponseEntity<ExceptionResponse> handleNotFoundExceptions(Exception ex, WebRequest request) {
        // Cria uma resposta personalizada com a data atual, mensagem da exceção e descrição da solicitação
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),
                request.getDescription(false));
        // Retorna a resposta personalizada com um status HTTP 404 (NOT_FOUND)
        return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
    }
}

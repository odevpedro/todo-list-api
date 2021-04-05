package com.itau.todolistapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size (min = 4)
    @NotBlank
    @NotEmpty
    @NotNull
    private String titulo;

    @Size(min = 10)
    @NotBlank
    @NotNull
    @NotEmpty
    private String mensagem;

    private Status status = Status.PENDING;
    //quando o objeto é instanciado o primeiro status é de pendente

    public Todo(Long id, String titulo, String mensagem, Status status) {
        this.titulo = titulo;
        this.mensagem = mensagem;
        this.status = status.PENDING;

    }

    public Todo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
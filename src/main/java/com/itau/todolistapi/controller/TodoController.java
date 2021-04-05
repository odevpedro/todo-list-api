package com.itau.todolistapi.controller;

import com.itau.todolistapi.model.Todo;
import com.itau.todolistapi.respository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    //Listar todas as tarefas ou uma tarefa especifica pelo nome da url
    @GetMapping
    public List<Todo> findAll(String nomeTitulo){
        if(nomeTitulo == null){
            return todoRepository.findAll();
        } else {
            return todoRepository.findByTitulo(nomeTitulo);
        }

    }

    //Criar uma nova tarefa
    @PostMapping
    public Todo save( @NotNull @RequestBody @Valid Todo todo){
        return todoRepository.save(todo);
    }

    //Modificar uma tarefa
    @PutMapping
    public Todo update( @NotNull @RequestBody @Valid Todo todo){
        return todoRepository.save(todo);
    }

    //Deletar uma tarefa
    @DeleteMapping( value = "/{id}")
    public void delete(@PathVariable Long id){
        todoRepository.deleteById(id);
    }
}

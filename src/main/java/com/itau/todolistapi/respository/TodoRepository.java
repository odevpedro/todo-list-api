package com.itau.todolistapi.respository;

import com.itau.todolistapi.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findByTitulo(String nomeTitulo);
}

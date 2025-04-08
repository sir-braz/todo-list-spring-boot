package com.exemplo.todo.service;

import com.exemplo.todo.entity.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoService {

    List<Todo> listarTodos();

    Todo criarTodo(Todo todo);

    Optional<Todo> buscarPorId(Long id);

    Todo atualizarTodo(Long id, Todo todo);

    void deletarTodo(Long id);
}

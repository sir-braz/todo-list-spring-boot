package com.exemplo.todo.service;

import com.exemplo.todo.entity.Todo;

import java.util.List;
import java.util.Optional;

public class TodoServiceImpl implements TodoService{
    @Override
    public List<Todo> listarTodos() {
        return List.of();
    }

    @Override
    public Todo criarTodo(Todo todo) {
        return null;
    }

    @Override
    public Optional<Todo> buscarPorId(Long id) {
        return Optional.empty();
    }

    @Override
    public Todo atualizarTodo(Long id, Todo todo) {
        return null;
    }

    @Override
    public void deletarTodo(Long id) {

    }
}

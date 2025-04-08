package com.exemplo.todo.service;

import com.exemplo.todo.entity.Todo;
import com.exemplo.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TodoServiceImpl implements TodoService{


    private final TodoRepository todoRepository;

    @Autowired
    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<Todo> listarTodos() {
        return todoRepository.findAll();
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

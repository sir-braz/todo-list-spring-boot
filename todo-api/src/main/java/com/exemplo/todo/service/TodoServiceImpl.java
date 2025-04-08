package com.exemplo.todo.service;

import com.exemplo.todo.entity.Todo;
import com.exemplo.todo.repository.TodoRepository;
import com.exemplo.todo.utility.BackendException;
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
        return todoRepository.save(todo);
    }

    @Override
    public Optional<Todo> buscarPorId(Long id) {
        return todoRepository.findById(id);
    }

    @Override
    public Todo atualizarTodo(Long id, Todo todoAtualizado) {
        Todo existente = todoRepository.findById(id)
                .orElseThrow(() -> new BackendException("Tarefa não encontrada: " + id));

        existente.setTitle(todoAtualizado.getTitle());
        existente.setDescription(todoAtualizado.getDescription());
        existente.setCompleted(todoAtualizado.isCompleted());

        return todoRepository.save(existente);
    }

    @Override
    public void deletarTodo(Long id) {
        if (!todoRepository.existsById(id)) {
            throw new BackendException("Tarefa não encontrada: " + id);
        }
        todoRepository.deleteById(id);
    }
}

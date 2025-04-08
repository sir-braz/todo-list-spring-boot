package com.exemplo.todo.service;

import com.exemplo.todo.entity.Todo;
import com.exemplo.todo.repository.TodoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class TodoServiceImplTest {

    private TodoRepository todoRepository;
    private TodoServiceImpl todoService;

    @BeforeEach
    void setup() {
        todoRepository = mock(TodoRepository.class);
        todoService = new TodoServiceImpl(todoRepository);
    }

    @Test
    void deveListarTodosOsTodos() {
        // Arrange
        Todo tarefa1 = new Todo();
        tarefa1.setTitle("Estudar Java");

        Todo tarefa2 = new Todo();
        tarefa2.setTitle("Fazer projeto");

        when(todoRepository.findAll()).thenReturn(List.of(tarefa1, tarefa2));

        // Act
        List<Todo> todos = todoService.listarTodos();

        // Assert
        assertEquals(2, todos.size());
        assertEquals("Estudar Java", todos.get(0).getTitle());
    }

    @Test
    void deveCriarNovoTodo() {
        // Arrange
        Todo novoTodo = new Todo();
        novoTodo.setTitle("Testar aplicação");

        when(todoRepository.save(novoTodo)).thenReturn(novoTodo);

        // Act
        Todo salvo = todoService.criarTodo(novoTodo);

        // Assert
        assertNotNull(salvo);
        assertEquals("Testar aplicação", salvo.getTitle());
    }
}

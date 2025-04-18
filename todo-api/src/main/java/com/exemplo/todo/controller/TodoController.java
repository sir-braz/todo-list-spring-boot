package com.exemplo.todo.controller;


import com.exemplo.todo.entity.Todo;
import com.exemplo.todo.service.TodoService;
import com.exemplo.todo.utility.BackendException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TodoController {
    private final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public ResponseEntity<List<Todo>> listarTodos(){
        return ResponseEntity.ok(todoService.listarTodos());
    }

    @PostMapping
    public ResponseEntity<Todo> criarTodo(@RequestBody Todo todo){
        return ResponseEntity.ok(todoService.criarTodo(todo));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Todo> atualizarDescricao(@PathVariable Long id, @RequestBody Todo todo){
        return ResponseEntity.ok(todoService.atualizarTodo(id, todo));
    }

    @PutMapping("/{id}/concluir")
    public ResponseEntity<Todo> concluirTarefa(@PathVariable Long id) {
        Todo tarefa = todoService.buscarPorId(id)
                .orElseThrow(() -> new BackendException("Tarefa não encontrada"));
        tarefa.setCompleted(true);
        return ResponseEntity.ok(todoService.atualizarTodo(id, tarefa));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        todoService.deletarTodo(id);
        return ResponseEntity.noContent().build();
    }

}

package com.todo.demo.controller;

import com.todo.demo.entity.Todo;
import com.todo.demo.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        return todoService.createTodo(todo);
    }

    @GetMapping
    public List<Todo> getTodos() {
        return todoService.getAllTodos();
    }
    @GetMapping("/{id}")
public Todo getTodoById(@PathVariable Long id) {
    return todoService.getTodoById(id);
}

}

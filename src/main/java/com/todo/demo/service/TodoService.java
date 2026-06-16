package com.todo.demo.service;

import com.todo.demo.entity.Todo;
import com.todo.demo.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }
    public Todo getTodoById(Long id) {
    return todoRepository.findById(id).orElse(null);
}
}

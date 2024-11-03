package de.rinderle.dhbw.wwi23b3;

import de.rinderle.todo.api.TodosApi;
import de.rinderle.todo.model.Todo;
import de.rinderle.todo.model.TodoInput;
import de.rinderle.todo.model.TodosIdDelete200Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class TodosApiImpl implements TodosApi {

    private final TodosStorageService todosStorageService;

    public TodosApiImpl(TodosStorageService todosStorageService) {
        this.todosStorageService = todosStorageService;
    }

    @Override
    public ResponseEntity<List<Todo>> todosGet() {
        List<Todo> todos = new ArrayList<>(todosStorageService.todosGetAll());
        return ResponseEntity.ok(todos);
    }

    @Override
    public ResponseEntity<Todo> todosIdGet(Integer id) {
        Todo todo = todosStorageService.todosIdGet(id);
        if (todo == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(todo);
    }

    @Override
    public ResponseEntity<Todo> todosPost(TodoInput todoInput) {
        Todo todo = new Todo();
        todo.setTask(todoInput.getTask());
        todo.setCompleted(todoInput.getCompleted());
        todosStorageService.todosCreate(todo);
        return ResponseEntity.status(201).body(todo);
    }

    @Override
    public ResponseEntity<Todo> todosIdPut(Integer id, TodoInput todoInput) {
        Todo existingTodo = todosStorageService.todosIdGet(id);
        if (existingTodo == null) {
            return ResponseEntity.notFound().build();
        }
        existingTodo.setTask(todoInput.getTask());
        existingTodo.setCompleted(todoInput.getCompleted());
        todosStorageService.todosUpdate(existingTodo);
        return ResponseEntity.ok(existingTodo);
    }

    @Override
    public ResponseEntity<TodosIdDelete200Response> todosIdDelete(Integer id) {
        Todo removedTodo = todosStorageService.todosDelete(id);
        if (removedTodo == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(new TodosIdDelete200Response());
    }
}

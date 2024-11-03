package de.rinderle.dhbw.wwi23b3;

import de.rinderle.todo.model.Todo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class TodosStorageService {

    private int currentId = 1;
    private final HashMap<Integer, Todo> todoStorage = new HashMap<>();

    public List<Todo> todosGetAll() {
        return new ArrayList<>(todoStorage.values());
    }

    public Todo todosIdGet(Integer id) {
        return todoStorage.get(id);
    }

    public void todosCreate(Todo todo) {
        int newId = currentId++;
        todo.setId(newId);
        todoStorage.put(newId, todo);
    }

    public void todosUpdate(Todo todo) {
        todoStorage.put(todo.getId(), todo);
    }

    public Todo todosDelete(Integer id) {
        return todoStorage.remove(id);
    }
}

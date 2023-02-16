package com.harbourspace.docker;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TodosApiController  {

    List<TodoItem> TodoList;
    public TodosApiController() {
        TodoList = new ArrayList<>();
    }

    @PostMapping("/api/todos")
    public ResponseEntity<TodoItem> addTodo(@RequestBody  TodoItemDto body) {
        var maxId = TodoList.stream().map(item -> item.getId()).max((a, b) -> a > b ? a : b).orElse(0);

        var item = new TodoItem(maxId + 1, body.Title, body.Description, body.IsDone, body.CreatedAt, body.UpdatedAt);
        TodoList.add(item);
        return new ResponseEntity<TodoItem>(item, HttpStatus.CREATED);
    }

    @GetMapping("/api/todos")
    public ResponseEntity<List<TodoItem>> getTodos() {
        return new ResponseEntity<List<TodoItem>>(TodoList, HttpStatus.OK);
    }

}

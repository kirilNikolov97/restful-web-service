package com.kirilnikolov97.restfulwebservice.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TodoResourceController {

    @Autowired
    private TodoResourceService todoResourceService;

    @GetMapping("/users/{username}/todos")
    public List<Todo> getAllTodos(@PathVariable String username) {
        return todoResourceService.findAll();
    }

    @DeleteMapping("/users/{username}/todos/{id}")
    public Todo deleteTodo(@PathVariable String username, @PathVariable long id) {
        return todoResourceService.deleteTodo(id);
    }

}

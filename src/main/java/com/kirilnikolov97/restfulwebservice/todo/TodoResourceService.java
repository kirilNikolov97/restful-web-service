package com.kirilnikolov97.restfulwebservice.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoResourceService {

    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(1, "Pesho", new Date(), false));
        todos.add(new Todo(2, "Gosho", new Date(), true));
        todos.add(new Todo(3, "Stamat", new Date(), false));
    }


    public List<Todo> findAll() {
        return todos;
    }

    public Todo deleteTodo(long id) {
        Todo todo = findById(id);

        if(todo != null) {
            todos.remove(todo);
            return todo;
        } else {
            return null;
        }
    }

    public Todo findById(long id) {
        for(Todo todo : todos) {
            if(todo.getId() == id) {
                return todo;
            }
        }
        return null;
    }


}

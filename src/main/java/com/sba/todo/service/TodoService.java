package com.sba.todo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sba.todo.vo.Todo;

@Service
public class TodoService {

    private final List<Todo> todoList;

    public TodoService(List<Todo> todoList) {
        this.todoList = todoList;
    }

    public void addTodo(Todo todo) {
        todo.setId(todoList.size());
        todoList.add(todo);
    }

    public List<Todo> getTodoList(){
        return todoList;
    }

    public void deleteTodo(int index) {
        todoList.remove(index);
    }
}

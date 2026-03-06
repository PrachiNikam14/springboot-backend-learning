package com.example.todo_api.controller;

import com.example.todo_api.entity.Task;
import com.example.todo_api.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Tasks")
public class TaskController {

    private final TaskService taskService;


    //Constructor injection
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public Task createTask(@RequestBody Task task){
        return taskService.createTask(task);
    }

    @GetMapping
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id){
        return taskService.getTaskByid(id);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task){
        return taskService.updateTask(task, id);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }

    @GetMapping("/completed")
    public List<Task> getCompletedTasks(){
        return taskService.getCompletedTasks();
    }

    @GetMapping("/pending")
    public List<Task> getPendingTasks(){
        return taskService.getPendingTasks();
    }
}

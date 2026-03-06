package com.example.todo_api.service;


import com.example.todo_api.entity.Task;
import com.example.todo_api.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;

    }

    public Task createTask(Task task){
        return taskRepository.save(task);
    }

    public Task updateTask(Task task , Long id){
        task.setId(id);
        return taskRepository.save(task);
    }

    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public Task getTaskByid(Long id){
        return taskRepository.findById(id).orElse(null);
    }

}

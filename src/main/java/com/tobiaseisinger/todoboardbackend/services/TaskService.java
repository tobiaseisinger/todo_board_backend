package com.tobiaseisinger.todoboardbackend.services;

import com.tobiaseisinger.todoboardbackend.model.Project;
import com.tobiaseisinger.todoboardbackend.model.Task;
import com.tobiaseisinger.todoboardbackend.repos.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getTasks(Project project) {
        return taskRepository.findAll();
    }

    public List<Task> getTasksByProject(Project project) {
        return taskRepository.getTasksByProject(project);
    }

    public Task getTaskById(long id) {
        return taskRepository.getOne(id);
    }

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }
}

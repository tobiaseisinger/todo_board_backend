package com.tobiaseisinger.todoboardbackend.services;

import com.tobiaseisinger.todoboardbackend.model.Project;
import com.tobiaseisinger.todoboardbackend.model.Task;
import com.tobiaseisinger.todoboardbackend.repos.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    private ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> findAll() {
        return projectRepository.findAll();
    }

    public Project findById(Long id) {
        return projectRepository.findById(id).get();
    }

    public Project save(Project project) {
        return projectRepository.save(project);
    }

    public List<Task> getTasks(Project project) {
        return project.getTasks();
    }
}

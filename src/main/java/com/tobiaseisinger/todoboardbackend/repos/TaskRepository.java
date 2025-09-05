package com.tobiaseisinger.todoboardbackend.repos;

import com.tobiaseisinger.todoboardbackend.model.Project;
import com.tobiaseisinger.todoboardbackend.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> getTasksByProject(Project project);
}

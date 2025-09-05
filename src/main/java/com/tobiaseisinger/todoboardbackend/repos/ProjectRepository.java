package com.tobiaseisinger.todoboardbackend.repos;

import com.tobiaseisinger.todoboardbackend.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}

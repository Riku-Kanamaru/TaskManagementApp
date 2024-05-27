package com.example.taskmanagement.repository;

import com.example.taskmanagement.entity.TaskEntity;
import com.example.taskmanagement.entity.UserEntity;
import com.example.taskmanagement.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
    List<TaskEntity> findByUser(UserEntity user);
    List<TaskEntity> findByStatus(Status status);
}

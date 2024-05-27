package com.example.taskmanagement.service;

import com.example.taskmanagement.entity.TaskEntity;
import com.example.taskmanagement.entity.UserEntity;
import com.example.taskmanagement.entity.Status;
import com.example.taskmanagement.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    // コンストラクタ
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<TaskEntity> findByUser(UserEntity user) {
        return taskRepository.findByUser(user);
    }

    public List<TaskEntity> findByStatus(Status status) {
        return taskRepository.findByStatus(status);
    }

    public TaskEntity save(TaskEntity task) {
        return taskRepository.save(task);
    }

    // その他のメソッドを必要に応じて追加
}

package com.example.telegrambot.service;

import com.example.telegrambot.entity.NotificationTask;
import com.example.telegrambot.repository.NotificationTaskRepository;
import org.springframework.stereotype.Service;

@Service
public class NotificationTaskService {

    private final NotificationTaskRepository notificationTaskRepository;

    public NotificationTaskService(NotificationTaskRepository notificationTaskRepository) {
        this.notificationTaskRepository = notificationTaskRepository;
    }

    public void save(NotificationTask notificationTask) {
        notificationTaskRepository.save(notificationTask);
    }
}

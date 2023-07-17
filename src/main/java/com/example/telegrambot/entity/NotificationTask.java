package com.example.telegrambot.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "notification_tasks")
public class NotificationTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String message;
    @Column(nullable = false, name = "chat_id")
    private long chat_id;
    @Column(nullable = false, name = "notification_date_time")
    private LocalDateTime notificationDateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getChat_id() {
        return chat_id;
    }

    public void setChat_id(long chat_id) {
        this.chat_id = chat_id;
    }

    public LocalDateTime getNotificationDateTime() {
        return notificationDateTime;
    }

    public void setNotificationDateTime(LocalDateTime notificationDateTime) {
        this.notificationDateTime = notificationDateTime;
    }
}

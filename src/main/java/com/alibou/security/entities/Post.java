package com.alibou.security.entities;

import com.alibou.security.user.User;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String content;

    @Column
    private String imageOrVideoUrl;

    @Column(nullable = false)
    private LocalDateTime creationDate;

    @Column(nullable = false)
    private int likeCount = 0;

    @PrePersist
    public void setCreatedAt() {
        this.creationDate = LocalDateTime.now();
    }



}

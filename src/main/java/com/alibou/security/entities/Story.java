package com.alibou.security.entities;

import com.alibou.security.user.User;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Story {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String imageUrl;
    private Long timestamp;

}

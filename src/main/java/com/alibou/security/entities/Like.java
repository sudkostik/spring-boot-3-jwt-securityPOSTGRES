package com.alibou.security.entities;

import com.alibou.security.user.User;
import jakarta.persistence.*;
import lombok.Data;



@Entity
@Data
@Table(name="p_like")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;
}
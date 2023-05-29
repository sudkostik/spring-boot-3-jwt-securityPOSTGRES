package com.alibou.security.repos;

import com.alibou.security.entities.Post;
import com.alibou.security.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByUser(User user);
    List<Post> findAllByOrderByCreationDateDesc();
}
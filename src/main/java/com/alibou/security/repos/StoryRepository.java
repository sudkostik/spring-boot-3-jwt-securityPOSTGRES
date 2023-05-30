package com.alibou.security.repos;

import com.alibou.security.entities.Story;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StoryRepository extends JpaRepository<Story, Long> {
    List<Story> findAllByUserId(Long userId);
}

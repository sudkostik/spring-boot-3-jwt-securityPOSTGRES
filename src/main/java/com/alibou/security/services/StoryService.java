package com.alibou.security.services;

import com.alibou.security.entities.Story;
import com.alibou.security.repos.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoryService {

    private final StoryRepository storyRepository;

    @Autowired
    public StoryService(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    public Story addStory(Story story) {
        return storyRepository.save(story);
    }



    public List<Story> getStoriesByUserId(Long userId) {
        return storyRepository.findAllByUserId(userId);
    }
}

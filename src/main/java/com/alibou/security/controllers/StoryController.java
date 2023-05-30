package com.alibou.security.controllers;

import com.alibou.security.entities.Story;
import com.alibou.security.services.StoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/stories")
public class StoryController {

    private final StoryService storyService;

    public StoryController(StoryService storyService) {
        this.storyService = storyService;
    }

    @PostMapping
    public Story uploadStory(@RequestBody Story story) {
        return storyService.addStory(story);
    }

    @GetMapping("/{userId}")
    public List<Story> getStories(@PathVariable Long userId) {
        return storyService.getStoriesByUserId(userId);
    }
}

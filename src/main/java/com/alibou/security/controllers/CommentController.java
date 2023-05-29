package com.alibou.security.controllers;

import com.alibou.security.entities.Comment;
import com.alibou.security.entities.Post;
import com.alibou.security.services.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping
    public Comment addComment(@RequestBody Comment comment) {
        return commentService.addComment(comment);
    }

    @GetMapping("/{postId}")
    public List<Comment> getCommentsForPost(@PathVariable Long postId) {
        Post post = new Post();
        post.setId(postId);
        return commentService.getCommentsForPost(post);
    }
}

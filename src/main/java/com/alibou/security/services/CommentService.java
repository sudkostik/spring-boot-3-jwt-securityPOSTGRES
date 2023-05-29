package com.alibou.security.services;

import com.alibou.security.entities.Comment;
import com.alibou.security.entities.Post;
import com.alibou.security.repos.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public List<Comment> getCommentsForPost(Post post) {
        return commentRepository.findByPost(post);
    }
}

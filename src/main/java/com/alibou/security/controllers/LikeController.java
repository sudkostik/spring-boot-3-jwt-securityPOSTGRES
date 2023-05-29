package com.alibou.security.controllers;

import com.alibou.security.entities.Like;
import com.alibou.security.entities.Post;
import com.alibou.security.services.LikeService;
import com.alibou.security.services.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/likes")
public class LikeController {
    private final LikeService likeService;
    private final PostService postService;

    public LikeController(LikeService likeService, PostService postService) {
        this.likeService = likeService;
        this.postService = postService;
    }

    @PostMapping("/{postId}")
    public ResponseEntity<Like> likePost(@PathVariable Long postId) {
        Post post = postService.getPostById(postId);

        Like like = new Like();
        like.setPost(post);

        likeService.saveLike(like);

        post.setLikeCount(post.getLikeCount() + 1);
        postService.savePost(post);

        return ResponseEntity.ok(like);
    }
}

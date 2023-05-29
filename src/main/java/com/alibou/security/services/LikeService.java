package com.alibou.security.services;

import com.alibou.security.entities.Like;
import com.alibou.security.repos.LikeRepository;
import org.springframework.stereotype.Service;

@Service
public class LikeService {
    private final LikeRepository likeRepository;

    public LikeService(LikeRepository likeRepository) {
        this.likeRepository = likeRepository;
    }

    public Like saveLike(Like like) {
        return likeRepository.save(like);
    }
}


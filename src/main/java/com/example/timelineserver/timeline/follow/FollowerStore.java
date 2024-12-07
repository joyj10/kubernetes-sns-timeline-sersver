package com.example.timelineserver.timeline.follow;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class FollowerStore {

    private final StringRedisTemplate redis;

    public void followUser(FollowMessage followMessage) {
        if (followMessage.isFollow()) {
            redis.opsForSet().add("user:follower:" + followMessage.getFollowerId(), followMessage.getUserId());
        } else {
            redis.opsForSet().remove("user:follower:" + followMessage.getFollowerId(), followMessage.getUserId());
        }
    }

    public Set<String> listFollower(String userId) {
        return redis.opsForSet().members("user:follower:" + userId);
    }

}

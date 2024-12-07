package com.example.timelineserver.timeline.follow;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FollowMessage {
    private String userId;
    private String followerId;
    private boolean follow;
}

package com.example.timelineserver.timeline;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class LikeResponse {
    long likeCount;
    boolean like;
}

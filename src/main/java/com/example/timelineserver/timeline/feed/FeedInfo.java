package com.example.timelineserver.timeline.feed;

import lombok.Getter;

import java.time.ZonedDateTime;

@Getter
public class FeedInfo {
    private int feedId;
    private String imageId;
    private int uploaderId;
    private String uploaderName;

    private ZonedDateTime uploadDatetime;
    private String contents;
}
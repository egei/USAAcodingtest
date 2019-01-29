package com.geil.eric.usaacodingtest.model;

public class SecureMedia
{
    private RedditVideo reddit_video;

    public SecureMedia(RedditVideo reddit_video) {
        this.reddit_video = reddit_video;
    }

    public RedditVideo getReddit_video() {
        return reddit_video;
    }

    public void setReddit_video(RedditVideo reddit_video) {
        this.reddit_video = reddit_video;
    }
}


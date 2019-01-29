package com.geil.eric.usaacodingtest.model;

public class RedditVideo {

    private String fallback_url;
    private int height;
    private int width;
    private String scrubber_media_url;
    private String dash_url;
    private int duration;
    private String hls_url;
    private boolean is_gif;
    private String transcoding_status;

    public RedditVideo(String fallback_url, int height, int width, String scrubber_media_url, String dash_url, int duration, String hls_url, boolean is_gif, String transcoding_status) {
        this.fallback_url = fallback_url;
        this.height = height;
        this.width = width;
        this.scrubber_media_url = scrubber_media_url;
        this.dash_url = dash_url;
        this.duration = duration;
        this.hls_url = hls_url;
        this.is_gif = is_gif;
        this.transcoding_status = transcoding_status;
    }

    public String getFallback_url() {
        return fallback_url;
    }

    public void setFallback_url(String fallback_url) {
        this.fallback_url = fallback_url;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getScrubber_media_url() {
        return scrubber_media_url;
    }

    public void setScrubber_media_url(String scrubber_media_url) {
        this.scrubber_media_url = scrubber_media_url;
    }

    public String getDash_url() {
        return dash_url;
    }

    public void setDash_url(String dash_url) {
        this.dash_url = dash_url;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getHls_url() {
        return hls_url;
    }

    public void setHls_url(String hls_url) {
        this.hls_url = hls_url;
    }

    public boolean isIs_gif() {
        return is_gif;
    }

    public void setIs_gif(boolean is_gif) {
        this.is_gif = is_gif;
    }

    public String getTranscoding_status() {
        return transcoding_status;
    }

    public void setTranscoding_status(String transcoding_status) {
        this.transcoding_status = transcoding_status;
    }
}

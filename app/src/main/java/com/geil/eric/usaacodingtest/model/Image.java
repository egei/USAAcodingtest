package com.geil.eric.usaacodingtest.model;


import java.util.List;

public class Image
{
    private Source source;
    private List<Resolution> resolutions;
    private String id;

    public Image(Source source, List<Resolution> resolutions, String id) {
        this.source = source;
        this.resolutions = resolutions;
        this.id = id;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public List<Resolution> getResolutions() {
        return resolutions;
    }

    public void setResolutions(List<Resolution> resolutions) {
        this.resolutions = resolutions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

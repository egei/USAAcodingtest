package com.geil.eric.usaacodingtest.model;


import java.util.List;

public class Preview
{
    private List<Image> images;
    private boolean enabled;

    public Preview(List<Image> images, boolean enabled) {
        this.images = images;
        this.enabled = enabled;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}

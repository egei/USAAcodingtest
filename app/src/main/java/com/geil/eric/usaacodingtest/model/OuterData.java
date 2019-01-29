package com.geil.eric.usaacodingtest.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OuterData
{
    private String modhash;
    private int dist;
    private ChildList children;
    private String after;
    private String before;

    public OuterData(String modhash, int dist, ChildList children, String after, String before) {
        this.modhash = modhash;
        this.dist = dist;
        this.children = children;
        this.after = after;
        this.before = before;
    }

    public String getModhash() {
        return modhash;
    }

    public void setModhash(String modhash) {
        this.modhash = modhash;
    }

    public int getDist() {
        return dist;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }

    public ChildList getChildren() {
        return children;
    }

    public void setChildren(ChildList children) {
        this.children = children;
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }
}

package com.geil.eric.usaacodingtest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ChildList {

    @Expose
    @SerializedName("children")
    private ArrayList<Child> children = null;

    public ChildList(ArrayList<Child> children) {
        this.children = children;
    }

    public ArrayList<Child> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Child> children) {
        this.children = children;
    }
}

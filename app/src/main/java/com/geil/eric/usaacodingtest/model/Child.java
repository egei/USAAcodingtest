package com.geil.eric.usaacodingtest.model;


public class Child
{
    public String kind;
    public InnerData data;

    public Child(String kind, InnerData data) {
        this.kind = kind;
        this.data = data;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public InnerData getData() {
        return data;
    }

    public void setData(InnerData data) {
        this.data = data;
    }
}

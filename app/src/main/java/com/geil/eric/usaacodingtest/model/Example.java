package com.geil.eric.usaacodingtest.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example
{
    @Expose
    private String kind;

    @Expose
    @SerializedName("data")
    private OuterData data;

    public Example(String kind, OuterData data) {
        this.kind = kind;
        this.data = data;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public OuterData getData() {
        return data;
    }

    public void setData(OuterData data) {
        this.data = data;
    }
}

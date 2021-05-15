package com.example.applesvsoranges.source.remote.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Definition {
    @SerializedName("definition")
    @Expose
    private String definition;
    @Expose
    @SerializedName("example")
    private String example;

    public String getDefinition() { return definition; }
    public void setDefinition(String definition) { this.definition = definition; }

    public String getExample() { return example; }
    public void setExample(String example) { this.example = example; }
}

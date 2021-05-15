package com.example.applesvsoranges.source.remote.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Meaning {
    @SerializedName("definitions")
    @Expose
    private List<Definition> definitions;

    public List<Definition> getDefinitions() { return definitions; }
    public void setDefinitions(List<Definition> definitions) { this.definitions = definitions; }
}
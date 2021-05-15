package com.example.applesvsoranges.source.remote.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FruitResponse {

    @SerializedName("word")
    @Expose
    private String word;
    @SerializedName("meanings")
    @Expose
    private List<Meaning> meanings;

    public String getWord() { return word; }
    public void setWord(String word) { this.word = word; }

    public List<Meaning> getMeanings() { return meanings; }
    public void setMeanings(List<Meaning> meanings) { this.meanings = meanings; }
}

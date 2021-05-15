package com.example.applesvsoranges.domain;

public class Fruit {

    public Fruit(String word, String definition, String example) {
        mWord = word;
        mDefinition = definition;
        mExample = example;
    }

    private final String mWord;
    private final String mDefinition;
    private final String mExample;

    public String getWord() { return mWord; }

    public String getDefinition() {
        return mDefinition;
    }

    public String getExample() {
        return mExample;
    }
}

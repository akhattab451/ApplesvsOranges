package com.example.applesvsoranges.network;

import java.util.List;

class Response {
    public String word;
    public List<Meaning> meanings;
}

class Meaning {
    public List<Definition> definitions;
}

class Definition {
    public String definition;
    public String example;
}

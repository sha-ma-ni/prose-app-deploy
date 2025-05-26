package de.htw_berlin.fb4.proseapp_Shamanina.inplementations;

import de.htw_berlin.fb4.ossd.prose.Sentence;

public class SimpleSentence implements Sentence {
    private final String text;

    public SimpleSentence(String text) {
        this.text = text;
    }

    @Override
    public String get() {
        return text;
    }
}

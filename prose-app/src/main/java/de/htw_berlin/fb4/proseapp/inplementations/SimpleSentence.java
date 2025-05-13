package de.htw_berlin.fb4.proseapp.inplementations;

import de.htw_berlin.fb4.ossd.prose.Sentence;
import java.util.List;
import java.util.Arrays;

public class SimpleSentence implements Sentence {
    private final String text;

    public SimpleSentence(String text) {
        this.text = text;
    }

//    @Override
//    public List<String> getWords() {
//        return Arrays.asList(text.split("\\s+"));
//    }

    @Override
    public String get() {
        return text;
    }
}

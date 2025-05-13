package de.htw_berlin.fb4.proseapp;
import de.htw_berlin.fb4.ossd.prose.Prose;
import de.htw_berlin.fb4.ossd.prose.Sentence;
import de.htw_berlin.fb4.proseapp.inplementations.SimpleProse;
import de.htw_berlin.fb4.proseapp.inplementations.SimpleSentence;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Sentence s1 = new SimpleSentence("Hello world");
        Sentence s2 = new SimpleSentence("GitHub Packages are cool");

        Prose prose = new SimpleProse(List.of(s1, s2));

        System.out.println(prose.get());  // Output: Hello world. GitHub Packages are cool.
    }
}

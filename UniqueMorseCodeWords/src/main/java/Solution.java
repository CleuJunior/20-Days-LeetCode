package main.java;

import java.util.HashSet;

public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        final HashSet<String> UNIQUE_CODES = new HashSet<>();
        final String[] MORSE = new String[]{
                ".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."
        };

        for(String word : words) {
            StringBuilder transformation = new StringBuilder();

            for(char c : word.toCharArray()) {
                transformation.append(MORSE[c-'a']);
            }

            UNIQUE_CODES.add((transformation.toString()));
        }

        return UNIQUE_CODES.size();
    }
}

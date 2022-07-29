package main.java;

public class Solution {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();

        for(char c : s.toCharArray())
            if(Character.isUpperCase(c))
                result.append((char) (c + 32));
            else
                result.append(c);

        return result.toString();
    }
}

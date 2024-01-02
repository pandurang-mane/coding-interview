package com.pandurang;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacterCount {

    public static void main(String[] args) {
        printCharacterCount("manojpandey");
    }

    private static void printCharacterCount(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }

}

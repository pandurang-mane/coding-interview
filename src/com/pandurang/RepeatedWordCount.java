package com.pandurang;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatedWordCount {
    public static void main(String[] args) {
        findRepeatedWord("I am a java developer and I am proud of it ");
    }

    private static void findRepeatedWord(String s) {
        String[] strArray = s.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String string : strArray) {
            if (map.containsKey(string)) {
                map.put(string, map.get(string) + 1);
            } else {
                map.put(string, 1);
            }
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }

    }
}
package com.pandurang;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "Mother In Law";
        String s2 = "Hitler Woman";

        boolean isAnagram = isAnagram(s1, s2);
        System.out.println(isAnagram);
    }

    private static boolean isAnagram(String s1, String s2) {
        String s1Copy = s1.replaceAll("\\s", "");
        String s2Copy = s2.replaceAll("\\s", "");

        char[] s1CharArray = s1Copy.toLowerCase().toCharArray();
        char[] s2CharArray = s2Copy.toLowerCase().toCharArray();

        Arrays.sort(s1CharArray);
        Arrays.sort(s2CharArray);

        return Arrays.equals(s1CharArray, s2CharArray);
    }

}

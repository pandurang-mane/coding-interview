package com.pandurang;

public class NonRepeatedChar {

    public static void main(String[] args) {
        char nonRepeatedChar = findNonRepeatedChar("leetcode");
        System.out.println(nonRepeatedChar);
    }

    private static char findNonRepeatedChar(String s) {
        boolean isRepeated = false;
        char[] charArray = s.toLowerCase().toCharArray();
        for (int i = 0; i < charArray.length - 1; i++) {
            isRepeated = false;
            for (int j = 0; j < charArray.length; j++) {
                if (charArray[i] == charArray[j] && (i != j)) {
                    isRepeated = true;
                }
            }
            if(!isRepeated) {
                return charArray[i];
            }
        }
        return 0;
    }


}

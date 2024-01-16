package com.pandurang;

public class ToggleEveryCase {

    public static void main(String[] args) {
        String s = "ApPle";
        String toggledCaseString = toggleEveryCase(s);
        System.out.println(toggledCaseString);
    }

    private static String toggleEveryCase(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLowerCase(charArray[i])) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            } else {
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
        }
        return String.valueOf(charArray);
    }

}

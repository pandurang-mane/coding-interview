package com.pandurang;

public class Palindrome {
    
    public static void main(String[] args) {
        String s = "refer";
        boolean isPalindrome = isPalindrome(s);
        if(isPalindrome) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
    }

    private static boolean isPalindrome(String s) {
        char[] charArray = s.toLowerCase().toCharArray();
        for (int i = 0; i < charArray.length/2; i++) {
            if(charArray[i] != charArray[(charArray.length-1)-i]) {
                return false;
            }
        }
        return true;
    }

}

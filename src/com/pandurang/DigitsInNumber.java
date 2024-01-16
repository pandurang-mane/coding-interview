package com.pandurang;

public class DigitsInNumber {

    public static void main(String[] args) {
        int num = 172672187;
        int countedDigit = countDigit(num);
        System.out.println(countedDigit);
    }

    private static int countDigit(int num) {
        int temp = num;
        int count = 0;
        while (temp != 0) {
            temp = temp/10;
            count++;
        }
        return count;
    }

}

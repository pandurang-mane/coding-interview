package com.pandurang;

public class BalancedParenthesis {


    public static void main(String[] args) {
        boolean isBalanced = checkBalancedParenthesis("{[(])}");
        System.out.println(isBalanced);
    }

    private static boolean checkBalancedParenthesis(String s) {
        Stack<Character> stack = new Stack<>(s.length());
        boolean isBalanced = false;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(('(' == (charArray[i])) || ('[' == (charArray[i])) || ('{' == (charArray[i]))) {
                stack.push(charArray[i]);
            } else {
                if((charArray[i] == ')') && (stack.pop() == '(')) {
                    isBalanced = true;
                } else if((charArray[i] == ']') && (stack.pop() == '[')) {
                    isBalanced = true;
                } else if((charArray[i] == '}') && (stack.pop() == '{')) {
                    isBalanced = true;
                } else {
                    isBalanced = false;
                    return isBalanced;
                }
            }
        }
        return isBalanced;
    }

}

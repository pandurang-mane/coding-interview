package com.pandurang;

public class BalancedParenthesis {


    public static void main(String[] args) {
        String brackets = "{[(])}";
        boolean isBalanced = checkBalancedParenthesis(brackets);
        System.out.println(isBalanced);
    }

    private static boolean checkBalancedParenthesis(String brackets) {
        Stack<Character> stack = new Stack<>(brackets.length());
        boolean isBalanced = false;
        char[] bracketsCharArray = brackets.toCharArray();
        for (char bracket : bracketsCharArray) {
            if (('(' == bracket) || ('[' == bracket) || ('{' == bracket)) {
                stack.push(bracket);
            } else {
                if ((bracket == ')') && (stack.pop() == '(')) {
                    isBalanced = true;
                } else if ((bracket == ']') && (stack.pop() == '[')) {
                    isBalanced = true;
                } else if ((bracket == '}') && (stack.pop() == '{')) {
                    isBalanced = true;
                } else {
                    return false;
                }
            }
        }
        return isBalanced;
    }

}

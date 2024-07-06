package MinimalString.Stack;

import java.util.Stack;
/*
 * Given a string, find the lexicographically smallest string that can be
 * obtained by
 * removing one character.
 */

//Code by FlareStudy
public class LexicographicallySmallestStringStack {
    public static String smallestStringByStack(String s) {
        Stack<Character> stack = new Stack<>();
        // Code by FlareStudy
        for (int i = 0; i < s.length(); i++) {
            while (!stack.isEmpty() && stack.peek() > s.charAt(i)) {
                stack.pop();
            }
            stack.push(s.charAt(i));
        }
        // Code by FlareStudy
        // Form the smallest string from the stack
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        // Code by FlareStudy
        return result.toString();
    }

    // Code by FlareStudy
    public static void main(String[] args) {
        String input = "acdb";
        System.out.println("Lexicographically Smallest String (Stack): " + smallestStringByStack(input));
    }
}

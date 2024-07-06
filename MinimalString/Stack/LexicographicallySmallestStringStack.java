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

        // Iterate through the string
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // if stack is not empty and we can remove top of stack to get a smaller
            // lexicographical order
            if (!stack.isEmpty() && stack.peek() > currentChar) {
                // Remove the top of stack
                stack.pop();
            }
            // Code by FlareStudy
            // Push current character onto stack
            stack.push(currentChar);
        }

        // Build the result string from stack
        StringBuilder result = new StringBuilder();
        // The stack will contain the smallest lexicographical order
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop()); // Insert characters in reverse order
        }
        // Code by FlareStudy
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "acdb";
        System.out.println("Lexicographically Smallest String (Stack): " + smallestStringByStack(input));
    }
}

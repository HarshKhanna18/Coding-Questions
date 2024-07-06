package MinimalString.Iterative;
/*
 * Given a string, find the lexicographically smallest string that can be
 * obtained by
 * removing one character.
 */

//Code by FlareStudy
public class LexicographicallySmallestStringIterative {
    public static String smallestStringByIteration(String s) {
        int n = s.length();// Code by FlareStudy
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                return s.substring(0, i) + s.substring(i + 1);
            }
        }
        return s.substring(0, n - 1);
    }

    // Code by FlareStudy
    public static void main(String[] args) {
        String input = "acdb";
        System.out.println("Lexicographically Smallest String (Iteration): " + smallestStringByIteration(input));
    }
}

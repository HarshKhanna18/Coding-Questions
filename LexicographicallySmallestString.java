
/*
 * Given a string, find the lexicographically smallest string that can be
 * obtained by
 * removing one character.
 */

//Code by FlareStudy
public class LexicographicallySmallestString {
    public static String smallestStringByBruteForce(String s) {
        String smallest = s;// code by flarestudy
        for (int i = 0; i < s.length(); i++) {
            String candidate = s.substring(0, i) + s.substring(i + 1);
            if (candidate.compareTo(smallest) < 0) {
                smallest = candidate;
            } // code by flarestudy
        }
        return smallest;
    }

    // code by flarestudy
    public static void main(String[] args) {
        String input = "acdb";
        System.out.println("Lexicographically Smallest String (Brute Force): " + smallestStringByBruteForce(input));
    }
}

package MinimalString.TwoPointer;

/*
 * Given a string, find the lexicographically smallest string that can be
 * obtained by
 * removing one character.
 */
public class LexicographicallySmallestStringTwoPointer {
    // Code by FlareStudy
    public static String smallestStringByTwoPointer(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                return s.substring(0, i) + s.substring(i + 1);
            }
        } // Code by FlareStudy
        return s.substring(0, s.length() - 1);
    }

    // Code by FlareStudy
    public static void main(String[] args) {
        String input = "acdb";
        System.out.println("Lexicographically Smallest String (Two Pointer): " + smallestStringByTwoPointer(input));
    }
}

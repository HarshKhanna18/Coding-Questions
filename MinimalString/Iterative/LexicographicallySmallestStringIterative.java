package MinimalString.Iterative;

public class LexicographicallySmallestStringIterative {
    public static String smallestStringByIteration(String s) {
        int n = s.length();
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                return s.substring(0, i) + s.substring(i + 1);
            }
        }
        return s.substring(0, n - 1);
    }

    public static void main(String[] args) {
        String input = "acdb";
        System.out.println("Lexicographically Smallest String (Iteration): " + smallestStringByIteration(input));
    }
}

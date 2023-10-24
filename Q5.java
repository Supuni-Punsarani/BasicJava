import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sentence:");
        String sentence = scanner.nextLine();
        String sanitizedSentence = sanitizeString(sentence);
        boolean Palindrome = Palindrome(sanitizedSentence);
        System.out.println(sanitizedSentence);
        System.out.println("Is this sentence a palindrome? " + Palindrome);
    }

    private static String sanitizeString(String s) {
        s = s.toLowerCase();

        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }

    private static boolean Palindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

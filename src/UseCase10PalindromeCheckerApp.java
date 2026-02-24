public class UseCase10PalindromeCheckerApp { public static boolean isPalindrome(String word) {

    String normalized = word.replaceAll("\\s+", "").toLowerCase();

    int left = 0;
    int right = normalized.length() - 1;

    while (left < right) {
        if (normalized.charAt(left) != normalized.charAt(right))
            return false;
        left++;
        right--;
    }

    return true;
}

    public static void main(String[] args) {

        String word = "A man a plan a canal Panama";

        System.out.println("Original Input: " + word);

        if (isPalindrome(word))
            System.out.println("Result: It is a Palindrome.");
        else
            System.out.println("Result: It is NOT a Palindrome.");
    }
}

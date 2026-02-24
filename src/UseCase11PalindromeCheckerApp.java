class PalindromeChecker {

    private String word;

    public PalindromeChecker(String word) {
        this.word = word;
    }

    public boolean checkPalindrome() {

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right))
                return false;
            left++;
            right--;
        }

        return true;
    }
}
public class UseCase11PalindromeCheckerApp {public static void main(String[] args) {

    String input = "madam";

    PalindromeChecker checker = new PalindromeChecker(input);

    System.out.println("Given Word: " + input);

    if (checker.checkPalindrome())
        System.out.println("Result: It is a Palindrome.");
    else
        System.out.println("Result: It is NOT a Palindrome.");
}
}

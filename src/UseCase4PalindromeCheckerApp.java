public class UseCase4PalindromeCheckerApp { public static void main(String[] args) {

    // Original string
    String word = "radar";

    // Convert string to character array
    char[] characters = word.toCharArray();

    // Two-pointer variables
    int start = 0;
    int end = characters.length - 1;

    boolean isPalindrome = true;

    // Two-pointer comparison
    while (start < end) {
        if (characters[start] != characters[end]) {
            isPalindrome = false;
            break;
        }
        start++;
        end--;
    }

    // Display result
    System.out.println("Given Word: " + word);

    if (isPalindrome) {
        System.out.println("Result: It is a Palindrome.");
    } else {
        System.out.println("Result: It is NOT a Palindrome.");
    }
}
}

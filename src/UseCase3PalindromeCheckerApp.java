public class UseCase3PalindromeCheckerApp {public static void main(String[] args) {

    // Original String
    String original = "level";

    // Variable to store reversed string
    String reversed = "";

    // Reverse using for loop
    for (int i = original.length() - 1; i >= 0; i--) {
        reversed = reversed + original.charAt(i);
    }

    // Compare original and reversed
    if (original.equals(reversed)) {
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
        System.out.println("Result: It is a Palindrome.");
    } else {
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
        System.out.println("Result: It is NOT a Palindrome.");
    }
}
}

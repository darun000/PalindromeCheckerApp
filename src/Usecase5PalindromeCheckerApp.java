import java.util.Stack;
public class Usecase5PalindromeCheckerApp
{ public static void main(String[] args) {

    // Original string
    String word = "madam";

    // Create stack
    Stack<Character> stack = new Stack<>();

    // Push characters into stack
    for (int i = 0; i < word.length(); i++) {
        stack.push(word.charAt(i));
    }

    boolean isPalindrome = true;

    // Pop and compare
    for (int i = 0; i < word.length(); i++) {
        if (word.charAt(i) != stack.pop()) {
            isPalindrome = false;
            break;
        }
    }

    // Print result
    System.out.println("Given Word: " + word);

    if (isPalindrome) {
        System.out.println("Result: It is a Palindrome.");
    } else {
        System.out.println("Result: It is NOT a Palindrome.");
    }
}
}

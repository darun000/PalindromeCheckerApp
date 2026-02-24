import java.util.Deque;
import java.util.LinkedList;
public class UseCase7PalindromeCheckerApp {public static void main(String[] args) {

    // Original string
    String word = "hello";

    // Create Deque
    Deque<Character> deque = new LinkedList<>();

    // Insert characters into deque
    for (int i = 0; i < word.length(); i++) {
        deque.addLast(word.charAt(i));
    }

    boolean isPalindrome = true;

    // Compare front and rear
    while (deque.size() > 1) {
        if (deque.removeFirst() != deque.removeLast()) {
            isPalindrome = false;
            break;
        }
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

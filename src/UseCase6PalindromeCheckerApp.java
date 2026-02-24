import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
public class UseCase6PalindromeCheckerApp {public static void main(String[] args) {

    // Original string
    String word = "madam";

    // Create Queue (FIFO)
    Queue<Character> queue = new LinkedList<>();

    // Create Stack (LIFO)
    Stack<Character> stack = new Stack<>();

    // Insert characters into both data structures
    for (int i = 0; i < word.length(); i++) {
        char ch = word.charAt(i);
        queue.add(ch);     // Enqueue
        stack.push(ch);    // Push
    }

    boolean isPalindrome = true;

    // Compare dequeue (FIFO) with pop (LIFO)
    while (!queue.isEmpty()) {
        if (queue.remove() != stack.pop()) {
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

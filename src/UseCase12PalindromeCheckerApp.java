import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

interface PalindromeStrategy {
    boolean check(String word);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String word) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop())
                return false;
        }

        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {

    public boolean check(String word) {

        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast())
                return false;
        }

        return true;
    }
}

class PalindromeService {

    private PalindromeStrategy strategy;

    public PalindromeService(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String word) {
        return strategy.check(word);
    }
}
public class UseCase12PalindromeCheckerApp {  public static void main(String[] args) {

    String word = "madam";

    PalindromeStrategy strategy = new StackStrategy();
    PalindromeService service = new PalindromeService(strategy);

    System.out.println("Using Stack Strategy:");
    System.out.println("Given Word: " + word);

    if (service.execute(word))
        System.out.println("Result: It is a Palindrome.");
    else
        System.out.println("Result: It is NOT a Palindrome.");

    strategy = new DequeStrategy();
    service = new PalindromeService(strategy);

    System.out.println("\nUsing Deque Strategy:");
    System.out.println("Given Word: " + word);

    if (service.execute(word))
        System.out.println("Result: It is a Palindrome.");
    else
        System.out.println("Result: It is NOT a Palindrome.");
}
}

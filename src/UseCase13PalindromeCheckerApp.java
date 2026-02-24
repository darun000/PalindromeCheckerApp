import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;
public class UseCase13PalindromeCheckerApp { public static boolean twoPointer(String word) {

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

    public static boolean stackMethod(String word) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++)
            stack.push(word.charAt(i));

        for (int i = 0; i < word.length(); i++)
            if (word.charAt(i) != stack.pop())
                return false;

        return true;
    }

    public static boolean dequeMethod(String word) {

        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < word.length(); i++)
            deque.addLast(word.charAt(i));

        while (deque.size() > 1)
            if (deque.removeFirst() != deque.removeLast())
                return false;

        return true;
    }

    public static void main(String[] args) {

        String word = "A man a plan a canal Panama";
        word = word.replaceAll("\\s+", "").toLowerCase();

        long start, end;

        start = System.nanoTime();
        boolean result1 = twoPointer(word);
        end = System.nanoTime();
        long time1 = end - start;

        start = System.nanoTime();
        boolean result2 = stackMethod(word);
        end = System.nanoTime();
        long time2 = end - start;

        start = System.nanoTime();
        boolean result3 = dequeMethod(word);
        end = System.nanoTime();
        long time3 = end - start;

        System.out.println("Input: " + word);
        System.out.println("\nTwo Pointer Result: " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Stack Method Result: " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Deque Method Result: " + result3 + " | Time: " + time3 + " ns");
    }
}

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";

        Deque<Character> deque = new LinkedList<>();

        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

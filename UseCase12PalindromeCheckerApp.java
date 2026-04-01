interface PalindromeStrategy {
    boolean checkPalindrome(String str);
}

class StackStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String str) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        return str.equals(reversed);
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String str) {
        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            deque.offerLast(str.charAt(i));
        }
        while (deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast()) {
                return false;
            }
        }
        return true;
    }
}

public class UseCase12PalindromeCheckerApp {
    private PalindromeStrategy strategy;
    
    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }
    
    public boolean checkPalindrome(String input) {
        return strategy.checkPalindrome(input);
    }
    
    public static void main(String[] args) {
        UseCase12PalindromeCheckerApp app = new UseCase12PalindromeCheckerApp();
        app.setStrategy(new StackStrategy());
        
        String input = "madam";
        if (app.checkPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}

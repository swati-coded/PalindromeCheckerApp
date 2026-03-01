public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {
        String original = "madam";
        java.util.Queue<Character> queue = new java.util.LinkedList<>();
        java.util.Stack<Character> stack = new java.util.Stack<>();
        
        for (int i = 0; i < original.length(); i++) {
            char c = original.charAt(i);
            queue.offer(c);
            stack.push(c);
        }
        
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            if (queue.poll() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}

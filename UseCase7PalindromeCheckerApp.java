public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {
        String original = "madam";
        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();
        
        for (int i = 0; i < original.length(); i++) {
            deque.offerLast(original.charAt(i));
        }
        
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast()) {
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

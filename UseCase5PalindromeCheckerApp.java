public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {
        String original = "madam";
        java.util.Stack<Character> stack = new java.util.Stack<>();
        
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }
        
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }
        
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}

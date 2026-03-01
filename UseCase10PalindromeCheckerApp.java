public class UseCase10PalindromeCheckerApp {
    
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("\\s+", "");
        String reversed = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        
        return str.equals(reversed);
    }
    
    public static void main(String[] args) {
        String original = "A man a plan a canal Panama";
        
        if (isPalindrome(original)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}

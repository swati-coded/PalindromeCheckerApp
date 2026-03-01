public class UseCase9PalindromeCheckerApp {
    
    public static boolean isPalindrome(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return isPalindrome(str, left + 1, right - 1);
    }
    
    public static void main(String[] args) {
        String original = "madam";
        
        if (isPalindrome(original, 0, original.length() - 1)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}

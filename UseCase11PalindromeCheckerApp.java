class PalindromeChecker {
    
    public boolean checkPalindrome(String str) {
        if (str == null) {
            return false;
        }
        
        String normalized = str.toLowerCase().replaceAll("\\s+", "");
        int left = 0;
        int right = normalized.length() - 1;
        
        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
        
        String input = "madam";
        boolean result = checker.checkPalindrome(input);
        
        if (result) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}

public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {
        String original = "madam";
        char[] chars = original.toCharArray();
        boolean isPalindrome = true;
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}

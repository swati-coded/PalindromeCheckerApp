public class UseCase13PalindromeCheckerApp {

    public static boolean isPalindromeStringReverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return str.equals(reversed);
    }

    public static boolean isPalindromeCharArray(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeDeque(String str) {
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

    public static void main(String[] args) {
        String input = "madam";

        long start1 = System.nanoTime();
        boolean r1 = isPalindromeStringReverse(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean r2 = isPalindromeCharArray(input);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        boolean r3 = isPalindromeDeque(input);
        long end3 = System.nanoTime();

        System.out.println("Input: " + input);
        System.out.println("String Reverse Result: " + r1 + ", Time (ns): " + (end1 - start1));
        System.out.println("Char Array Result    : " + r2 + ", Time (ns): " + (end2 - start2));
        System.out.println("Deque Result         : " + r3 + ", Time (ns): " + (end3 - start3));
    }
}

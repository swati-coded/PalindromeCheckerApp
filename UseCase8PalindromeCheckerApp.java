class ListNode {
    char data;
    ListNode next;
    
    ListNode(char data) {
        this.data = data;
        this.next = null;
    }
}

public class UseCase8PalindromeCheckerApp {
    
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;
    }
    
    public static boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode secondHalf = reverseList(slow.next);
        ListNode firstHalf = head;
        
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
    
    public static ListNode createList(String str) {
        ListNode head = new ListNode(str.charAt(0));
        ListNode current = head;
        for (int i = 1; i < str.length(); i++) {
            current.next = new ListNode(str.charAt(i));
            current = current.next;
        }
        return head;
    }
    
    public static void main(String[] args) {
        String original = "madam";
        ListNode head = createList(original);
        
        if (isPalindrome(head)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}

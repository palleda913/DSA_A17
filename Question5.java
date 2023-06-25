package assignment17;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Question5{
    public int findTheWinner(int n, int k) {
   
        ListNode head = new ListNode(1);
        ListNode prev = head;
        for (int i = 2; i <= n; i++) {
            ListNode newNode = new ListNode(i);
            prev.next = newNode;
            prev = newNode;
        }
        prev.next = head;

        while (head.next != head) {
            for (int i = 0; i < k - 1; i++) {
                head = head.next;
            }

            head.next = head.next.next;
        }

        return head.val;
    }

    public static void main(String[] args) {
      Question5 game = new Question5();

        System.out.println(game.findTheWinner(5, 2));  // Output: 3
        System.out.println(game.findTheWinner(6, 4));  // Output: 5
    }
}

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

public class AddTwoNumbers {

}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class ATNSolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode header = adder(l1, l2, 0);
        return header;
    }

    private ListNode adder(ListNode l1, ListNode l2, int carry) {

        int sum = l1.val + l2.val + carry;
        int remain = sum % 10;
        int newCarry = sum / 10;
        ListNode result = new ListNode(remain);
        if (l1.next == null && l2.next == null){
            if (newCarry != 0) {
                ListNode tail = new ListNode(newCarry);
                result.next = tail;
            }
        } else {
            result.next = adder(dummyNext(l1), dummyNext(l2), newCarry);
        }

        return result;
    }

    private ListNode dummyNext(ListNode node){
        ListNode dummy;
        if (node.next == null){
            dummy = new ListNode(0);
        } else {
            dummy = node.next;
        }
        return dummy;
    }


}
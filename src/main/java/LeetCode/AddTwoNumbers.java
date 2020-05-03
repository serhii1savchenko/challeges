package LeetCode;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1_1 = new ListNode(2);
        ListNode l1_2 = new ListNode(4);
        ListNode l1_3 = new ListNode(3);
        l1_1.next = l1_2;
        l1_2.next = l1_3;

        ListNode l2_1 = new ListNode(5);
        ListNode l2_2 = new ListNode(6);
        ListNode l2_3 = new ListNode(4);
        l2_1.next = l2_2;
        l2_2.next = l2_3;

        ListNode sum = Solution.addTwoNumbers(l1_1, l2_1);
        /**
         * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
         * Output: 7 -> 0 -> 8
         * Explanation: 342 + 465 = 807.
         */
        do {
            System.out.print(sum.val);
            sum = sum.next;
        } while (sum != null);
    }

    static class Solution {
        /**
         * You are given two non-empty linked lists representing two non-negative integers.
         * The digits are stored in reverse order and each of their nodes contain a single digit.
         * Add the two numbers and return it as a linked list.
         * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
         */
        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            if (l1 == null || l2 == null) {
                return new ListNode(0);
            }

            ListNode first = null;
            boolean needToIncrease = false;

            while (l1 != null || l2 != null) {
                int a = l1 == null ? 0 : l1.val;
                int b = l2 == null ? 0 : l2.val;

                int sum = a + b;
                if (needToIncrease) {
                    sum++;
                    needToIncrease = false;
                }
                if (sum > 9) {
                    sum = sum%10;
                    needToIncrease = true;
                }

                if (first == null) {                    // first iteration
                    first = new ListNode(sum);
                } else {                                // first != null
                    // find last Node
                    ListNode last = first;
                    while (last.next != null) {
                        last = last.next;
                    }
                    last.next = new ListNode(sum);
                }

                l1 = l1 == null ? null : l1.next;
                l2 = l2 == null ? null : l2.next;
            }

            if (needToIncrease) {
                // find last Node
                ListNode last = first;
                while (last.next != null) {
                    last = last.next;
                }
                last.next = new ListNode(1);
            }

            return first;
        }
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

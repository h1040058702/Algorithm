
class Solution {


    public static class ListNode02 {
        int val;
        ListNode02 next;

        ListNode02() {
        }

        ListNode02(int val) {
            this.val = val;
        }

        ListNode02(int val, ListNode02 next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode02 addTwoNumbers(ListNode02 l1, ListNode02 l2) {
        ListNode02 dummyHead = new ListNode02(0);
        ListNode02 current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            int sum = val1 + val2;
            carry = sum / 10;
            int digit = sum % 10;

            current.next = new ListNode02(digit);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

        }

        if (carry > 0) {
            current.next = new ListNode02(carry);
        }

        return dummyHead.next;

    }


    // 测试方法
    public static void main(String[] args) {
        // 创建测试链表
        ListNode02 l1 = new ListNode02(2);
        l1.next = new ListNode02(4);
        l1.next.next = new ListNode02(3);

        ListNode02 l2 = new ListNode02(5);
        l2.next = new ListNode02(6);
        l2.next.next = new ListNode02(4);


        Solution solution = new Solution();
        // 计算和
        ListNode02 result = solution.addTwoNumbers(l1, l2);

        // 打印结果
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode dummyHead = new ListNode(0);
//        ListNode current = dummyHead;
//        int carry = 0;
//        while(l1 != null || l2 !=null){
//            int val1 = (l1 !=null)?l1.val : 0;
//            int val2 = (l2 !=null)?l2.val : 0;
//            int sum = val1 + val2 + carry;
//            carry = sum/10;
//            int digit = sum%10;
//
//            current.next = new ListNode(digit);
//            current = current.next;
//
//            if (l1 != null) l1 = l1.next;
//            if (l2 != null) l2 = l2.next;
//
//
//        }
//
//        if(carry>0){
//            current.next = new ListNode(carry);
//        }
//        return dummyHead.next;
//
//
//    }
//
//}

package leetcode.easyproblems;

/**
 * @author Janak Mehta
 * @link: https://leetcode.com/problems/merge-two-sorted-lists/#/description
 * The commented part of the code is the iterative solution whereas
 * the uncommented part of the code is the recursive solution
 */
public class MergeTwoSortedLinkedLists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		//Iterative Solution
		/*ListNode listNode = new ListNode(0);
		ListNode listNodeToBeReturned = listNode;
		if(l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		} else {
			while(l1 != null && l2 != null) {
				if(l1.val <= l2.val) {
					listNode.next = l1;
					l1 = l1.next;
				} else {
					listNode.next = l2;
					l2 = l2.next;
				}
				listNode = listNode.next;
			}
			if (l1 != null) {
				listNode.next = l1;
			}
			if(l2 != null) {
				listNode.next = l2;
			}
		}
		return listNodeToBeReturned.next;*/
		
		//Recursive Solution
		ListNode listNode = null;
		if(l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		} else {
			if (l1.val <= l2.val) {
				listNode = l1;
				listNode.next = mergeTwoLists(l1.next, l2);
			} else {
				listNode = l2;
				listNode.next = mergeTwoLists(l1, l2.next);
			}
		}
		
		return listNode;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(1);
		new MergeTwoSortedLinkedLists().mergeTwoLists(l1, l2);
	}

}

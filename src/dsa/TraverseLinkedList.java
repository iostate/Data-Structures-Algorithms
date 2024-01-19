package dsa;

public class TraverseLinkedList {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	/**
	 * Initialize a list of nodes with an array of Integers. Returns the head of the
	 * list of nodes.
	 * 
	 * @param nums Numbers to initialize the nodes with.
	 * @type int[]
	 * @return ListNode Head of the list of nodes.
	 */
	public static ListNode initializeList(int[] nums) {
		ListNode head = new ListNode();

		// Used to return the head of the List
		ListNode headPointer = head;
		for (int i = 0; i < nums.length; i++) {

			head.val = nums[i];
			if (i < nums.length - 1) {
				head.next = new ListNode();
				// System.out.println(head.next.val);
				head = head.next;
			}
		}
		return headPointer;
	}

	public static void traverseList(ListNode node) {
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		ListNode head = initializeList(new int[] { 1, 2, 3, 4, 5 });
		traverseList(head);
		
		System.out.println(3 % 2000);
		System.out.println(2000 % 3);
		
		// Get hash code of an Integer
//		 int intValue = 42;
//
//	        Integer integerObject = intValue;
//	        int hashCode = integerObject.hashCode();
//
//	        System.out.println("Hash Code: " + hashCode);

	}

}

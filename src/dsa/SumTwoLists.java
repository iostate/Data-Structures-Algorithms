package dsa;

import lists.SinglyLinkedList;
import lists.SinglyLinkedList.Node;

public class SumTwoLists {
	
public static class Node<E> {
		
		private E element;
		private Node<E> next;
		
		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}
		public E getElement() {
			return element;
		}
		public Node<E> getNext() {
			return next;
		}
		
		public void setNext(Node<E> n) {
			next = n;
		}
	}
	
	public Node<Integer> sumTwoLists(Node<Integer> list1, Node<Integer> list2) {
		if(list1 == null) {return list2;}
		if(list2 == null) { return list1;}
		
		if(list1.element < list2.element) {
			list1.setNext(sumTwoLists(list1.next, list2));
			return list1;
		} else {
			list2.setNext( sumTwoLists(list1, list2.next));
			return list2;
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ListNode elem1 = new ListNode(3);
		SinglyLinkedList<Integer> list1 = new SinglyLinkedList<Integer>();
		SinglyLinkedList<Integer> list2 = new SinglyLinkedList<Integer>();
		list1.addLast(1);
		list1.addLast(1);
		list1.addLast(3);
		
		list2.addLast(1);
		list2.addLast(3);
		list2.addLast(4);
		
		Node<Integer> result = sumTwoLists(list1, list2);
	}

}

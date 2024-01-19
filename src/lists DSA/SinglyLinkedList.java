package lists;

/**
 * The SinglyLinkedList class is an implementation of a singly linked list, a 
 * data structure consisting of nodes where each node points to the next node 
 * in the sequence. The list is parameterized with the type of elements it 
 * stores (<E>). 
 * 
 * The class provides methods to add elements at the beginning and end of the 
 * list, remove the first element, and retrieve information about the list such 
 * as its size and whether it is empty.
 * @param <E> Element type (Integer, Boolean, etc.)
 */
public class SinglyLinkedList<E> {
	
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
	
	private Node<E> head = null; // refers to first element
	private Node<E> tail = null; // refers to last element
	private int size;

	public void addFirst(E e) {
		head = new Node<>(e, head);
		if (size == 0) tail = head;
		size++;
	}
	
	public void addLast(E e) {
		Node<E> newest = new Node<>(e, null);
		if(isEmpty()) { 
			head = newest; 
		} else {
			tail.next = newest;			
		}
		tail = newest;
		size++;
		
	}
	
	public E removeFirst() {
		if(isEmpty()) {
			return null;
		}
		E answer = head.getElement();
		head = head.getNext();
		size--;
		if(size == 0) {
			tail = null;
		}
		return answer;
	}
	

	public E first() {
		return head.getElement();
	}


	public E last() {
		return tail.getElement();
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
	
	public static void main(String[] args) {
		
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		
		list.addFirst(3);
		list.addLast(4);
		
		System.out.println(list.first()); // => 3
		System.out.println(list.last());  // => 4
		list.removeFirst();					
		System.out.println(list.first()); // => 4
	}

}

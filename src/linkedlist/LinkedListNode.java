package linkedlist;

public class LinkedListNode<T> {
	private LinkedListNode<T> first;


	public LinkedListNode(LinkedListNode<T> first) {
		super();

	public T value;
	public LinkedListNode<T> next;


	  public LinkedListNode(T value) { 
		  super();
		  this.value= value; 
		  this.next= null; 
		  }

	public LinkedListNode(T value) {
		super();
		this.value = value;
		this.next = null;
	}

	public LinkedListNode<T> getNext() {
		return next;
	}
	/*
	 * public void insert(Integer a) { node.setNext(first); first = a; }
	 */

	// UC2 Insert at the front of list
	public void insert(LinkedListNode<T> node) {
		node.setNext(first);
		first = node;
	}

	public void setNext(LinkedListNode<T> next) {
		this.next = next;
	}
	public T getValue() {
		return value;
	}
}
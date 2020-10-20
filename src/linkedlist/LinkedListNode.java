package linkedlist;

public class LinkedListNode<T>{
	private LinkedListNode<T> first;


	public LinkedListNode(LinkedListNode<T> first) {
		super();
		this.first = first;
	}

	public T value;
	public LinkedListNode<T> next;


	  public LinkedListNode(T value) { 
		  super();
		  this.value= value; 
		  this.next= null; 
		  }


	public LinkedListNode<T> getNext() {
		return next;
	}
	/*
	 * public void insert(Integer a) { node.setNext(first); first = a; }
	 */

	public void setNext(LinkedListNode<T> next) {
		this.next = next;

	}

	public T getValue() {
		return value;
	}

} 



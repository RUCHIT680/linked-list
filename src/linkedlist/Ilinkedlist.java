package linkedlist;


public class LinkedListClass<T> {
	public ILinkedList<T> head;
	public ILinkedList<T> tail;

	public LinkedListClass(ILinkedList<T> head, ILinkedList<T> tail) {
		this.head = null;
		this.tail = null;
	}

	public LinkedListClass() {
		// TODO Auto-generated constructor stub
	}

	public void insert(ILinkedList<T> newNode) {
		if (this.tail==null) {
			this.tail=newNode;
		}

		if(this.head==null) {
			this.head=newNode;
		}else {
			ILinkedList<T> temp=this.head;
			this.head=newNode;
			(this.head).setNext(temp);
		}
	}

	public void printList() {
		System.out.print("Linked List=");
		ILinkedList<T> temp=head;
		do {
			System.out.println(temp.getT());
			if(!temp.equals(tail)) System.out.println(">");
			temp=temp.getNext();
		}while(temp.getNext()!= null);
		System.out.println(temp.getT());
		}

	public void append(ILinkedList<T> newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			ILinkedList<T> temp = this.head;
			this.head = newNode;
			(this.head).setNext(temp);
		}
	}



}
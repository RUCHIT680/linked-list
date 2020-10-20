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
	public void printlist() {
		System.out.print("Linked List=");
		ILinkedList<T> temp=head;
		do {
			System.out.println(temp.getT());
			if(!temp.equals(tail)) System.out.println(">");
			temp=temp.getNext();
		}while(temp.getNext()!= null);
		System.out.println(temp.getT());
		}
	
 public void push(ILinkedList<T> beforeNode,ILinkedList<T> newNode) {
	 ILinkedList<T> temp=beforeNode.getNext();
	 beforeNode.setNext(newNode);
	 newNode.setNext(temp);
 }
 
 public void pop() {
	 ILinkedList<T> temp=head;
	 head=head.getNext();
	 
 }
	
public void poptail() {
	ILinkedList<T> temp=head;
	while((!(temp.getNext()).equals(tail))) {
		temp=temp.getNext();
	}
	tail=temp;
	tail.setNext(null);

}

public int search(T data) {
public LinkedListNode<T> search(T data) {
	ILinkedList<T> temp=head;
	int flag=1;
	while(temp!=null && temp.getNext()!=null) {
		if((temp.getT()).equals(data)) {
			return flag;
			return (LinkedListNode<T>) temp;
		}
		flag ++;

		temp=temp.getNext();

	}
	return -1;
	return (LinkedListNode<T>) tail;
}
public void insertAfter(T before_data, T data) {
	LinkedListNode<T> before_Node=search(before_data);
	LinkedListNode<T> newNode=new LinkedListNode<T>(data);

	push(before_Node,newNode);


}

}

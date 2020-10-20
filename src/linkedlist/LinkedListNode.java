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
		if (this.tail == null) {
			this.tail = newNode;
		}
		
		if(this.head==null) {
			this.head=newNode;
		}else {
			ILinkedList<T> temp=this.head;
			this.head=newNode;

		if (this.head == null) {
			this.head = newNode;
		} else {
			ILinkedList<T> temp = this.head;
			this.head = newNode;
			(this.head).setNext(temp);
		}
	




	public void append(ILinkedList<T> newNode) {
		if (this.tail == null) {
			this.tail = newNode;
@@ -44,61 +42,69 @@ public void append(ILinkedList<T> newNode) {

	public void printlist() {
		System.out.print("Linked List=");
		ILinkedList<T> temp=head;
		ILinkedList<T> temp = head;
		do {
			System.out.println(temp.getT());
			if(!temp.equals(tail)) System.out.println(">");
			temp=temp.getNext();
		}while(temp.getNext()!= null);
			if (!temp.equals(tail))
				System.out.println(">");
			temp = temp.getNext();
		} while (temp.getNext() != null);
		System.out.println(temp.getT());
	}

	public void push(ILinkedList<T> beforeNode, ILinkedList<T> newNode) {
		ILinkedList<T> temp = beforeNode.getNext();
		beforeNode.setNext(newNode);
		newNode.setNext(temp);
	}

	public void pop() {
		ILinkedList<T> temp = head;
		head = head.getNext();

	}

	public void poptail() {
		ILinkedList<T> temp = head;
		while ((!(temp.getNext()).equals(tail))) {
			temp = temp.getNext();
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
		tail = temp;
		tail.setNext(null);

	}
	tail=temp;
	tail.setNext(null);

}

public LinkedListNode<T> search(T data) {
	ILinkedList<T> temp=head;
	int flag=1;
	while(temp!=null && temp.getNext()!=null) {
		if((temp.getT()).equals(data)) {
			return (LinkedListNode<T>) temp;
	public LinkedListNode<T> search(T data) {
		ILinkedList<T> temp = head;
		int flag = 1;
		while (temp != null && temp.getNext() != null) {
			if ((temp.getT()).equals(data)) {
				return (LinkedListNode<T>) temp;
			}

			temp = temp.getNext();

		}

		temp=temp.getNext();

		return (LinkedListNode<T>) tail;
	}
	return (LinkedListNode<T>) tail;
}
public void insertAfter(T before_data, T data) {
	LinkedListNode<T> before_Node=search(before_data);
	LinkedListNode<T> newNode=new LinkedListNode<T>(data);

	push(before_Node,newNode);


}

}


	public void insertAfter(T before_data, T data) {
		LinkedListNode<T> before_Node = search(before_data);
		LinkedListNode<T> newNode = new LinkedListNode<T>(data);

		push(before_Node, newNode);
	}

	public int deleteNode(T value) {
		ILinkedList<T> temp = head;
		int count = 1;
		while (temp != null && temp.getNext() != null) {
			temp.setNext((temp.getNext()).getNext());
		}
		count++;
		temp = temp.getNext();

		return count;
	}

}
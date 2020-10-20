package linkedlist;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import main.LinkedListClass;
import main.LinkedListNode;
public class GenericLinkedListTest {
	LinkedListClass<Integer> LinkedList;
	static private LinkedListNode<Integer> myFirstNode;
	static private LinkedListNode<Integer> mySecondNode;
	static private LinkedListNode<Integer> myThirdNode;
	static private LinkedListNode<Integer> myFourthNode;

	@Before
	public void init() {
	myFirstNode = new LinkedListNode<Integer>(56);
	mySecondNode = new LinkedListNode<Integer>(30);
	myThirdNode = new LinkedListNode<Integer>(70);
	myThirdNode = new LinkedListNode<Integer>(40);
	myFourthNode= new LinkedListNode<Integer>(70);
	LinkedList= new LinkedListClass<Integer>();

	LinkedList.insert(myFirstNode);
	LinkedList.append(mySecondNode);
	LinkedList.append(myThirdNode);
	LinkedList.insertAfter(30, 40);
	LinkedList.deleteNode(40);

	}


	@Test
	public void When40isSearchedItShouldLieBefore70() {
		Assert.assertEquals(myThirdNode,LinkedList.search(40).getNext());
	public void NodeWith70ShouldComeAfter30() {
		Assert.assertEquals(myFourthNode,mySecondNode.getNext());
		}	
	

	}	
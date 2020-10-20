package linkedlist;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


import main.LinkedListNode;

public class GenericLinkedListTest {
 private LinkedListNode<Integer> myFirstNode ;
 private LinkedListNode<Integer> mySecondNode ;
 private LinkedListNode<Integer> myThirdNode ;

	@Test
	public void test() {

	//Inserting the values
		myFirstNode = new LinkedListNode<Integer>(56);
		mySecondNode=new LinkedListNode<Integer>(30);
		myThirdNode=new LinkedListNode<Integer>(70);
	//Linking the nodes
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);

	boolean result= myFirstNode.getNext().equals(mySecondNode)&&
					mySecondNode.getNext().equals(myThirdNode);
	Assert.assertTrue(result);

	}
}



}

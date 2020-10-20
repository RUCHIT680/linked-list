package linkedlist;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import main.LinkedListClass;
import main.LinkedListNode;

public class GenericLinkedListTest {
 private LinkedListNode<Integer> myFirstNode ;
 private LinkedListNode<Integer> mySecondNode ;
 private LinkedListNode<Integer> myThirdNode ;

	LinkedListClass<Integer> LinkedList;
	private LinkedListNode<Integer> myFirstNode;
	private LinkedListNode<Integer> mySecondNode;
	private LinkedListNode<Integer> myThirdNode;

	@Before
	public void init() {
	myFirstNode = new LinkedListNode<Integer>(70);
	mySecondNode = new LinkedListNode<Integer>(30);
	myThirdNode = new LinkedListNode<Integer>(70);
	LinkedList= new LinkedListClass<Integer>();

	LinkedList.append(myThirdNode);
	LinkedList.append(mySecondNode);
	LinkedList.append(myFirstNode);
	}

	@Test
	public void ReturnTrueWhenMyFirstNodeAppend() {
		Assert.assertTrue((LinkedList.head).equals(myFirstNode));}
	@Test
	public void test() {

	//Inserting the values
		myFirstNode = new LinkedListNode<Integer>(56);
		mySecondNode=new LinkedListNode<Integer>(30);
		myThirdNode=new LinkedListNode<Integer>(70);
	//Linking the nodes
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
	public void ReturnTrueWhenMySecondNodeAppend() {
		Assert.assertTrue(((LinkedList.head).getNext()).equals(mySecondNode));}
	@Test
		public void ReturnTrueWhenMyThirdNodeAppend() {
		Assert.assertTrue((LinkedList.tail).equals(myThirdNode));
		}	


	boolean result= myFirstNode.getNext().equals(mySecondNode)&&
					mySecondNode.getNext().equals(myThirdNode);
	Assert.assertTrue(result);


	}
}
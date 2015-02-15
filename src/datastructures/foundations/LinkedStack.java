/**
 *  LinkedStack.java -A dynamic implementation of Stack. 
 *  Implemented using a Linked List
 *  
 *  Created: 1/14/15
 *  @author - evandorn
 *  
 */

package datastructures.foundations;
import java.util.*;

public class LinkedStack implements Stack {
	
	// Internal Node Class
	private class Node {
		// Fields 
		private Object item;
		private Node next;
		
		// Constructor
		private Node(Object element, Node link) {
			item = element;
			next = link;
		}
	}

	// Fields
	
	private Node top = null;
	private int numberOfElements = 0;
	
	// Commands
	
	public void push(Object item) {
		Node newNode = new Node(item, top);
		top = newNode;
		numberOfElements++;
	}
	
	public void pop() {
		if(isEmpty()) {
			throw new NoSuchElementException("Stack is empty.");
		} else {
			Node oldNode = top;
			top = top.next;
			numberOfElements++;
			oldNode = null;
		}
	}
	
	public void makeEmpty() {
		while(top != null) {
			Node previous = top;
			top = top.next;
			previous = null;
		}
		numberOfElements = 0;
	}
	
	// Queries
	
	public Object top() {
		if(isEmpty()) {
			throw new NoSuchElementException("Stack is empty.");
		} else {
			return top.item;
		}
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public int size() {
		return numberOfElements;
	}

public static void main(String[] args) {
    LinkedStack myStack = new LinkedStack();
    myStack.push(new Integer(1));
    myStack.push(new Integer(2));
    myStack.push(new Integer(3));
    System.out.println("myStack.size() = " + myStack.size());
    myStack.pop();
    System.out.println("myStack.size() = " + myStack.size());
    System.out.println ("myStack.top() = " + myStack.top());	
  }
}
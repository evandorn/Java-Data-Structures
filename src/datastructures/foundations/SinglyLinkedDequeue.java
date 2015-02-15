package datastructures.foundations;

/**
 *  SinglyLinkedDequeue.java - A singly linked implementation of a Dequeue with duplicates
 *  
 *   @author evandorn
 *   Created on: 2/15/15
 */

import java.util.*;
import java.io.Serializable;

public class SinglyLinkedDequeue implements List {

	// Fields
	
	protected Node front, rear;
	protected int numberElements;
	
	// Commands
	
	/**
	 *  Remove all objects from the dequeue if any
	 */
	public void makeEmpty() {
		while(front != null) {
			Node previous = front;
			front = front.next;
			previous = null;
		}
		numberElements = 0;
		rear = null;
	}
	
	/**
	 *  Add an object at the front of the dequeue
	 */
	public void addFront(Object obj) {
		Node newNode = new Node(obj, front);
		front = newNode;
		if(numberElements == 0) {
			rear = front;
		}
		numberElements++;
	}
	
	/**
	 *  Add an object at the back of the dequeue
	 */
	public void addRear(Object obj) {
		Node newNode = new Node(obj, null);
		if(numberElements == 0) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		numberElements++;
	}
	
	/**
	 *  Remove an object from the front of the dequeue, if found
	 */
	public void removeFront() {
		if(isEmpty()) {
			throw new NoSuchElementException("Dequeue is empty");
		} else {
			front = front.next;
			numberElements--;
			if(numberElements == 0) {
				rear = null;
			}
		}
	}
	
	/**
	 *  Remove an object from the rear of the dequeue, if found
	 */
	public void removeRear() {
		if(isEmpty()) {
			throw new NoSuchElementException("Dequeue is empty");
		}
		else if(numberElements == 1) {
			front = null;
			rear = null;
		} else {                                  // 2 or more elements
		Node previous = front;				      // Find the Node just in front of the rear
		while(previous.next != rear) {
			previous = previous.next;             // iterate through the linked list until you hit the node before the last
		}
		previous.next = null;
		rear = previous;
	  }
		numberElements--;
	}
	
	// Queries
	
	/**
	 *  Return true if the dequeue is empty
	 */
	public boolean isEmpty() {
		return numberElements == 0;
	}
	
	/**
	 *  Return the number of objects in the dequeue
	 */
	public int size() {
		return numberElements;
	}
	
	/**
	 *  Return without removing the front object in the dequeue
	 */
	public Object front() {
		if(isEmpty()) {
			throw new NoSuchElementException("Dequeue is empty");
		} else {
			return front.item;
		}
	}
	
	/**
	 *  Return the rear object in the dequeue without removing it
	 */
	public Object rear() {
		if(isEmpty()) {
			throw new NoSuchElementException("Dequeue is empty");
		} else {
			return rear.item;
		}
	}
	
	/**
	 *  Return true if the dequeue contains the object, false otherwise
	 */
	public boolean contains(Object obj) {
		Node current = front;
		while(current != null && !current.item.equals(obj)) {
			current = current.next;
		}
		return current != null;
	}
	
	/**
	 *  Return an iterator on the elements in the dequeue
	 */
	public Iterator elements() {
		// Load the objects of the dequeue into a vector
		Vector v = new Vector();
		Node current = front;
		while(current != null) {
			v.addElement(current.item);
			current = current.next;
		}
		return (Iterator) v.iterator();
	}
	
	/**
	 *  Models an internal node of a dequeue. NOTE: could be used in other node based structures
	 */
	protected class Node implements Serializable {
		
		protected Object item;
		protected Node next;
		
		// constructor
		protected Node(Object element, Node link) {
			item = element;
			next = link;
		}
	}

	/**
	 *  Main driver for testing
	 */
	public static void main(String[] args) {
		SinglyLinkedDequeue myDequeue = new SinglyLinkedDequeue();
		
		// Add three Integer Objects to the front of the dequeue
		myDequeue.addFront(new Integer(5));
		myDequeue.addFront(new Integer(4));
		myDequeue.addFront(new Integer(3));
		
		// Remove the front and rear objects
		myDequeue.removeFront();
		myDequeue.removeRear();
		
		// Obtain an iterator for the dequeue
		Iterator iter = myDequeue.elements();
		
		// Print out the dequeue
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// test for the presence of two objects
		if(myDequeue.contains(new Integer(5))) {
			System.out.println("5 is in the dequeue");
		} else {
			System.out.println("5 is not in the dequeue");
		}
		if(myDequeue.contains(new Integer(8))) {
			System.out.println("8 is in the dequeue");
		} else {
			System.out.println("8 is not in the dequeue");
		}
	}
}

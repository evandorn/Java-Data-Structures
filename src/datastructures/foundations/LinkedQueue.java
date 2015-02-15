/**
 * LinkedQueue.java - A dynamic queue implementation. Implemented using a linked list
 * 
 * Created: 1/14/15
 * @author - evandorn
 */

package datastructures.foundations;
import java.util.*;

public class LinkedQueue implements Queue {
	
    // Private Node class
    private class Node {
	// Fields
	private Object item;
	private Node next;
	// Constructors
	private Node (Object element, Node link) {
	    item = element;
	    next = link; 
	}
    }
	
    // Fields
    private Node first = null;
    private int numberOfElements;
	
    // Commands
    public void add(Object item) {
	Node newNode;
	if (numberOfElements == 0) {
	    newNode = new Node(item, null);
	    first = newNode;
	} else {
	    Node currentNode = first;
	    Node previousNode = null;
	    while (currentNode != null) {
		previousNode = currentNode;
		currentNode = currentNode.next;
	    }
	    newNode = new Node(item, null);
	    previousNode.next = newNode;
	}
	numberOfElements++;
    }
	  
    public void remove() {
	if (isEmpty()) {
	    throw new NoSuchElementException("Queue is empty.");
	} else {
	    Node oldNode = first; 
	    first = first.next; 
	    numberOfElements--; 
	    oldNode = null;
	} 
    }
	  
    public void makeEmpty() {
	while (first != null) {
	    Node previous = first;
	    first = first.next;
	    previous = null;
	}
	numberOfElements = 0;
    }
		  
    // Queries	  
    public Object getFront() {
	if (isEmpty()) {
	    throw new NoSuchElementException("Queue is empty." );
	} else {
	    return first.item;
	}
    }
		  
    public boolean isEmpty() {
	return first == null;
    }
    
    public int size () {
	return numberOfElements;
    }

    // Main driver test method 
    public static void main(String [] args) {
	LinkedQueue myQueue = new LinkedQueue();
	myQueue.add(new Integer(1));
	myQueue.add(new Integer(2));
	myQueue.add(new Integer(3));
	System.out.println("myQueue.size() = " + myQueue.size());
	myQueue.remove();
	System.out.println("myQueue.size() = " + myQueue.size());
	System.out.println("myQueue.getFront() = " + myQueue.getFront());
    }
}

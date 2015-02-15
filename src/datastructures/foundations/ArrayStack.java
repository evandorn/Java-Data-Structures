/**
 *  ArrayStack.java - A fixed stack implementation using arrays
 *  				 implements the Stack interface
 *  
 *  Created: 1/13/15
 *  @author evandorn
 *
 */

package datastructures.foundations;
import java.util.*;

public class ArrayStack implements Stack {
	
	// Fields
	private int capacity = 101; 	// Default max value for stack
	private Object[] data;			// Holds the information in the stack
	private int top = 0; 			// Tracks the last element inserted
	
	// Constructors
	
	public ArrayStack() {
		this(101);
	}
	
	public ArrayStack(int capacity) {
		this.capacity = capacity;
		data = new Object[capacity + 1];
	}
	
	// Commands
	
	public void push(Object item) {
		top++;
		try {
			data[top] = item;
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			top--;
			throw new ArrayIndexOutOfBoundsException("Stack capacity exceeded.");
		}
	}
	
	public void pop() {
		if(isEmpty()) {
			throw new NoSuchElementException("Stack is empty");
		} else {
			data[top] = null;
			top--;
		}
	}
	
	public void makeEmpty() {
		top = 0;
	}
	
	// Queries
	
	public Object top() {
		if(isEmpty()) {
			throw new NoSuchElementException("Stack is empty");
		} else {
			return data[top];
		}
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	
	public int size() {
		return top;
	}
	
	public static void main(String[] args) {
		ArrayStack myStack = new ArrayStack(5);
	     myStack.push(new Integer(1)); // obj1 in Figure 11.1
	     myStack.push(new Integer(2)); // obj2 in Figure 11.1
	     myStack.push(new Integer(3)); // obj3 in Figure 11.1
	     System.out.println("myStack.size() = " + myStack.size());
	     myStack.pop();
	     System.out.println("myStack.size() = " + myStack.size());
	     System.out.println ("myStack.top() = " + myStack.top());
	}
}

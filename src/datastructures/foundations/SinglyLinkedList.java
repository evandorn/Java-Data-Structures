package datastructures.foundations;

import java.util.*;

public class SinglyLinkedList extends SinglyLinkedDequeue implements PositionableList {
	
	// Fields are inherited from SinglyLinkedDequeue
	
	// Commands
	
	/**
	 *  Insert object after target object in the list
	 */
	public void addAfter(Object obj, Object target) {
		Node itemNode = getNode(target);
		if(itemNode == null) {
			throw new NoSuchElementException("addAfter::target does not exist");
		} else {
			Node newNode = new Node(obj, itemNode.next);
			numberElements++;
			if(this.rear == itemNode) {
				rear = newNode;
			}
		}
	}
	
	/**
	 *  Insert object before target object in the list
	 */
	public void addBefore(Object obj, Object target) {
		Node itemNode = getNode(target);
		if(itemNode == null) {
			throw new NoSuchElementException("addAfter::target does not exist");
		} 
		else {
		Node newNode = new Node(obj, itemNode);
		if(this.front == itemNode) {
			this.front = newNode;
		} else {
			Node beforeNode = nodeBefore(itemNode);
			beforeNode.next = newNode;
		}
		numberElements++;
	  }
	}
	
	/**
	 *  Delete an object after the target object in the list
	 *  Throw new NoSuchElementException if target is not in the list
	 *  Throw new NoSuchElementException if target is last in the list
	 */
	public void removeAfter(Object target) {
		// Todo: stubbed
	}
	
	/**
	 *  Delete an object before the target object in the list
	 *  Throw new NoSuchElementException if target is not in the list
	 *  Throw new NoSuchElementException if target is first in the list
	 */
	public void removeBefore(Object target) {
		// Todo: stubbed
	}
	
	// Queries
	
	/**
	 *  Return an object after the target object in the list
	 *  Throw new NoSuchElementExceptioon if target is not in the list
	 *  Throw new NoSuchElementException if target is last in the list
	 */
	public Object elementAfter(Object target) {
		Node targetNode = getNode(target);
		if(!this.contains(target) || targetNode == this.rear) {
			throw new NoSuchElementException("removeAfter::object does not exist or is last in the list");
		} else {
			return targetNode.next.item;
		}
	}
	
	/**
	 *  Return an object after the target object in the list
	 *  Throw new NoSuchElementExceptioon if target is not in the list
	 *  Throw new NoSuchElementException if target is first in the list
	 *  
	 */
	public Object elementBefore(Object target) {
		if(!this.contains(target) || getNode(target) == this.front) {
			throw new NoSuchElementException("removeBefore::object does not exist or is first in the list");
		} else {
			return nodeBefore(getNode(target)).item;
		}
	}

	// Internal Methods
	
	/**
	 *  For internal use only.
	 *  This method is only available within this class
	 *  Returns the node associated with a value. If the value is
	 *  not present in the list getNode returns null.
	 */
	protected Node getNode(Object value) {
		Node frontNode = front;
		Node result = null;
		while(frontNode != null) {
			if(frontNode.item.equals(value)) {
				result = frontNode;
				break;
			}
			frontNode = frontNode.next;
		}
		return result;
	}
	
	/**
	 *  For internal use only
	 *  Returns the node just before someNode. if someNode is null, or
	 *  the only node present in the list, this method will return null.
	 */
	protected Node nodeBefore(Node someNode) {
		if(someNode != null && someNode != front) {
			Node previous = front;
			while(previous.next != someNode) {
				previous = previous.next;
			}
			return previous;
		} else {
			return null;
		}
	}
	
	static public void main(String[] args) {
		
	}
}

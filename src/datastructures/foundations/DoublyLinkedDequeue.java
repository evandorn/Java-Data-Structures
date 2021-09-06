package datastructures.foundations;
import Java.util.*;
import Java.io.Serializable;

public class DoublyLinkedDequeue implements List {
    
    // Fields
    protected Node front, rear;
    protected int numberElements;
    
    // Commands
    
    /* Remove all objects from the Dequeue, if any */
    public void makeEmpty() {
        while(front != null) {
            Node previous = front;
            front = front.next;
            previous = null;
        }
        numberElements = 0;
        rear = null;
    }
    
 /* Add object at the front of the Dequeue */
    public void addFront(Object obj) {
        // Stubbed
    }
    
    public void addRear(Object obj) {
        // Stubbed
    }
    
    public void removeFront() {
        // Stubbed
    }
    
    public void removeRear() {
        // Stubbed
    }
    
    public boolean isEmpty() {
        // Stubbed
    }
    
    public int size() {
        return numberElements;
    }
    
    public Object Front() {
        // Stubbed
    }
    
    public Object rear() {
        // Stubbed
    }
    
    public boolean contains() {
        // Stubbed
    }
    
    public Iterator elements() {
        // Stubbed
    }
    /* Internal Node Module for DoublyLinkedDequeue*/
        protected class Node implements Serializable {
            protected Node(Object element, Node link, Node backLink) {
                item = element;
                next = link;
                before = backLink;
            }
        }
    
    public static void main(String[] args) {
        // Stubbed
    }
}

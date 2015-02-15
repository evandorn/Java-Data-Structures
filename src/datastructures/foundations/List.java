 /** Interface List - An interface to represent 
  *                   a list data structure in Java.
  *
  * Created: 1/12/15
  * @author evandorn
  */


package datastructures.foundations;
import java.util.*;

public interface List extends Container {

	// commands
	
	/**
	 * Add an object at the front of the list
	 */
	public void addFront(Object obj);
	
	/**
	 * Add an object at the back of the list
	 */
	public void addRear(Object obj);
	
	/**
	 * Remove an object from the front of the list if found
	 */
	public void removeFront();
	
	/**
	 * Remove an object from the back of the list if found
	 */
	public void removeRear();

	// Queries
	
	/**
	 * Return without removing the front object in the list
	 * Throw NoSuchElementException if the list is empty
	 */
	public Object front();
	
	/**
	 * Return without removing the rear object in the list
	 * Throw NoSuchElementException if the list is empty
	 */
	public Object rear();
	
	/**
	 * Returns true if the object is in the list
	 */
	public boolean contains(Object obj);
	
	/**
	 * Returns an iterator on the elements in the list 
	 */
	public Iterator elements();
}

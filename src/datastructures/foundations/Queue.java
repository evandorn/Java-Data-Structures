
/**
 * Queue Interface - A last-in first-out container
 *
 * Created: 1/12/15
 * @author evandorn
 */

package datastructures.foundations;

public interface Queue {

	// Commands
	
	/**
	 *  Add an object at the back of the queue
	 */
	public void add(Object obj);
	
	/**
	 *  Remove an object from the front of the queue
	 *  Throws NoSuchElementException if the queue is empty
	 */
	public void remove();
	
	// Queries
	
	/**
	 * Return the front object in the queue without removing it
	 * Throws NoSuchElementException if the queue is empty
	 */
	public Object getFront();
	
}

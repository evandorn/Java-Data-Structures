
/**
 * Interface Stack - A first-in last-out container
 *
 * Created: 1/12/15
 * @author evandorn
 */

package datastructures.foundations;

public interface Stack extends Container {
	
	// Commands
	
	/**
	 *  Add an object onto the top of the stack
	 */
	public void push(Object obj);
	
	/**
	 * Remove an object from the top of the stack
	 * Throw NoSuchElementException if stack is empty
	 */
	public void pop();
	
	// Queries
	
	/**
	 *  Return without removing, the top object on the stack
	 *  Throw NoSuchElementException if stack is empty
	 */
	public Object top();
}

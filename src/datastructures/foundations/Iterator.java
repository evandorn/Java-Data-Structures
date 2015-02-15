/** Interface Iterator
*/

package datastructures.foundations;

public interface Iterator {

	// commands
	
	/**
	 * Remove the last element returned by next()
	 * Use only once after a call to next()
	 */
	public void remove();
	
	// Queries
	
	/**
	 *  Return true if the container has an unvisited element 
	 */
	public boolean hasNext();
	
	/** Return next element in the container
	 *  Use only after hasNext() returns true
	 *  Throws NoSuchElementException if no more elements 
	 */
	public Object next ();
}

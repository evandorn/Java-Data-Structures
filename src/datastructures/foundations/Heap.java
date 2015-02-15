/**
 * Heap Interface
 * 
 * Created: 1/13/15
 * @author evandorn
 * 
 */

/**
 * Interface Heap - contained objects must implement Comparable
 * root contains minimum value.
 */

package datastructures.foundations;
import java.util.*;

public interface Heap extends Container {

	// Commands
	
	/** 
	 * Add obj to the heap, maintaining a heap 
	 */
	public void add (Comparable obj);
	
	/** 
	 * Remove top obj from the heap, maintaining a heap 
	 * throw NoSuchElementException if empty
	 */
	public void removeTop ();
	
	/**
	 * Sort the elements in the heap, maintaining a heap 
	 * use level-order heapsort algorithm
	 */
	public void sort ();
	
	// Queries
	
	/**
	 *  Return contents of the root - top of the heap 
	 *  throw NoSuchElementException if heap is empty 
	 */
	public Comparable top ();
	
	/** 
	 * Return a level-order iterator 
	 */
	public Iterator traverseLevels ();		
}

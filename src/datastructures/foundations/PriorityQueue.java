 /** 
  * Interface PriorityQueue
  *   Contained objects must implement Comparable
  */

package datastructures.foundations;
import java.util.*;

public interface PriorityQueue extends SearchTable {
	
	// Commands
	
	/**
	 * Add an Association as key-value pair; priority is key
	 */
	public void add(Comparable key, Object value);
	
	// Queries
	
	/**
	 * Return the object with highest priority
	 * Throw NoSuchElementException if priority queue is empty
	 */
	public Comparable highest();
	
	/**
	 * Return an iterator on the priorities
	 */
	public Iterator priorities();
}

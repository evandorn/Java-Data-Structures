 /** 
  * Interface SearchTable
  *   The elements in this container must be of type Comparable.
  *   Duplicates are allowed for contained objects.
  *   
  *   Created: 1/13/15
  *   @author - evandorn
  */

package datastructures.foundations;
import java.util.*;

public interface SearchTable extends Container {
	
	// Commands
	
	/** 
	 *  Add obj to the table; must be Comparable 
	 */
	public void add(Comparable obj);
	
	/**
	 *  Remove obj from table, if found 
	 */
	public void remove(Comparable obj);
	
	// Queries
	
	/**
	 *  Return true if the table contains obj
	 */
	public boolean contains(Comparable obj);
	
	/**
	 * Return obj if in table, else return null
     * useful when obj is a key & returns an Association
	 */
	public Comparable get(Comparable obj);
	
	/**
	 *  Return an iterator on all elements 
	 */
	public Iterator elements();
}

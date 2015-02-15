 /** Interface IndexableList
  *
  *  Created: 1/13/15
  *  @author evandorn
  *
  */

package datastructures.foundations;

public interface IndexableList extends List {

	// Commands
	
	/**
	 * Replace object at index with obj
	 * Throws ArrayIndexOutOfBoundsException if error
	 */
	public void insertAt(Object obj, int index);
	
	/** 
	 * Remove an object at specified index
	 * Throws ArrayIndexOutOfBoundsException if index error 
	 */
	public void removeAt (int index);
	
	// Queries
	
	/** 
	 *  Return the object at index without removing
	 *  Throws ArrayIndexOutOfBoundsException if index error 
	 */
	public Object elementAt (int index);
}

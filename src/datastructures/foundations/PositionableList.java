/** Interface PositionableList
 *  Objects in PositionableList must override equals() from Object
 *  
 *  Created: 1/13/15
 *  @author - evandorn
 */

package datastructures.foundations;

public interface PositionableList {

	// Commands
	
	/** 
	 *  Insert obj after target object in the list
	 *  Throw NoSuchElementException if target not in the list. 
	 */
	public void addAfter (Object obj, Object target);
	
	/** 
	 *  Insert obj before target object in the list
	 *  Throw NoSuchElementException if target not in the list. 
	 */
	public void addBefore (Object obj, Object target);
	
   /** 
    *  Delete object after target object in the list
	*  Throw NoSuchElementException if target not in the list.
	*  Throw NoSuchElementException if target is last in the list. 
	*/
	public void removeAfter (Object target);
	
	/** 
	 *  Delete object before target object in the list
	 *  Throw NoSuchElementException if target not in the list.
	 *  Throw NoSuchElementException if target is first in the list. 
	 */
	public void removeBefore (Object target);
	
	// Queries
	
   /** 
    *  Return object after target object in the list
	*  Throw NoSuchElementException if target not in the list.
	*  Throw NoSuchElementException if target is last in the list. 
	*/
	public Object elementAfter (Object target);
	
	/** 
	 *  Return object before target object in the list
	 *  Throw NoSuchElementException if target not in the list.
	 *  Throw NoSuchElementException if target is first in the list. 
	 */
	public Object elementBefore (Object target);
}

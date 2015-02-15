 /** Interface Dictionary
  *  
  *   A dictionary contains instances of Association: key-value pairs
  *   A class for a key must implement equals() from class Object
  *   
  *   Created: 1/13/15
  *   @author evandorn
  *   
  */

package datastructures.foundations;
import java.util.*;

public interface Dictionary extends Container {

	// Commands
	
	/**
	 * Add an association <key-value>
	 * If the key already exists, set its value
	 */
	public void addKey(Object key, Object value);
	
	/**
	 * Remove association with key if found
	 */
	public void removeKey(Object key);
	
	/**
	 * Change value for specified key
	 * Throw NoSuchElementException if key not found.
	 */
	public void changeValue(Object key, Object value);
	
	// Queries
	
	/**
	 * Return true if key is in dictionary
	 */
	public boolean containsKey(Object key);
	
	/**
	 * Return value for specified key
	 * Throw NoSuchElementException if key not found 
	 */
	public Object valueFor(Object key);
	
	/**
	 *  Return true is the dictionary contains value
	 */
	public boolean containsValue(Object value);
	
	/**
	 *  Return an iterator over the entries - Assocations
	 */
	public Iterator elements();
	
	/**
	 * Return an iterator over all the values
	 */
	public Iterator values();
}

/**
 * Set Interface
 * 
 * Created: 1/13/15
 * @author evandorn
 * 
 */

package datastructures.foundations;

public interface Set extends Container {
	
	// Commands
	
	/**
	 * Add obj to the set
	 */
	public void add(Object obj);
	
	/**
	 * Remove obj from the set
	 */
	public void remove(Object obj);
	
	// Queries
	
	/**
	 * Return the union of a receiver with s
	 */
	public Set union(Set s);
	
	/**
	 * Return the intersection of the receiver with s
	 */
	public Set intersection(Set s);
	
	/**
	 * Return the difference of receiver with s
	 */
	public Set difference(Set s);
	
	/**
	 * Return true if the receiver is a subset of s
	 */
	public boolean subset(Set s);
	
	/**
	 * Return true if obj is in the set
	 */
	public boolean contains(Object obj);
}

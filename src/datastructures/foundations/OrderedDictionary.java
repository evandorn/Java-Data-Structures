

package datastructures.foundations;

public interface OrderedDictionary extends SearchTable {
	
	// Commands
	
	/**
	 * Add an association <key-value>
	 */
	public void addKey (Comparable key, Object value);
	
	/**
	 * Changes value for specified key
     * Throw NoSuchElementException if key not found.
	 */
	public void changeValue(Comparable key, Object value);
	
	// Queries
	
	/** 
	 * Return true if key is in dictionary
	 */
	public boolean containsValue (Object value);
	
	/**
	 *  Return value for specified key
	 *  Throw NoSuchElementException if key not found 
	 */
	public Object valueFor (Comparable key);
	
	/**
	 * Return an iterator on the keys
	 */
	public Iterator keys();
	
	/**
	 * Return an iterator on the values
	 */
	public Iterator values();
}

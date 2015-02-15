package datastructures.foundations;

public interface Comparable {

	// Queries
	
	/**
	 * Return -1 if the receiver is less than the object
	 * 0 if the receiver equals the object
	 * 1 if the receiver is greater than the object
	 */
	public int compareTo(Object obj);
}
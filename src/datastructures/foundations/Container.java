
/**
 * Interface Container - A top level container
 *
 * Created: 1/12/15
 * @author evandorn
 */

package datastructures.foundations;
import java.io.Serializable;

public interface Container extends Serializable {

	// Commands - see subinterfaces
	
	/**
	 *  Remove all objects from the container if found
	 */
	public void makeEmpty();
	
	// Queries
	
	/**
	 *  Return true if the container is empty
	 */
	public boolean isEmpty();
	
	/**
	 *  Return the number of objects in the container
	 */
	public int size();
}

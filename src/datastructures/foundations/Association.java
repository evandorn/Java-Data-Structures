/** Class Association
*
*  An instance must initialize a key on creation.
*  If used as a comparable Association, keys must be comparable and
*  comparison is based on keys only.
*  Note that equals() does not enforce the comparable feature and
*  requires equality of both key and value.
*
* Created: 1/12/15
* @author evandorn
*/

package datastructures.foundations;
import java.io.Serializable;

public class Association extends Object 
						implements Comparable, Serializable {
	
	// Fields
	private Object key;
	private Object value;
	
	// Constructors
	
	/**
	 * Create an instance with specified key and null value
	 */
	public Association(Object key) {
		this.key = null;
	}
	
	/**
	 * Create an instance with specified key and value
	 */
	public Association(Object key, Object value) {
		this.key = key;
		this.value = value;
	}
	
	// Commands
	public void setValue(Object value) {
		this.value = value;
	}
	
	// Queries
	
	/**
	 * Return key
	 */
	public Object key() {
		return key;
	}
	
	/**
	 * Return value
	 */
	public Object value() {
		return value;
	}
	
	/**
	 * Return a String representation.
	 * Returns of the form <key:value>
	 */
	public String toString() {
		return " < " + key + ":" + value + " > ";
	}
	
	/**
	 * Override inherited Object method equals
	 */
	public boolean equals(Object obj) {
		if(obj instanceof Association) {
		      return (key.equals(((Association)obj).key)
		               && value.equals(((Association)obj).value));
		} else {
			return false;
		}
	}

	/**
	 * Implement Comparable method compareTo
	 * Compare based only on key; key must be of type Comparable
	 */
	public int compareTo(Object obj) {
		return ((Comparable)key).compareTo(((Association)obj).key());
	}
	
	/**
	 * Override inherited Object method hashCode()
	 * Return a unique int representing this object
	 */
	public int hashCode() {
		int keyBits = key.hashCode();
		int valueBits = value.hashCode();
		return (keyBits << 8) ^ (valueBits >> 8);
	}
}

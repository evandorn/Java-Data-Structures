/**
 * BinaryTree Interface
 * Contained objects must override equals() from Object
 * 
 * Created: 1/13/15
 * @author evandorn
 * 
 */

package datastructures.foundations;
import java.util.*;

public interface BinaryTree extends Container {
	
	// commands
	
	// Queries
	
	/**
	 *  Return an in-order iterator on elements in the tree 
	 */
	public Iterator traverseInorder();
	
	/** 
	 *  Return a preorder iterator on elements in the tree 
	 */
	public Iterator traversePreorder();
	
	/** 
	 *  Return a postorder iterator on elements in the tree 
	 */
	public Iterator traversePostorder();
	
	/** 
	 *  Return the maximum level in the tree, root is at level 1 
	 */
	public int maxLevel ();
	
	/** 
	 *  Return average path length for the tree 
	 */
	public double avgPathLength ();
}

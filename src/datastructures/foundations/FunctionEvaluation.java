/**
 *  Defines the methods needed to evaluate an algebraic expression
 *  represented as in infix String.
 *  
 *  Created: 1/14/15
 *  @author evandorn
 * 
 */

package datastructures.foundations;
import java.util.*;

public class FunctionEvaluation {
	
	// Fields
	private String infix, postfix;
	private Dictionary operands = new VectorDictionary();
	
	// Constructor
	public FunctionEvaluation(String infixExpression) {
		infix = infixExpression.trim().toLowerCase();
		infixToPostfix();
	}
	
	// Commands
	
	/*
	 * Converts infix producing postfix
	 */
	public void infixToPostfix() {
		int infixIndex;
		char ch, topSymbol;
		LinkedStack operationStack = new LinkedStack();
		postfix = "";
		for(infixIndex = 0; infixIndex < infix.length(); infixIndex++) {
			// Get Character from infix String
		ch = infix.charAt(infixIndex);
		if(ch == ' ') {		// Skip whitespace
		continue;			// Skip back to the bottom of the loop	
		}
		if(ch >= 'a' && ch <= 'z') {	// operand
			continue;
		}
		if (ch == '+' || ch == '-' || ch == '*' 
		   || ch == '/' || ch == '(' || ch == ')') {	 // operator
			if (operationStack.size() > 0) {
		        topSymbol = ((Character)operationStack.top()).charValue();
			}
		}
	  }
	}
}

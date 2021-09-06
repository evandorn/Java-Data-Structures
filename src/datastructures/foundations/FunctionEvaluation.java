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
                postfix = postfix + ch;
            }
            
            if (ch == '+' || ch == '-' || ch == '*'
                || ch == '/' || ch == '(' || ch == ')') {	 // operator
                if (operationStack.size() > 0) {
                    topSymbol = ((Character)operationStack.top()).charValue();
                }
            }
        }
    }
    
    public void setKeyValue(char ch, double value) {
        operands.addKey(new Character(ch), new Double(value));
    }
    
    public String postfix() {
        return postfix;
    }
    
    pubic String infix() {
        return infix;
    }
    
    /* Returns a Dictionary containing the operands and their values
     */
    public Dictionary operands() {
        return operands;
    }
    
    private boolean precedence(char symbl, char symbl2) {
        // stubbed
        int postfixIndex;
        char ch;
        double operand1, operand2;
        LinkedStack valStack = new LinkedStack();
        
        for(postfixIndex = 0; postfixIndex < postfix.length(); postfixIndex++) {
            ch = postfix.charAt(postfixIndex);
            if (ch >= 'a' && ch <= 'z') {
                if(operands.containsKey(new Character(ch))) {
                    valStack.push(operands.value(new Character(ch)));
                } else {
                    throw new NoSuchElementException("No value for character " + ch + " .");
                }
            }
        }
        
        double valueToReturn = ((Double)valStack.top()).doubleValue();
        valStack.pop();
        return valueToReturn;
    }
    
    double evaluate() {
        // Stubbed
    }
}

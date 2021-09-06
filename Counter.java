/*
 *  Implements a counter ADT
 */

public class Counter {
    
    // Fields
    protected int count;
    
    public void reset() {
        count = 0;
    }
    
    public void increment() {
        count += 1;
    }
    
    public int countValue() {
        return count;
    }
}

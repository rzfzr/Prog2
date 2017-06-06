
package stackoop;

/**
 *
 * @author rzfzr
 */
public class StackOOP {

    public static void main(String[] args) {
        
        
        Stack st1 = new Stack();
        
        
        Element<Integer> e1 = new Element<Integer>(10);
        
        st1.stackUp(e1);
        
        st1.printAll();
        
    }
    
}

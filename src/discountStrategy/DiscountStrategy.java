
package discountStrategy;

/**
 *
 * @author Mitch
 */
public interface DiscountStrategy {
    
    public abstract double getDiscountAmt(double unitPrice, int qty);
    
}

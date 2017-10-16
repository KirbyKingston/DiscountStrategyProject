
package discountStrategy;

/**
 *
 * @author Mitch
 */
public class NoDiscount implements DiscountStrategy {
    
//    public DiscountStrategy NoDiscount(double unitPrice, int qty){
//        return getDiscountAmt;
//    }

    @Override
    public final double getDiscountAmt(double unitPrice, int qty) {
        return unitPrice * qty;
    }
    
}

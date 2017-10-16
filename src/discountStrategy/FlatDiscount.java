
package discountStrategy;

/**
 *
 * @author Mitch
 */
public class FlatDiscount implements DiscountStrategy {
    
    public final static String REQUIRED_MSG = "This is an invalid discount rate.";
    
    private double flatDiscountAmount;
    
    public FlatDiscount(double flatDiscountAmount) {
        setFlatDiscountAmount(flatDiscountAmount);
    }
    
    public final double getFlatDiscountAmount() {
        return flatDiscountAmount;
    }

    public final void setFlatDiscountAmount(double flatDiscountAmount) {
        if (flatDiscountAmount < 0)
            throw new IllegalArgumentException(REQUIRED_MSG);
        this.flatDiscountAmount = flatDiscountAmount;
    }
    
    @Override
    public final double getDiscountAmt(double unitPrice, int qty) {
        return (unitPrice * qty) - flatDiscountAmount;
    }
}

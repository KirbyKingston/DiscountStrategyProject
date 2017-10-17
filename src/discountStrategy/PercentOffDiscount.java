
package discountStrategy;

/**
 *
 * @author Mitch
 */
public class PercentOffDiscount implements DiscountStrategy {
    
    public final static String REQUIRED_MSG = "This is an invalid discount rate.";
     
    private double percentOffDiscountRate = 0.20;

    public PercentOffDiscount(double percentOffDiscountRate) {
        setPercentOffDiscountRate(percentOffDiscountRate);
    }

    public final double getPercentOffDiscountRate() {
        return percentOffDiscountRate;
    }

    public final void setPercentOffDiscountRate(double percentOffDiscountRate) {
        if (percentOffDiscountRate < 0)
            throw new IllegalArgumentException(REQUIRED_MSG);
        this.percentOffDiscountRate = percentOffDiscountRate;
    }

    @Override
    public final double getDiscountAmt(double unitPrice, int qty) {
        return unitPrice * (1 - percentOffDiscountRate);
    }
    
    
}

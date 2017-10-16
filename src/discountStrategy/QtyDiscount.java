
package discountStrategy;

/**
 *
 * @author Mitch
 */
public class QtyDiscount implements DiscountStrategy {
    
    public final static String REQUIRED_MSG = "This is an invalid value.";
    
    private double qtyDiscountRate = .25;
    private int minQty = 3;
    
    public QtyDiscount(double qtyDiscountRate, int minQty) {
        setQtyDiscountRate(qtyDiscountRate);
        setMinQty(minQty);
    }

    @Override
    public final double getDiscountAmt(double unitPrice, int qty) {
        if (unitPrice <= 0 || qty <= 0) {
            throw new IllegalArgumentException(REQUIRED_MSG);
        }
        if (qty >= minQty) {
            return unitPrice * qty * qtyDiscountRate;
        }
        else {
            return 0;
        }
    }

    public final double getQtyDiscountRate() {
        return qtyDiscountRate;
    }

    public final void setQtyDiscountRate(double qtyDiscountRate) {
        if (qtyDiscountRate <= 0)
            throw new IllegalArgumentException(REQUIRED_MSG);
        this.qtyDiscountRate = qtyDiscountRate;
    }

    public final int getMinQty() {
        return minQty;
    }

    public final void setMinQty(int minQty) {
        if (minQty <= 0)
            throw new IllegalArgumentException(REQUIRED_MSG);
        this.minQty = minQty;
    }
    
}


package discountStrategy;

/**
 *
 * @author Mitch
 */
public class LineItem {
    
    public final static String REQUIRED_MSG = "This is an invalid value.";
    
   
    private Product product;
    private int qty;
    
    public LineItem(DataAccessStrategy receiptData, String productId, int qty){
        product = receiptData.findProduct(productId);
        setQty(qty);
    }
    
    public final String displayLineItem(){
        return (product.getProductDescription() + product.getUnitCost() + getDiscountAmt() + getDiscountAmtLineTotal() + getYouSavedLineTotal());
    }
    
    public final double getCostBeforeDiscount(){
        return product.getUnitCost();
    }
    
    public final double getCostBeforeDiscountLineTotal(){
        return product.getUnitCost() * qty;
    }
    
    public final double getDiscountAmt(){
        return product.getDiscountStrategy().getDiscountAmt(product.getUnitCost(), qty);
    }
    
     public final double getDiscountAmtLineTotal(){
        return getDiscountAmt() * qty;
    }
     
    public final double getYouSavedLineTotal(){
        return getCostBeforeDiscountLineTotal() - getDiscountAmtLineTotal();
    }

    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        if (qty <= 0 ){
            throw new IllegalArgumentException(REQUIRED_MSG);
        }
        this.qty = qty;
    }
    
}


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
        return ("|~" + product.getProductDescription() + " | Quantity: " + qty + "| Unit Price: " + product.getUnitCost() + "| Sale Price: " + getDiscountAmt());
    }
    
    public final double getCostBeforeDiscount(){
        return product.getUnitCost() * qty;
    }
    
    public final double getDiscountAmt(){
        return product.getDiscountStrategy().getDiscountAmt(product.getUnitCost(), qty);
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

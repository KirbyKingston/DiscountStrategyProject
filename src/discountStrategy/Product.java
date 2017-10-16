
package discountStrategy;

/**
 *
 * @author Mitch
 */
public class Product {
    
    public final static String REQUIRED_MSG = "This is a required field.";
    
    private String productId;
    private String productDescription;
    private double unitCost;
    
    private DiscountStrategy discountStrategy;
    

    public Product(String productId, String productDescription, double unitCost, DiscountStrategy discountStrategy) {
        setProductId(productId);
        setProductDescription(productDescription);
        setUnitCost(unitCost);
        setDiscountStrategy(discountStrategy);
    }
    

    public final String getProductId() {
        return productId;
    }

    public final void setProductId(String productId) {
        if(productId == null || productId.isEmpty()) {
            throw new IllegalArgumentException(REQUIRED_MSG);
        }
        this.productId = productId;
    }

    public final String getProductDescription() {
        return productDescription;
    }

    public final void setProductDescription(String productDescription) {
        if(productDescription == null || productDescription.isEmpty()) {
            throw new IllegalArgumentException(REQUIRED_MSG);
        }
        this.productDescription = productDescription;
    }

    public final double getUnitCost() {
        return unitCost;
    }

    public final void setUnitCost(double unitCost) {
        if (unitCost < 0)
            throw new IllegalArgumentException(REQUIRED_MSG);
        this.unitCost = unitCost;
    }
    
    public final DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public final void setDiscountStrategy(DiscountStrategy discountStrategy) {
        if (discountStrategy == null) {
            throw new IllegalArgumentException(REQUIRED_MSG);
        }
        this.discountStrategy = discountStrategy;
    }
    
}


package discountStrategy;

/**
 *
 * @author Mitch
 */
public interface DataAccessStrategy {
    
    public abstract Customer findCustomer(final String customerId);
    
    public abstract Product findProduct(final String productId);
    
}

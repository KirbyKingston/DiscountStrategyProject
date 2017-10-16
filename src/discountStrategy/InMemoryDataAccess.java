
package discountStrategy;

/**
 * This class provides a temporary solution to the question of where is the
 * long-time data stored. In a real application, a database would be used, 
 * however we can use other means of storage, such as in-memory or file system.
 * Here, we'll use the in-memory approach. But these variations are just
 * different data access strategies, aren't they? So we'll make this a
 * strategy object.
 * 
 * @author  Jim Lombardo
 * @version 1.00
 */
public class InMemoryDataAccess implements DataAccessStrategy {
    
    private Customer[] customers = {
        new Customer("100", "John Smith"),
        new Customer("200", "Sally Jones"),
        new Customer("300", "Bob Clementi")
    };
    
    
//    private Product[] products = {
//        new Product("A101", "MLB Brewer's Hat ", 19.95, new PercentOffDiscount(0.15)),
//        new Product("B205", "Men's Dress Shirt", 35.50, new QtyDiscount(.10,5)),
//        new Product("C222", "Women's Socks    ", 9.50, new NoDiscount())
//    };

    
    private Product[] products = {
        new Product("A101", "MLB Brewer's Hat ", 19.95, new PercentOffDiscount(0.15)),
        new Product("B205", "Men's Dress Shirt", 35.50, new PercentOffDiscount(0.15)),
        new Product("C222", "Women's Socks    ", 9.50, new NoDiscount())
    };
    
    /**
     * Tries to find a Customer by customer id.
     * @param customerId - must not be null or empty
     * @return found Customer or null if not found or bad argument
     */
    @Override
    public final Customer findCustomer(final String customerId) {
        // validation is needed for method parameter
        if(customerId == null || customerId.length() == 0) {
            System.out.println("Sorry, FakeDatabase.findCustomer method has "
                    + "illegal argument");
            return null;  // end method prematurely after log to console
        }
        
        Customer customer = null;
        for(Customer c : customers) {
            if(customerId.equals(c.getCustomerId())) {
                customer = c;
                break;
            }
        }
        
        return customer;
    }
    
    /**
     * Tries to find a Product by product id.
     * @param productId- must not be null or empty
     * @return found Product or null if not found or bad argument
     */
    @Override
    public final Product findProduct(final String productId) {
        // validation is needed for method parameter
        if(productId == null || productId.length() == 0) {
            System.out.println("Sorry, FakeDatabase.findProduct method has "
                    + "illegal argument");
            return null;  // end method prematurely after log to console
        }
        
        Product product = null;
        for(Product p : products) {
            if(productId.equals(p.getProductId())) {
                product = p;
                break;
            }
        }
        
        return product;
    }
}

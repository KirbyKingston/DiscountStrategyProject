
package discountStrategy;

/**
 *
 * @author Mitch
 */
public class Customer {
    
    public final static String REQUIRED_MSG = "This is a required field.";
    
    private String customerId;
    private String customerName;

    public Customer(String customerId, String customerName) {
        setCustomerId(customerId);
        setCustomerName(customerName);
    }
    
    public final String getCustomerId() {
        return customerId;
    }

    public final void setCustomerId(String customerId) {
        if(customerId == null || customerId.isEmpty()) {
            throw new IllegalArgumentException(REQUIRED_MSG);
        }
        this.customerId = customerId;
    }

    public final String getCustomerName() {
        return customerName;
    }

    public final void setCustomerName(String customerName) {
        if(customerName == null || customerName.isEmpty()) {
            throw new IllegalArgumentException(REQUIRED_MSG);
        }
        this.customerName = customerName;
    }
   
    
}

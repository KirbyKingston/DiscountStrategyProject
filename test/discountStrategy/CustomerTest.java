
package discountStrategy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mitch
 */
public class CustomerTest {
    
    private Customer customer;
    
    public CustomerTest() {
    }
    
    @Before
    public void setUp() {
        customer = new Customer("400", "Tom Harris");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCustomerId method, of class Customer.
     */
    @Test
    public void testGetCustomerId() {
        Customer instance = customer;
        String expResult = "400";
        String result = instance.getCustomerId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCustomerId method, of class Customer.
     */
    @Test
    public void testSetCustomerId() {
        String customerId = "500";
        Customer instance = customer;
        instance.setCustomerId(customerId);
        
    }

    /**
     * Test of getCustomerName method, of class Customer.
     */
    @Test
    public void testGetCustomerName() {
        Customer instance = customer;
        String expResult = "Tom Harris";
        String result = instance.getCustomerName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCustomerName method, of class Customer.
     */
    @Test
    public void testSetCustomerName() {
        String customerName = "Jim Brown";
        Customer instance = customer;
        instance.setCustomerName(customerName);
        
    }
    
    
}


package discountStrategy;

/**
 *
 * @author Mitch
 */
public interface ReceiptOutputStrategy {

    public abstract void outputReceiptHeader(final int receiptId, final String customerId, final String customerName);
    
    public abstract void outputReceiptBody(final String receiptBodyContent);
    
    public abstract void outputReceiptFooter();

}

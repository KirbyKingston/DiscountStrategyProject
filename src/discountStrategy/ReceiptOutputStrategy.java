
package discountStrategy;

/**
 *
 * @author Mitch
 */
public interface ReceiptOutputStrategy extends SaleDetailStrategy{

    public abstract void outputReceiptHeader(final int receiptId, final String customerId, final String customerName);
    
    @Override
    public abstract void outputReceiptBody(final String receiptBodyContent);
    
    public abstract void outputReceiptFooter();

}


package discountStrategy;

/**
 *
 * @author Mitch
 */
public interface PosEntryStrategy {
    
    public abstract void startNewSale(String customerId, DataAccessStrategy dataStrategy, ReceiptOutputStrategy consoleOutPut, ReceiptOutputStrategy GuiOutPut);
    
    public abstract void endSaleDisplayReceipt();
    
}

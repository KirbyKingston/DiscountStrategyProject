
package discountStrategy;

/**
 *
 * @author Mitch
 */
public class PosEntryTerminal implements PosEntryStrategy{
    
    public final static String REQUIRED_MSG = "This is a required field.";
    
    private Receipt receipt;
    private DataAccessStrategy dataStrategy;
    private ReceiptOutputStrategy consoleOut;
    private ReceiptOutputStrategy guiOut;
    
    public PosEntryTerminal(){
        setDataStrategy(dataStrategy);
    }

    @Override
    public final void startNewSale(String customerId, DataAccessStrategy dataStrategy, ReceiptOutputStrategy consoleOut, ReceiptOutputStrategy guiOut){
        receipt = new Receipt(customerId, dataStrategy, consoleOut, guiOut);
    }
    
    public final void addProductToSale(final String productId, final int qty)throws IllegalArgumentException{
        if(productId == null || productId.length() == 0 || qty < 1) {
            throw new PosEntryError();
        }
        receipt.addLineItem(productId, qty);
    }
    
    @Override
    public final void endSaleDisplayReceipt(){
        receipt.displayConsoleReceipt();
        receipt.displayGuiReceipt();
    }

    public final DataAccessStrategy getDataStrategy() {
        return dataStrategy;
    }

    public final void setDataStrategy(DataAccessStrategy dataStrategy) {
        this.dataStrategy = dataStrategy;
    }
    
     public final ReceiptOutputStrategy getConsoleOut() {
        return consoleOut;
    }

    public final void setConsoleOut(ReceiptOutputStrategy consoleOut) {
        if(consoleOut == null) {
            throw new PosEntryError();
        }
        this.consoleOut = consoleOut;
    }

    public final ReceiptOutputStrategy getGuiOut() {
        return guiOut;
    }

    public final void setGuiOut(ReceiptOutputStrategy guiOut) {
        if(guiOut == null) {
            throw new IllegalArgumentException(REQUIRED_MSG);
        }
        this.guiOut = guiOut;
    }
}


package discountStrategy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;  
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Mitch
 */
public class Receipt {
   
    public final static String REQUIRED_MSG = "This is a required field.";
    
    private static int receiptId = 0;
    private Customer customer;
    private DataAccessStrategy receiptData;
    private LineItem[] lineItems;
    private ReceiptOutputStrategy consoleOut;
    private ReceiptOutputStrategy guiOut;
    
    public Receipt(String customerId, DataAccessStrategy receiptData, ReceiptOutputStrategy consoleOut, ReceiptOutputStrategy guiOut) {
        setReceiptData(receiptData);
        setConsoleOut(consoleOut);
        setGuiOut(guiOut);
        customer = receiptData.findCustomer(customerId);
        lineItems = new LineItem[0];
        receiptId++;
    }
   
    public final double getStandardTotal(){
        double total=0.0;
        for (LineItem item : lineItems){
            total += item.getCostBeforeDiscount();
        }
        return total;
    }
    
    public final double getDiscountTotal(){
        double total=0.0;
        for (LineItem item : lineItems){
            total += item.getDiscountAmt();
        }
        return total;
    }
    
    public final void addLineItem(final String productId, final int qty){
        LineItem entryItem = new LineItem(receiptData, productId, qty);
        addToArray(entryItem);
    }
    
    private void addToArray(final LineItem entryItem) {
        if (entryItem == null){
            throw new IllegalArgumentException(REQUIRED_MSG);
        }
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = entryItem;
        lineItems = tempItems;
    }
    
    public final String getTransactionTime(){
        return new SimpleDateFormat("MM/dd/yyyy hh:mma").format(Calendar.getInstance().getTime());
    }
    
    
    public final void displayReceipt(){
        
        consoleOut.outputReceiptHeader(receiptId, customer.getCustomerId(), customer.getCustomerName() + " " + getTransactionTime());
        
        for (int i = 0; i < lineItems.length; i++){
            consoleOut.outputReceiptBody(lineItems[i].displayLineItem());
        }
        consoleOut.outputReceiptFooter();
    }
    
    public final int getReceiptId() {
        return receiptId;
    }

    public final void setReceiptId(int receiptId) {
        if(receiptId <= 0 ) {
            throw new IllegalArgumentException(REQUIRED_MSG);
        }
        Receipt.receiptId = receiptId;
    }

    public final ReceiptOutputStrategy getConsoleOut() {
        return consoleOut;
    }

    public final void setConsoleOut(ReceiptOutputStrategy consoleOut) {
        if(consoleOut == null) {
            throw new IllegalArgumentException(REQUIRED_MSG);
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

    public final DataAccessStrategy getReceiptData() {
        return receiptData;
    }

    public final void setReceiptData(DataAccessStrategy receiptData) {
        if(receiptData == null) {
            throw new IllegalArgumentException(REQUIRED_MSG);
        }
        this.receiptData = receiptData;
    }
            
    
}

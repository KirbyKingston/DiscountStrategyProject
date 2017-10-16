
package discountStrategy;

/**
 *
 * @author Mitch
 */
public class Startup {
    
    public static void main(String[] args) {
    
    PosEntryTerminal pos = new PosEntryTerminal();
    DataAccessStrategy db = new InMemoryDataAccess();
    ReceiptOutputStrategy consoleOutput = new consoleReceiptOutput();
    ReceiptOutputStrategy guiOutput = new guiReceiptOutput();
    
   
        
    pos.startNewSale("100", db, consoleOutput, guiOutput);
    pos.addProductToSale("B205", 2);
    pos.addProductToSale("B205", 2);
    pos.addProductToSale("B205", 2);
    pos.endSaleDisplayReceipt();
    
    pos.startNewSale("200", db, consoleOutput, guiOutput);
    pos.addProductToSale("B205", 2);
    pos.addProductToSale("B205", 2);
    pos.addProductToSale("B205", 2);
    pos.endSaleDisplayReceipt();
    
    pos.startNewSale("300", db, consoleOutput, guiOutput);
    pos.addProductToSale("B205", 2);
    pos.addProductToSale("B205", 2);
    pos.addProductToSale("B205", 2);
    pos.endSaleDisplayReceipt();
    
    }
    
}

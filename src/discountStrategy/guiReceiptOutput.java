
package discountStrategy;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mitch
 */
public class guiReceiptOutput implements ReceiptOutputStrategy {

    @Override
    public final void outputReceiptHeader(int receiptId, String customerId, String customerName) {
       
        JOptionPane.showMessageDialog( null, receiptId + customerId + customerName);
        
    }

    @Override
    public final void outputReceiptBody(String receiptBodyContent) {
        try{
        JOptionPane.showMessageDialog( null, receiptBodyContent);
        }catch(IllegalArgumentException iae) {
        JOptionPane.showMessageDialog(null, iae.getMessage());
    }
    }

    @Override
    public final void outputReceiptFooter() {
        JOptionPane.showMessageDialog( null, "Sign up for extra savings with a Kohl's card today!");
        System.exit(0);
    }
    
}

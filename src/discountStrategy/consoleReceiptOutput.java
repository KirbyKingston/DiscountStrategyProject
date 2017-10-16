
package discountStrategy;

/**
 *
 * @author Mitch
 */
public class consoleReceiptOutput implements ReceiptOutputStrategy{
    
    

    @Override
    public final void outputReceiptHeader(int receiptId, String customerId, String customerName) {
        System.out.println("_____________________________________________________________________________");
        System.out.println("|                                                                            ");
        System.out.println("|                        Thank you for Shopping At                           ");
        System.out.println("|                                Not A Fake                                  ");
        System.out.println("|                                  KOHLS                                     ");
        System.out.println("|                                                                            ");
        System.out.println("|                          555 A Very Real Street                            ");
        System.out.println("|                            For Real, WI 12345                              ");
        System.out.println("|                                                                            ");
        System.out.println("|                                                                            ");
        System.out.println("|                                                                            ");
        System.out.println("|    Receipt#" + receiptId);
        
        System.out.println("|    Customer: " + customerName);
        System.out.println("|                                                                            ");
        System.out.println("|                                                                            ");
    }

    @Override
    public final void outputReceiptBody(String receiptBodyContent) {
        System.out.println("|  " + receiptBodyContent);
    }

    @Override
    public final void outputReceiptFooter() {
        System.out.println("|                                                                            ");
        System.out.println("|                                                                            ");
        System.out.println("|                                                                            ");
        System.out.println("|____________________________________________________________________________");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    
}

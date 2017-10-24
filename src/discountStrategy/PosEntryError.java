
package discountStrategy;

/**
 *
 * @author Mitch
 */
public class PosEntryError extends IllegalArgumentException {
    
    private static String MSG = "Improper Sale Item Entry Error";

    public PosEntryError() {
        super(MSG);
    }

    public PosEntryError(String s) {
        super(MSG);
    }

    public PosEntryError(String message, Throwable cause) {
        super(MSG, cause);
    }

    public PosEntryError(Throwable cause) {
        super(cause);
    }
    
}

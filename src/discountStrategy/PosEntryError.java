/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduler;

public class InvalidTimeException extends Exception{

    /**
     * Creates a new instance of InvalidTimeException
     * @param reason
     */
    public InvalidTimeException(String reason) {
        super(reason);
    }

}

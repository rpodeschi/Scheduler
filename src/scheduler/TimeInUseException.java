/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduler;

public class TimeInUseException extends Exception{

    public TimeInUseException(String reason)
    {
        super(reason);
    
    }
}

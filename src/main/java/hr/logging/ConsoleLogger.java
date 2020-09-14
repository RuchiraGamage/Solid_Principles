package hr.logging;

/**
 * Created by Ruchira on 9/14/2020.
 */
public class ConsoleLogger {
    public void writeInfo(String msg) {
        System.out.println("Info : " + msg);
    }

    public void writeError(String msg, Exception e) {
        System.out.println("Error message is : " + msg + " ; " + e);
    }
}

package Exercise2;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @author Tobias Jacobsen
 */
public class Main {

    public static void main(String[] args) {
        Even even = new Even();
        Runnable1 runnable = new Runnable1(even);
        Runnable1 runnable2 = new Runnable1(even);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable2);
        t1.start();
        t2.start();
    }

}

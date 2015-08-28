package Exercise2;

/**
 * @author Tobias Jacobsen
 */
public class RunThis {

    public static void main(String[] args) {
        Even even = new Even();
        Thread1 runnable = new Thread1(even);
        Thread1 runnable2 = new Thread1(even);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable2);
        t1.start();
        t2.start();
    }

}

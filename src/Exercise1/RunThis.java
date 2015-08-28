package Exercise1;

/**
 * @author Tobias Jacobsen
 */
public class RunThis {

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();
        Thread2 thread2 = new Thread2();
        thread2.start();
        Thread3 thread3 = new Thread3();
        thread3.start();

        //Put main thread to sleep for 10 seconds
        //When done, set boolean in Thread3 to true
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            System.out.println("Main thread count interrupted");
        }
        Thread3.isFinished = true;
    }

}

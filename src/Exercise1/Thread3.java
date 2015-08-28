package Exercise1;

/**
 * @author Tobias Jacobsen
 *
 * Print all numbers from 10 and up. Pause for 3 seconds between each print.
 */
public class Thread3 extends Thread {

    public static boolean isFinished = false;

    @Override
    public void run() {
        for (int i = 10; i < 100; i++) {
            //if boolean is set to true from main thread, 
            //then break out of for-loop, to stop counting
            if (isFinished) {
                break;
            }
            System.out.println("Thread 3: " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                System.out.println("Thread 3 interrupted");
            }
        }
    }
}

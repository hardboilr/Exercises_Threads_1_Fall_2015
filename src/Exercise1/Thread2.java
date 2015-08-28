package Exercise1;

/**
 * @author Tobias Jacobsen
 *
 * Print the numbers from 1 to 5. Pause for 2 seconds between each print.
 */
public class Thread2 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 2: " + i);
            try {
                Thread.sleep(2000); //milliseconds
            } catch (InterruptedException ex) {
                System.out.println("Thread 2 interrupted");
            }
        }
    }
}

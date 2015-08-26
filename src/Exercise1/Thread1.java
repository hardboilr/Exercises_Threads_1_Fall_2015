package Exercise1;

/**
 * @author Tobias Jacobsen
 *
 * Compute and print the sum of all numbers from 1 to 1 billion
 */
public class Thread1 extends Thread {

    @Override
    public void run() {
        long j = 0;
        for (long i = 1; i <= 1000000000; i++) {
            j = j + i;
        }
        System.out.println("Thread 1: " + j);
    }
}

package Exercise2;

/**
 * @author Tobias Jacobsen
 */
public class Runnable1 implements Runnable {

    private Even even;

    public Runnable1(Even even) {
        this.even = even;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            int j = even.next();
            if (j % 2 != 0) {
                System.out.println("Uneven found!: " + j);
            }
        }
    }
}

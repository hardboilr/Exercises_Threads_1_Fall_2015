package Exercise2;

/**
 * @author Tobias Jacobsen
 */
public class Even {

    private int n = 0;

    //synchronized method ensures that only one 
    //thread has access to method at any given time
    public synchronized int next() {
        n++;
        n++;
        return n;
    }
}

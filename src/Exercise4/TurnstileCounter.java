package Exercise4;

import java.util.concurrent.locks.ReentrantLock;

public class TurnstileCounter {

    private final ReentrantLock lock = new ReentrantLock(); //----> Lock object!

    static final long DELAY_VAL = 10000;
    long count = 0;

    public long getValue() {
        return count;
    }

    public /*synchronized*/ void incr() { //----> synchronized method
        lock.lock(); //----> lock
        try {
            
            count++;
        } finally {
            lock.unlock(); //----> unlocked
        }
    }
}

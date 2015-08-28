package Exercise5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// NOT THREADSAFE
public class BankAccountUnsynchronized {

    private double balance;
    private Lock lock = new ReentrantLock();

    public BankAccountUnsynchronized() {
        balance = 0;
    }

    public /*synchronized*/ void deposit(double amount) { //---> synchronized method
        lock.lock(); // ----> lock
        balance += amount;
        lock.unlock(); // ----> unlock
    }

    public /*synchronized*/ void withdraw(double amount) { //---> synchronized method
        lock.lock(); // ---> lock
        balance -= amount;
        lock.unlock(); // ----> unlock
    }

    public double getBalance() {
        return balance;
    }
}

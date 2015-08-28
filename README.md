#Exercise 1
Refer to code

#Exercise 2
The operation "n++" is in fact a three-way process: Read, modify and write. When two or more threads execute the operation simultaneously they interleave. 
Example: n = 0. t1 and t2 read the value as 0. They both increment the value with 1, so n = 1. Then n = 1 is written, with either thread overwriting the other one.
Two operations of n++ should have resulted in n = 2, but is n = 1.

This problem, in this particular instance, is relatively uncommon in the sense that it will not occur in every single case of running the program. 
It is therefore important to either make sure to handle this problem (synchronization) or to test (jUnit) systematically, if possible.

#Exercise 3
The problem is that, once the start-button is pressed, the main thread will be busy running the move()-method inside the while-loop in the run-method. 
The solution is to create a new thread for each ball that is spawned when pressing the start-button. 
This will free up the main thread, and the GUI will become responsive again.

#Exercise 4
OBS: 
1) Traditional synchronization -> currently uncommented
2) AtomicInteger -> currently uncommented
3) java.util.concurrent.locks.ReentrantLock -> currently implemented

#Exercise 5
Identify places in the code where it "goes wrong" ->
The variable "balance" is modified by multiple threads in an incontrollable manner. The problem discussed in exercise 2 applies here as well. 
What should the closing balance be? ->
The closing balance should be 0, because we run the deposit and withdraw the same number of times with the same amount.

OBS. 
1) Traditional synchronization -> currently uncommented
2) java.util.concurrent.locks.ReentrantLock -> currently implemented

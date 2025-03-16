/*
Multithreading is a technique in Java that allows multiple tasks (threads) to run simultaneously within a program. It improves performance by utilizing CPU 
efficiently, making applications more responsive and faster. 
Key Concepts 
• Thread: The smallest unit of execution in a program. 
• Multithreading: Running multiple threads in parallel. 
• Concurrency: Executing multiple tasks at the same time. 
• Parallelism: Executing tasks on multiple CPU cores simultaneously. 

Java provides two ways to create threads: 
1. Extending Thread class 
2. Implementing Runnable interface 
 */

// Creating a thread by implementing Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Main class
public class multithreading {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "Thread A");
        Thread t2 = new Thread(new MyRunnable(), "Thread B");

        t1.start();
        t2.start();
    }
}


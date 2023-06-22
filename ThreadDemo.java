/*
 *  1.Create a class MyThread derived from Thread class and override the run method. 
 *    Create a class ThreadDemo having main method.  Create 2 objects of MyThread class and 
 *    observe the behavior of threads
 */

package MultiThreading;

class MyThread extends Thread {
    MyThread(String ThreadName) {
        super(ThreadName);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            String currentthread = Thread.currentThread().getName();
            System.out.println("Thread Name = " + currentthread);
        }
    }

}

public class ThreadDemo {
    public static void main(String [] args){
        String currentthread = Thread.currentThread().getName();
        System.out.println(currentthread);
        MyThread mt1 = new MyThread("Thread 1");
        mt1.start();
        MyThread mt2 = new MyThread("Thread 2");
        mt2.start();
    }
}

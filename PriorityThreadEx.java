/*
 *  3.     Assign different priorities to the 2 threads and observe the behaviour
 */
class MyThread extends Thread{
    MyThread(String Threadname){
        super(Threadname);
    }
    
    public void run(){
        String currentthread = Thread.currentThread().getName();
        System.out.println("Thread Name = " +currentthread + " and Priority = " + Thread.currentThread().getPriority());
    }
}
public class PriorityThreadEx {
    public static void main(String[] args) {
       System.out.println(Thread.currentThread().getName());
       MyThread t1 = new MyThread("Thread 1");
       t1.setPriority(9);
       MyThread t2 = new MyThread("Thread 2");
       t2.setPriority(8);
       MyThread t3 = new MyThread("Thread 3");
       t1.start();
       t2.start(); 
       t3.start();
    }
}

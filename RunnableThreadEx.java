/*
 *  1.  Create a class MyThread derived from Thread class and override the run method. 
        Create a class ThreadDemo having main method.  Create 2 objects of MyThread class and 
        observe the behavior of threads

    2.  Modify the above to create MyThread class by implementing Runnable interface and 
        observe the behavior of threads
 */

class MyThread implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i =0;i<5;i++){
            String currentname = Thread.currentThread().getName();
            System.out.println(currentname);
        }
    }

}

public class RunnableThreadEx {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        Thread t1 = new Thread(mt1, "MyThread 1");
        Thread t2 = new Thread(mt2, "MyThread 2");
        t1.start();
        t2.start();
    }
}

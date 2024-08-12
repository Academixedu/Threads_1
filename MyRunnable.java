
// implement Runnable and Post The Sub Class Object in to Thread and run the Logic to print Threadname for 10 times

public class MyRunnable implements Runnable {
    @Override
    public void run() {
       
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}



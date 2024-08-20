public class Create1 implements Runnable{
// implement Runnable and Post The Sub Class Object in to Thread and run the Logic to print Threadname for 10 times
@Override
    public synchronized void run() {
        for(int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName());
}
}
public static void main(String[] args) {
    Create1 d = new Create1();
    Thread t = new Thread(d);
    t.start();
    Thread t1 = new Thread(d);
    t1.start();
}
}

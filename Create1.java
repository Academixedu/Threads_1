public class Create1 implements Runnable{

// implement Runnable and Post The Sub Class Object in to Thread and run the Logic to print Threadname for 10 times
public void run(){
    for(int i=0;i<10;i++){
        System.out.println(Thread.currentThread().getName());
    }
}
public static void main(String[] args) {
    Create1 c1=new Create1();
    Thread t1=new Thread(c1);
    t1.start();
}
}

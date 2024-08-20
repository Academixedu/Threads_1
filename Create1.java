public class Create1 implements Runnable{
// implement Runnable and Post The Sub Class Object in to Thread and run the Logic to print Threadname for 10 times
public void run(){
    for(int i=1;i<=10;i++){
    System.out.println("name of thread is: "+Thread.currentThread().getName());
}
}
public static void main(String[] args) {
    Create1 ct=new Create1();
    Thread t=new Thread(ct);
    t.start();
}
}

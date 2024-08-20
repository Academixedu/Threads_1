public class Create1 implements Runnable{
// implement Runnable and Post The Sub Class Object in to Thread and run the Logic to print Threadname for 10 times
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i+"thread name is :"+Thread.currentThread().getName());
        }
    }
public static void main(String[] args) {
    Create1 cr = new Create1();
    Thread Th = new Thread(cr);
    Th.start();

}
}

public class Create1 implements Runnable{
// implement Runnable and Post The Sub Class Object in to Thread and run the Logic to print Threadname for 10 times
@Override
    public  void run(){
        for(int i=0;i<=10;i++){
            System.out.println("run "  +i+ " "  +Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        Create1 r1=new Create1();
        Thread t=new Thread(r1);
        Thread t2=new Thread(r1);
        t.start();
        t2.start();

    }
}

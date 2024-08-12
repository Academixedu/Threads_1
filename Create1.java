public class Create1 implements Runnable{

    @Override
    public void run() 
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
// implement Runnable and Post The Sub Class Object in to Thread and run the Logic to print Threadname for 10 times

    public static void main(String[] args)
    {
        Create1 t=new Create1();
        Thread t1=new Thread(t);
        t1.start();
    }
}

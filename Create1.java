public class Create1 
{
// implement Runnable and Post The Sub Class Object in to Thread and run the Logic to print Threadname for 10 times
public static class Task implements Runnable
{ 
    
    public void run()
    {
        for (int i=0;i<10;i++)
        {
            System.out.println("Thread Name : "+Thread.currentThread().getName());
        }
    }
}
public static void main(String[] args) {
    Runnable task =new Task();
   Thread t=new Thread(task);
   t.start();
//    t.sleep(200);

}
}

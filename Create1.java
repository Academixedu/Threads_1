public class Create1 implements Runnable
{
 // implement Runnable and Post The Sub Class Object in to Thread and run the Logic to print Threadname for 10 times
 public void run()
 {
    for(int i=1;i<10;i++)
    {
        System.out.println(Thread.currentThread().getName()+" "+i);
    }

 }
 public static void main(String[] args) 
 {
    Create1 k =new Create1();
    Thread x =new Thread(k);
    x.start();
 }
}

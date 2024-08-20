
public class Create1{
    // implement Runnable and Post The Sub Class Object in to Thread and run the Logic to print Threadname for 10 times
    public class Create1 implements Runnable
    {
     
     public void run()
     {
        for(int i=1;i<10;i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    
     }
     public static void main(String[] args) 
     {
        Create1 R1 =new Create1();
        Thread P =new Thread(R1);
        Thread.start();
     }
    }
}

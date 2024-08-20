public class Create extends Thread
{
// Prepare a Logic to print Thread name  for 10 times using Thread Concept
public void run()
{
    for (int i=0;i<10;i++)
    {
        System.out.println("Thread Name : "+Thread.currentThread().getName());
        
    }

}
public static void main(String[] args) {
    Create thread=new Create();
    thread.start();
}
}

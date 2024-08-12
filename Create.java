public class Create extends Thread{
// Prepare a Logic to print Thread name  for 10 times using Thread Concept

    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("hello thred how are you");
        }
    }

    public static void main(String[] args) {

        Create t1 = new Create();

        t1.start();
        System.out.println("hello thred is printing 10 times");
    }
}

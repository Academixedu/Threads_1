public class Create extends Thread{
// Prepare a Logic to print Thread name  for 10 times using Thread Concept
@Override
public void run(){
    for(int i=0 ;i<=10;i++)
    {
        System.out.println(Thread.currentThread().getName()+" "+i);
    }
}

public static void main(String[] args) {
    Create c = new Create();
    c.start();
}
}

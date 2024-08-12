public class Create extends Thread{

    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {

        Create t1 = new Create();
        t1.start();

       
    }
// Prepare a Logic to print Thread name  for 10 times using Thread Concept
}

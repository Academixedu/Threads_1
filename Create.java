 public class Create extends Thread{
    // Prepare a Logic to print Thread name  for 10 times using Thread Concept
    public void run(){
        for(int i=1;i<=10;i++){
        System.out.println("Thread"+i);
        }
    }
    public static void main(String[] args) {
        Create c1=new Create();
        c1.start();
          }
    }
    

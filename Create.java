public class Create extends Thread{
    // Prepare a Logic to print Thread name  for 10 times using Thread Concept
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("thread name :"+Thread.currentThread().getName());
        }
    }
    public static void main(String[]args){
        Create cr = new Create();
        cr.start();
    
    }
    }
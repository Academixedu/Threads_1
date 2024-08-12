public class Create1 implements Runnable {

       @Override
    public void run() {
       
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
          
        }
    }

    public static void main(String[] args) {
        
        Create1 runnableInstance = new Create1();

        Thread thread = new Thread(runnableInstance);

        
        thread.setName("Reddy");

       
        thread.start();
    }
}

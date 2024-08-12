
public class Create1 implements Runnable {
    // implement Runnable and Post The Sub Class Object in to Thread and run the Logic to print Threadname for 10 times
   
        @Override
        public void run() {
            // Print the thread name 10 times
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()); // getName() returns the thread's name
            }
        }
    
        public static void main(String[] args) {
            // Create an instance of the Create1 class
            Create1 create1 = new Create1();
    
            // Create a Thread object and pass the create1 object to it
            Thread thread = new Thread(create1);
    
            // Start the thread
            thread.start();
        }
    }

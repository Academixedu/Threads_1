public class Main1 {
   
        public static void main(String[] args) {  
            MyRunnable myRunnable = new MyRunnable();
            Thread thread = new Thread(myRunnable);
            thread.setName("MyThread");
            thread.start();
        }
    }
    
    
    

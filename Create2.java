public class Create2 {
    public static void main(String[] args) {
        
        Thread thread = new Thread() {
            @Override
            public void run() {
                
                for (int i = 1; i <= 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " - " + i);
                  
                }
            }
        };

       
        thread.setName("AT");

        thread.start();
    }
}

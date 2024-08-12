public class Create2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running succesfully.");
            }
        });

        
        thread.start();
    }
}

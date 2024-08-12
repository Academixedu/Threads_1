public class Create2 {
    public static void main(String[] args) {
        // Create a Thread object and override the run() method using an anonymous class
        Thread thread = new Thread() {
            @Override
            public void run() {
                // Print the thread name 10 times
                for (int i = 0; i < 10; i++) {
                    System.out.println(getName()); // getName() returns the thread's name
                }
            }
        };

        // Start the thread
        thread.start();
    }
}

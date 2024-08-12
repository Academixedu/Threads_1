public class Create extends Thread {
    @Override
    public void run() {
        // Print the thread name 10 times
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()); // getName() returns the thread's name
        }
    }

    public static void main(String[] args) {
        // Create a new thread
        Create thread = new Create();
        // Start the thread
        thread.start();
    }
}
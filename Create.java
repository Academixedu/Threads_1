public class Create extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        Create thread = new Create();
        thread.setName("Thread");
        thread.start();
    }
}
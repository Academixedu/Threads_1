public class Create1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        Create1 create1 = new Create1();
        Thread thread = new Thread(create1);
        thread.setName("Thread1");
        thread.start();
    }
}